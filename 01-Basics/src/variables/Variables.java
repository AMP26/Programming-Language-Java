package variables;

public class Variables {
    // Static variable (class-level)
    static String staticVar = "This is static variable";

    // Instance variable (object-level)
    String instanceVar = "This is instance variable";

    public void displayVariables() {
        // Local variable (method-level)
        int localVar = 100;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}
