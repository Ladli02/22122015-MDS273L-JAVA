
import java.util.Scanner;

public class menu {
    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[1024];
    static int count = 0;

    public static void main(String[] args) {
        int option;
        do {
            printMenu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    addName();
                    break;
                case 2:
                    searchName();
                    break;
                case 3:
                    removeName();
                    break;
                case 4:
                    System.out.println("Exiting from the program");
                    break;
                default:
                    System.out.println("Invalid option, Please try again");
                    break;
            }
        } while (option != 4);
    }

    static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Enter a name");
        System.out.println("2. Search for a name");
        System.out.println("3. Remove a name");
        System.out.println("4. Exit");
        System.out.print("Enter your option: ");
    }

    static void addName() {
        System.out.print("Enter name: ");
        String name = sc.next();
        if (isNameExists(name)) {
            System.out.println("This name already exist");
        } else {
            names[count++] = name;
            System.out.println("Name added successfully");
        }
    }

    static void searchName() {
        System.out.print("Enter name to be searched: ");
        String name = sc.next();
        boolean isFound = false;
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                System.out.println("Name found at position: " + (i + 1));
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Name not found.");
        }
    }

    static void removeName() {
        System.out.print("Enter name to be removed: ");
        String name = sc.next();
        boolean isFound = false;
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                }
                count--;
                System.out.println("Name removed successfully");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Name not found.");
        }
    }

    static boolean isNameExists(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
}
