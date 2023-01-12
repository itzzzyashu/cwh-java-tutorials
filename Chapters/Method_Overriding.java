// Method Overriding in Java: 
//   If the child class implements the same method present in the parent class again,
//   it is know as method overriding.
//   Method overriding helps us to classify a behavior that is specific to the child class.
//   The subclass can override the method of the parent class only when the method is not declared as final. 
//   Example :
//     In the below code, we've created two classes: class A & class B.
//     Class B is inheriting class A.
//     In the main() method, we've created one object for both classes.
//     We're running the meth1() method on class A and B objects separately,
//     but the output is the same because the meth1() is defined in the parent class, i.e., class A.

// @Override // Not allowed with changed parameters
// public void meth2(int a){
//     System.out.println("I\'m method 2 of class B");
// }
// @Override // Throws error that there's no overriding.
// public void meth21(){
//     System.out.println("I\'m method 2 of class B");
// }
// @Override // Not allowed with changed access modifier.
// private void meth2(){
//     System.out.println("I\'m method 2 of class B");
// }

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I\'m method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I\'m method 2 of class B");
    }
    public void meth3(){
        System.out.println("I\'m method 3 of class B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}