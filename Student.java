import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

class Student{
    private String name;
    private LocalDate dateofbirth;

    public Student(String name ,String dateofbirth)
    {
        this.name=name;
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateofbirth =LocalDate.parse(dateofbirth,formatter);
    }
    public void displaystudentname()
    {
        System.out.println("Student Name: " + name);
    }
    public void displayage()
    {
        LocalDate currentDate = LocalDate.now();
        long age  = ChronoUnit.YEARS.between(this.dateofbirth ,currentDate );
        System.out.println("Age of Student is: " + age + " Years");
    }
    public static void main(String[] args) {
        Student stu = new Student("Aisha","2003-12-27");
        stu.displayage();
        stu.displaystudentname();

         // Initialize the StudentCourses object
        StudentCourses studentCourses = new StudentCourses();

        // Add some courses and marks
        studentCourses.addCourse("Java", 80);
        studentCourses.addCourse("Data Structures", 85);
        studentCourses.addCourse("Operating Systems", 70);

        // Display the courses and marks
        studentCourses.displayCourses();
    }
}

class StudentCourses {
    private Map<String, Integer> courses = new HashMap<>();

    public void addCourse(String name, int marks) {
        courses.put(name, marks);
    }

    public void displayCourses() {
        System.out.println("\nCourses and Marks:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }
}


