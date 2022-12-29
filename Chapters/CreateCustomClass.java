class Employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class CreateCustomClass {
    public static void main(String[] args) {
        System.out.println("custom class");
        Employee harry = new Employee(); // Instantiating a new Employee object
        
        // Setting Attributes
        harry.id = 12;
        harry.name = "John";

        // Printing the properties
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        // printDetails
        harry.printDetails();
    }
}