class Employee{
    int id;
    String firstname;
    String lastname;
    String address;

public Employee(){

}
public Employee(int id,String firstname,String lastname,String address){
    super();
    this . id =id;
    this.firstname= firstname;
    this.lastname= lastname;
    this.address= address;
}
public String getFullName(){
    return firstname+" "+lastname;
}
}
public class PS001 {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Shruthi", "erram", "vemulawada");

        System.out.println("Employee Full Name: " + employee.getFullName());
       
    }
}


