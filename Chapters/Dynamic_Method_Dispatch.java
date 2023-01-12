class Phone{
    public void showTime() {
        System.out.println("Time is 8 AM");        
    }
    public void on() {
        System.out.println("Turning on phone");        
    }
}
class SmartPhone extends Phone{
    public void music() {
        System.out.println("Playing Music");        
    }
    public void on() {
        System.out.println("Turning on smartphone");        
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // Phone phone1 = new Phone(); // Allowed
        // SmartPhone smartPhone1 = new SmartPhone(); // 
        // phone1.showTime();
        Phone phone2 = new SmartPhone(); // Allowed
        // SmartPhone smartPhone2 = new Phone(); // Not Allowed

        phone2.showTime(); // runs from Phone class.
        phone2.on(); // runs from SmartPhone class not from Phone class reference.
        // phone2.music(); // Not allowed
    }
}
