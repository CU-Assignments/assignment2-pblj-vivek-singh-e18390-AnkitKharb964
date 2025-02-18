import java.util.Scanner;

// Abstract class Person
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method for displaying details
    abstract void displayDetails();
}

// Derived class Student
class Student extends Person {
    private int rollNumber;

    // Constructor
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class Assignment2P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student details
        System.out.println("Add Student:");
        System.out.print("Enter Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Creating student object
        Student student = new Student(studentName, studentAge, rollNumber);

        // Taking teacher details
        System.out.println("\nAdd Teacher:");
        System.out.print("Enter Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        // Creating teacher object
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);

        // Displaying details
        student.displayDetails();
        teacher.displayDetails();

        scanner.close();
    }
}
