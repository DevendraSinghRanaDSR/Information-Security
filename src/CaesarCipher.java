import java.util.*;

public class CaesarCipher {

    static String encrypt(String text, int shift) {

        String cipher = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + shift) % 26 + 'A');
            }

            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + shift) % 26 + 'a');
            }

            cipher += ch;
        }

        return cipher;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter shift: ");
        int shift = sc.nextInt();

        System.out.println("Cipher Text: "
                + encrypt(text, shift));

        sc.close();
    }
}