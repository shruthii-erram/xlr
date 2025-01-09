import java.util.Scanner;
class Tax {
    public static double calculateTax(double monthlySalary, double hra, double pf) {
        double annualSalary = monthlySalary * 12;
        double deductions = hra + pf;
        double taxableIncome = annualSalary - deductions;
        double totalTax = 0;
        if (taxableIncome <= 500000) {
            totalTax = taxableIncome * 0.10; 
        } else if (taxableIncome <= 1000000) {
            totalTax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20);
        } else {
            totalTax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30); 
        }

        return totalTax;
    }
}
public class Demo21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();
        System.out.print("Enter your monthly HRA: ");
        double hra = scanner.nextDouble();
        System.out.print("Enter your monthly PF: ");
        double pf = scanner.nextDouble();
        double totalTax = Tax.calculateTax(monthlySalary, hra, pf);
        System.out.println("Your total annual tax is: Rs " + totalTax);
        scanner.close();
    }
}
