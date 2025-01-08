import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int nextMultiple = ((number / 100) + 1) * 100;
        System.out.println("The next multiple of 100 after " + number + " is: " + nextMultiple);

        scanner.close();
    }
}