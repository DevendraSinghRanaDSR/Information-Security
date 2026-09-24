import java.util.*;
public class railFenceCipher {

        static String encrypt(String text, int rails) {

            char[][] matrix = new char[rails][text.length()];

            int row = 0;
            int direction = 1;

            // Put characters in zig-zag
            for (int i = 0; i < text.length(); i++) {

                matrix[row][i] = text.charAt(i);

                if (row == 0)
                    direction = 1;

                if (row == rails - 1)
                    direction = -1;

                row = row + direction;
            }

            // Read row by row
            String cipher = "";

            for (int i = 0; i < rails; i++) {
                for (int j = 0; j < text.length(); j++) {

                    if (matrix[i][j] != '\0')
                        cipher += matrix[i][j];
                }
            }

            return cipher;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter text: ");
            String text = sc.nextLine();

            System.out.print("Enter number of rails: ");
            int rails = sc.nextInt();

            String cipher = encrypt(text, rails);

            System.out.println("Cipher Text: " + cipher);

            sc.close();
        }



}
