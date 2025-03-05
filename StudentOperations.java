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

        switch (choice) {
            case 1:
                System.out.println("\nEnter PRN to search: ");
                long prn = Long.parseLong(scan.nextLine());
                searchByPrn(prn);
                break;
            case 2:
                System.out.println("\nEnter Name to search: ");
                String name = scan.nextLine();
                searchByName(name);
                break;
            case 3:
                System.out.println("\nEnter Position (Index) to search: ");
                int pos = Integer.parseInt(scan.nextLine());
                searchByPosition(pos);
                break;
            default:
                System.out.println("\nInvalid choice!");
        }
    }

    public void searchByPrn(long prn) { // Search by PRN
        for (Student student : students) {
            if (student.getPrn() == prn) {
                System.out.println("\nStudent Found:");
                student.display();
                return;
            }
        }
        System.out.println("\nStudent with PRN " + prn + " not found.");
    }

    public void searchByName(String name) { // Search by Name
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found:");
                student.display();
                return;
            }
        }
        System.out.println("Student with Name " + name + " not found.");
    }

    public void searchByPosition(int pos) { // Search by Position
        if (pos >= 0 && pos < students.size()) {
            System.out.println("Student at Position " + pos + ":");
            students.get(pos).display();
        } else {
            System.out.println("Invalid Position! No student exists at index " + pos);
        }
    }

    public void deleteStudent() { // Delete student by PRN
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter PRN to delete: ");
        long prn = Long.parseLong(scan.nextLine());

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getPrn() == prn) {
                iterator.remove();
                System.out.println("Student with PRN " + prn + " deleted.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

