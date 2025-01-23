import java.util.Scanner;

class Demo007{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter phone number: ");
        long  phone = scanner.nextLong();
    
            System.out.println("hi my name is"+username+"my age is"+age+"my phone number is"+phone);
        
    }
}
