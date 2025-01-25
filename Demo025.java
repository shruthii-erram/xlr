import java.util.Scanner;

public class Demo025{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversedString = new String(charArray);
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}
