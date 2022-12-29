class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id=45;
        name="Harry";
    }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
}
public class Constructers {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        // harry.setId(45);
        // harry.setName("Harry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}