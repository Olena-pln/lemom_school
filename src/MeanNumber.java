
import java.util.Scanner;

public class MeanNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = reader.nextInt();
        System.out.print("Enter second number: ");
        int b = reader.nextInt();
        System.out.print("Enter third number: ");
        int c = reader.nextInt();

        System.out.print("Arithmetic mean: ");
        System.out.print((a + b + c)/3);
        }
    }
