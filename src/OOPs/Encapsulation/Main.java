package OOPs.Encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        Employee e = new Employee(98704, "James Hope", "james.hope@company.com");
        System.out.println("Details of the employee before changing name and email: ");
        System.out.println(e.toString());

        System.out.println();

        System.out.println("Details of the employee after setting name and email: ");
        System.out.println("Employee ID: " + e.getEmpId());
        // Setting new name & getting the new name
        e.setName("John Rope");
        System.out.println("New name: " + e.getName());

        // Setting new email and getting the new mail id
        e.setEmail("john.rope@company.com");
        System.out.println("New E-mail ID: " + e.getEmail());
    }
}