import java.util.*;
public class Demo009{
    String custumer_name ="Shruthi";
    long  Account_no = 1234;
    Double Balance=10000.00; 
        void accept_details(){
            System.out.println("Enter your name,account_no.r");
           Scanner scanner=new Scanner(System.in);
           custumer_name=scanner.nextLine();
           Account_no=scanner.nextLong();

        }
        void Display_details(){
            System.out.println("hello"+custumer_name);
            System.out.println("Your balance is"+Balance);

        }
        public static void main(String[] args){
            Demo9 obj=new Demo9();
            obj.accept_details();
            obj.Display_details();
        
    }
}
