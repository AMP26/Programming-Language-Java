package OOPs.Polymorphism.compiletime.methodhiding;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.print(); // Prints "Parent"

        Child c = new Child();
        c.print(); // Prints "Child"

        Parent prnt = new Child();
        prnt.print(); // Prints "Parent".
        // In method hiding method resolution taken care by compiler, reference type i.e Parent.
        // So, parent method will be invoked.
    }
}
