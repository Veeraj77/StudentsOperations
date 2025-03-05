class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();

        while (true) { // Menu loop
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Edit Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) { // Switch case to run code based on user choice
                case 1: // Adding new student
                    System.out.println("Enter Name: ");
                    String name = scan.nextLine();

                    System.out.println("Enter PRN: ");
                    long prn = Long.parseLong(scan.nextLine());

                    System.out.println("Enter AGE: ");
                    int age = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter CGPA: ");
                    double cgpa = Double.parseDouble(scan.nextLine());
                    
                    System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
                    LocalDate dob = LocalDate.parse(scan.nextLine());

                    Student student = new Student(name, prn, age, cgpa, dob);
                    operations.addStudent(student);
                    break;

                case 2: // Displaying student details
                    System.out.println("\nDisplaying all students:");
                    operations.displayStudents();
                    break;

                case 3:
                    operations.searchStudent();
                    break;

                case 4:
                    operations.deleteStudent();
                    break;

                case 5:
                    operations.editStudent();
                    break;

                case 6: // Exit the loop
                    System.out.println("\nExiting program...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }
}
