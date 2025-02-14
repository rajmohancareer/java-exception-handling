public class Main {
    public static void main(String[] args) {
        try {
            // Creating a Student object
            Student student = new Student("John Doe", 190, "s1234");
            System.out.println("Student registered successfully!");
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Execution completed. Thank you for using the system.");
        }
    }
}
