class Client {
    private double basePay;
    private int hoursWorked;
    public Client() {
        this.basePay = 0.0;
        this.hoursWorked = 0;
    }
    public Client(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }
    public void computeSalary() {
        final double MIN_WAGE = 8.00; 
        final int MAX_HOURS = 60; 
        final int REGULAR_HOURS = 40; 
        final double OVERTIME_MULTIPLIER = 1.5; 
        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay is below minimum wage ($8.00/hour).");
            return;
        }
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceed the maximum allowed (60 hours).");
            return;
        }
        double totalPay = 0.0;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay; 
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_MULTIPLIER);
        }
        System.out.printf("Total pay: $%.2f%n", totalPay); 
    }
}
public class Ps004{
    public static void main(String[] args) {
        Client employee1 = new Client(7.50, 35);
        Client employee2 = new Client(8.20, 47);
        Client employee3 = new Client(10.00, 3);
        System.out.println("Employee 1:");
        employee1.computeSalary(); 
        System.out.println("\nEmployee 2:");
        employee2.computeSalary(); 
        System.out.println("\nEmployee 3:");
        employee3.computeSalary(); 
    }
}