import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DarkThemeTest {

    @Test
    public void switcherStatusTest() {

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\baggi\\IdeaProjects\\lemon\\src\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        // Accept cookies
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();

        // Settings
        driver.findElement(By.xpath("//div[@jsname='LgbsSe']")).click();

        // Search settings
        driver.findElements(By.xpath("//div[@jsname='ibnC6b']")).getFirst().click();

        // Other settings
        driver.findElement(By.xpath("//span[@class='OPuSkc z1asCe DET5Lc']")).click();

        // Dark theme switcher
        WebElement el = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/span[3]"));

        String expectedValueForDarkThemeSwitcher = "Откл.";
        Assert.assertEquals(el.getText(), expectedValueForDarkThemeSwitcher);
        driver.quit();
    }
}
