import java.util.ArrayList;

public class Demo24 {
    public static void main(String[] args) {
        ArrayList<String> details1=new ArrayList<>();
        details1.add("Shruthi");
        details1.add("Sindhu");
        details1.add("Sindhu");
        details1.add("Sindhu");
        details1.add("Sindhu");

        
        ArrayList<Integer> details2 = new ArrayList<>();
        details2.add(70364789);
        details2.add(56870990);
        details2.add(56870990);
        details2.add(56870990);
        details2.add(56870990);
        
        ArrayList<String> details3 = new ArrayList<>();
        details3.add("Siricilla");
        details3.add("Vemulawada");
        details3.add("Vemulawada");
        details3.add("Vemulawada");
        details3.add("Vemulawada");

        for (int i = 0; i <details1.size(); i++) {
            System.out.println("Name: " + details1.get(i) + ", Phno: " +details2.get(i) + ", Address: " +details3.get(i));
    
    }
}}