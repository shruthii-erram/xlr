import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char lowercaseChar = scanner.next().charAt(0);
        if (Character.isLowerCase(lowercaseChar)) {
            char uppercaseChar = Character.toUpperCase(lowercaseChar);
            System.out.println("Uppercase character: " + uppercaseChar);
        } else {
            System.out.println("Please enter a valid lowercase character.");
        }
        scanner.close();
    }
}
