import java.time.LocalDate;

// Student class representing a student entity with attributes and methods
class Student {
    private String name; // Student's name
    private long prn; // Student's PRN 
    private int age; // Student's age
    private double cgpa; // Student's CGPA 
    private LocalDate dob; // Student's Date of Birth

    // Constructor to initialize a Student object with given attributes
    public Student(String name, long prn, int age, double cgpa, LocalDate dob) {
        setName(name);
        setPrn(prn);
        setAge(age);
        setCgpa(cgpa);
        setDob(dob);
    }

    // Setter and Getter methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter and Getter methods for PRN
    public void setPrn(long prn) {
        this.prn = prn;
    }

    public long getPrn() {
        return prn;
    }

    // Setter and Getter methods for Age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Setter and Getter methods for CGPA
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
    
    // Setter and Getter methods for Date of Birth
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    public LocalDate getDob() {
        return dob;
    }

