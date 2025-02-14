public class Student {
    private String name;
    private int age;
    private String studentId;

    // Constructor with Custom Exception
    public Student(String name, int age, String studentId) throws InvalidAgeException {
        if (age <= 0 || age > 150) { // Validate age
            throw new InvalidAgeException("Age must be between 1 and 150.");
        }
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
