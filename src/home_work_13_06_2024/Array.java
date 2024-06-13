package home_work_13_06_2024;

import java.util.Random;

public class Array {

    public static void main(String[] args) {

        int[] my_array = new int[15];

        Random random = new Random();
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = random.nextInt(999);
        }
        int summa = 0;
        for (int num : my_array) {
            summa += num;
        }
        double mean = (double) summa / my_array.length;
        System.out.println("Arithmetic mean is: " + mean);
    }
}