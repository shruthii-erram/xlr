import java.util.Scanner;

class UnaryDemo {
    void UnaryOp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.println("a++: " + a++);
        System.out.println("++a: " + ++a);
        System.out.println("b--: " + b--);
        System.out.println("--b: " + --b);
        a = 2; 
        b = 5;
        int c = a++ * --b * a;
        System.out.println("Result of a++ * --b * a: " + c);
        
        scanner.close(); 
    }
}

public class Demo014 {
    public static void main(String[] args) {
        UnaryDemo obj = new UnaryDemo();
        obj.UnaryOp();
    }
}
