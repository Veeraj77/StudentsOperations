import java.util.*;
import java.time.LocalDate;

// Class to perform CRUD operations on Student objects
class StudentOperations {
    ArrayList<Student> students; // List to store students

    public StudentOperations() { // Constructor
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) { // Adding Student
        students.add(student);
        System.out.println("Student Added");
    }

    public void displayStudents() { // Method to display the students
        for (Student student : students) {
            System.out.println("-----------------------------------------------------");
            student.display();
            System.out.println("-----------------------------------------------------\n");
        }
    }

    public void searchStudent() { // Method to search students
        Scanner scan = new Scanner(System.in);
        System.out.println("Search by:\n1. PRN\n2. Name\n3. Position");
        int choice = Integer.parseInt(scan.nextLine());

