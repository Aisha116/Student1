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

    }
}

