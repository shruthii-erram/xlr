 import java.util.*;
 public class Demo13 {
	public static double getTriangleArea(double s1,double s2,double s3){
		double s = (s1 + s2 + s3) / 2;
		double ta = Math.sqrt(s * (s - s1) * (s - s2) * (s-s3));
		return ta;
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s1,s2,s3;
		System.out.println("Enter the value of s1");
        s1 = scanner.nextDouble();	
        System.out.println("Enter the value of s2");
        s2 = scanner.nextDouble();		
        System.out.println("Enter the value of s3");
        s3 = scanner.nextDouble();	
		
		double ta = getTriangleArea(s1,s2,s3);
		
		System.out.println("The triangle area is: "+ta);
	}

}
