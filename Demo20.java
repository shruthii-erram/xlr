import java.util.Scanner;
class Fizz {
    public static String getFizzBizz(int value) {
        if (value <= 0) {
            return "Error";
        } else if (value % 3 == 0 && value % 5 == 0) {
            return "FIZZBIZZ";
        } else if (value % 3 == 0) {
            return "FIZZ";
        } else if (value % 5 == 0) {
            return "BIZZ";
        } else {
            return String.valueOf(value);
        }
    }
}
public class Demo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        System.out.println(Fizz.getFizzBizz(input));
        
        scanner.close();
    }
}
