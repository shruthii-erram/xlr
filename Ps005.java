import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Employee {
    int id;
    String name;
    double salary;
    public Employee() { }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
class CollectionMap {
    private Map<Integer, Employee> employeeMap;
    public CollectionMap() {
        employeeMap = new HashMap<>();
    }
    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }
    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }
    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1; 
        }
        if (employeeMap.containsKey(emp.getId())) {
            return 2; 
        }
        employeeMap.put(emp.getId(), emp);
        return 0; 
    }
    public int removeEmployee(int employeeId) {
        if (employeeMap == null || employeeMap.isEmpty()) {
            return 1; 
        }
        if (!employeeMap.containsKey(employeeId)) {
            return 2; 
        }
        employeeMap.remove(employeeId);
        return 0; 
    }
    public Employee findEmployee(int employeeId) {
        if (employeeMap == null || employeeMap.isEmpty() || !employeeMap.containsKey(employeeId)) {
            return null; 
        }
        return employeeMap.get(employeeId);
    }
    public List<Employee> getEmployeeList() {
        if (employeeMap == null || employeeMap.isEmpty()) {
            return null; 
        }
        return new ArrayList<>(employeeMap.values());
    }
}
public class Ps005 {
    public static void main(String[] args) {
        CollectionMap collectionMap = new CollectionMap();
        Employee emp1 = new Employee(1, "John", 50000.0);
        Employee emp2 = new Employee(2, "Alice", 60000.0);
        Employee emp3 = new Employee(3, "Bob", 55000.0);
        System.out.println("Add Employee 1: " + collectionMap.addEmployee(emp1)); 
        System.out.println("Add Employee 2: " + collectionMap.addEmployee(emp2)); 
        System.out.println("Add Duplicate Employee 1: " + collectionMap.addEmployee(emp1)); 
        System.out.println("Add Null Employee: " + collectionMap.addEmployee(null)); 
        System.out.println("Find Employee 1: " + collectionMap.findEmployee(1)); 
        System.out.println("Find Non-existent Employee 4: " + collectionMap.findEmployee(4)); 
        System.out.println("Employee List: " + collectionMap.getEmployeeList()); 
        System.out.println("Remove Employee 2: " + collectionMap.removeEmployee(2)); 
        System.out.println("Remove Non-existent Employee 4: " + collectionMap.removeEmployee(4)); 
        System.out.println("Remove Employee 1: " + collectionMap.removeEmployee(1)); 
        System.out.println("Employee List After Removals: " + collectionMap.getEmployeeList()); 
    }
}
