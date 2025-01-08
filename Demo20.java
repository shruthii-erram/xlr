import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        long first = 0, second = 1;
        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }
        for (int i = 3; i <= n; i++) {
            long nextTerm = first + second;  
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm; 
        }
        scanner.close();
    }
}
