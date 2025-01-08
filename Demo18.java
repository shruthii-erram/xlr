import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        long days = minutes / (24 * 60);  
        long years = days / 365;  
        long remainingDays = days % 365;
        System.out.println(minutes + " minutes is equivalent to:");
        System.out.println(years + " years and " + remainingDays + " days.");
        scanner.close();
    }
}
