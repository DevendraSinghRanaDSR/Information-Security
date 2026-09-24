import java.util.*;
public class rowTransposition {

        static String encrypt(String text, int[] key) {

            int columns = key.length;

            // Add X for padding
            while (text.length() % columns != 0) {
                text = text + "X";
            }

            int rows = text.length() / columns;

            char[][] matrix = new char[rows][columns];

            int k = 0;

            // Fill matrix row by row
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = text.charAt(k);
                    k++;
                }
            }

            String cipher = "";

            // Read columns according to key
            for (int number = 1; number <= columns; number++) {

                for (int j = 0; j < columns; j++) {

                    if (key[j] == number) {

                        for (int i = 0; i < rows; i++) {
                            cipher += matrix[i][j];
                        }
                    }
                }
            }

            return cipher;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter text: ");
            String text = sc.nextLine();

            System.out.print("Enter number of columns: ");
            int n = sc.nextInt();

            int[] key = new int[n];

            System.out.println("Enter key:");

            for (int i = 0; i < n; i++) {
                key[i] = sc.nextInt();
            }

            String cipher = encrypt(text, key);

            System.out.println("Cipher Text: " + cipher);

            sc.close();
        }

}
