import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Encrypt message");
            System.out.println("2. Decrypt message");
            System.out.println("3. Exit");

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter message to encrypt: ");
                scanner.nextLine();
                String message = scanner.nextLine().toUpperCase();
                String encryptedMessage = encrypt(message);
                System.out.println("Encrypted message: " + encryptedMessage);
            } else if (option == 2) {
                System.out.print("Enter message to decrypt: ");
                scanner.nextLine();
                String message = scanner.nextLine().toUpperCase();
                String decryptedMessage = decrypt(message);
                System.out.println("Decrypted message: " + decryptedMessage);
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static String encrypt(String message) {
        String plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cypher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int index = plain.indexOf(Character.toUpperCase(c));
            if (index >= 0) {
                char encryptedChar = cypher.charAt(index);
                if (Character.isLowerCase(c)) {
                    encryptedMessage.append(Character.toUpperCase(encryptedChar));
                } else {
                    encryptedMessage.append(encryptedChar);
                }
            } else {
                encryptedMessage.append(c);
            }
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String message) {
        String plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cypher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int index = cypher.indexOf(Character.toUpperCase(c));
            if (index >= 0) {
                char decryptedChar = plain.charAt(index);
                if (Character.isLowerCase(c)) {
                    decryptedMessage.append(Character.toUpperCase(decryptedChar));
                } else {
                    decryptedMessage.append(decryptedChar);
                }
            } else {
                decryptedMessage.append(c);
            }
        }

        return decryptedMessage.toString();
    }

}
