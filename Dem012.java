import java.util.Scanner;
   class CircleAreaDemo1 {

	void Area() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

		
		int r = scanner.nextInt();
		
		double ca = Math.PI * (r*r);
		
		System.out.println("The circle area is : " + ca);
	}

}
 public class Demo012 {
    public static void main(String[] args) {
        CircleAreaDemo1 obj = new CircleAreaDemo1();
        obj.Area();}

 }
