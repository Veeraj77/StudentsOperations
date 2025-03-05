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

