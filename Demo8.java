import java.util.Scanner;

class Demo8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username,pwd;
       
        do{
            System.out.print("enter your credentials");
            System.out.print("Enter username: ");
             username = scanner.nextLine();

            System.out.print("Enter pwd: ");
             pwd = scanner.nextLine();
             break;

             
        }
        while((!username.equals("shruthi_001"))||(!pwd.equals(" shruu_001")));
            System.out.println("sucessfully logined");
        

        
            
        
    }
}
