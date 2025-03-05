import java.util.*;
import java.time.LocalDate;

// Class to perform CRUD operations on Student objects
class StudentOperations {
    ArrayList<Student> students; // List to store students

    public StudentOperations() { // Constructor
        this.students = new ArrayList<>();
    }

