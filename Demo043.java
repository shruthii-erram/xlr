import java.util.Scanner;

public class  Demo043{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char uppercaseChar = scanner.next().charAt(0);
        if (Character.isUpperCase(uppercaseChar)) {
            char lowercaseChar = Character.toLowerCase(uppercaseChar);
            System.out.println("Lowercase character: " + lowercaseChar);
        } else {
            System.out.println("Please enter a valid uppercase character.");
        }
        scanner.close();
    }
}
