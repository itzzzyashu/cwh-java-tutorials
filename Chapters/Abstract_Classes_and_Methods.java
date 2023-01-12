abstract class Parent2{
    public Parent2(){
        System.out.println("Contructor of Parent2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternon");
    }
}

abstract class Child3 extends Parent2{ // should be abstract class
    public void th(){
        System.out.println("I\'m good");
    }
}

public class Abstract_Classes_and_Methods {
    public static void main(String[] args) {
        // Parent2 p = new Parent2(); // throws error, because it's defined as a abstract class.
        // abstract classes or methods can help to create another classes or methods respectively.
        // abstract classes can't be instantiated as objects.
        // abstract -  existing in thought or as an idea but not having a physical or concrete existence.
        Child2 c = new Child2();
    }
}