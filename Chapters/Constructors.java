/* Constructor overloading in Java refers to the use of more than one constructor in an instance class.
However, each overloaded constructor must have different signatures.
For the compilation to be successful,
each constructor must contain a different list of arguments. */

class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id=596565;
        name="No Name";
    }
    public MyMainEmployee(int myId, String myName){
        id=myId;
        name=myName;
    }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee(146413431, "Harry");
        // harry.setId(45);
        // harry.setName("Harry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}