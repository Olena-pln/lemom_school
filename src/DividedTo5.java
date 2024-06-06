public class DividedTo5 {
    public static void main(String[] args) {
        for (int i = 1; i < 51; i = i + 1) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
