
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = reader.nextInt();
        System.out.print("Enter second number: ");
        float b = reader.nextInt();
        System.out.print("Enter third number: ");
        float c = reader.nextInt();

        System.out.println("Arithmetic mean: " + (a + b + c)/3);
        }
    }
