import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.dateOfBirth = dateFormat.parse(dob);
    }

    public Student(String name, Date dob) {
        this.name = name;
        this.dateOfBirth = dob;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    private int calculateAge() {
        Date currentDate = new Date();
        long diffInMillis = currentDate.getTime() - dateOfBirth.getTime();
        long diffInSec = diffInMillis / 1000;
        long years = diffInSec / (60 * 60 * 24 * 365);
        return (int) years;
    }

    public static void main(String[] args) throws ParseException {
        Student student = new Student("John Doe", "2000-05-11");
        student.displayStudentInfo();
    }
}
