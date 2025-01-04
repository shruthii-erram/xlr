import java.util.*;
 class custumer{
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

        }}
        public class Demo10{
        public static void main(String[] args){
            custumer obj=new custumer();
            obj.accept_details();
            obj.Display_details();
        
    }
}
