import java.util.Scanner;

public class MonoAlphabetic {

    static String encrypt(String text, String key) {

        String cipher = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {

                int position = ch - 'A';

                ch = key.charAt(position);
            }

            else if (ch >= 'a' && ch <= 'z') {

                int position = ch - 'a';

                ch = Character.toLowerCase(
                        key.charAt(position));
            }

            cipher += ch;
        }

        return cipher;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter 26-letter key: ");
        String key = sc.nextLine().toUpperCase();

        System.out.println("Cipher Text: "
                + encrypt(text, key));

        sc.close();
    }
}