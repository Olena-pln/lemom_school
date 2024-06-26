import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.Assert;


public class DarkThemeTest {

    @Test
    public void switcherStatusTest() {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        // Accept cookies
        if (!driver.findElements(By.xpath("//button[@id='L2AGLb']")).isEmpty()) {
            driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        }
        // Settings
        driver.findElement(By.xpath("//div[@jsname='LgbsSe']")).click();
        // Search settings
        driver.findElements(By.xpath("//div[@jsname='ibnC6b']")).getFirst().click();
        // Other settings
        driver.findElement(By.xpath("//span[@class='OPuSkc z1asCe DET5Lc']")).click();
        // Dark theme switcher
        WebElement darkThemeSwitcher = driver.findElement(By.xpath("//div[@jscontroller='SozS2' and @class='lnnMGf' and @data-froc='1']//span[@jsname='jOfkMb']"));

        String expectedValueForDarkThemeSwitcher = "Откл.";
        Assert.assertEquals(darkThemeSwitcher.getText(), expectedValueForDarkThemeSwitcher);
        driver.quit();
    }
}
