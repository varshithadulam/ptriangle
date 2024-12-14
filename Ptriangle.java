public class Ptriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Calculate and print the values in the row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
