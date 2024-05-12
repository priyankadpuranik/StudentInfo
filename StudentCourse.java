import java.util.HashMap;
import java.util.Map;

public class StudentCourse {
    private Map<String, Integer> coursesMarks;

    public StudentCourse() {
        this.coursesMarks = new HashMap<>();
    }

    public void addCourseMark(String course, int mark) {
        coursesMarks.put(course, mark);
    }

    public void displayCourseInformation() {
        System.out.println("Course Information:");
        for (Map.Entry<String, Integer> entry : coursesMarks.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Mark: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentCourse studentCourses = new StudentCourse();
        studentCourses.addCourseMark("Mathematics", 85);
        studentCourses.addCourseMark("Physics", 78);
        studentCourses.addCourseMark("English", 92);
        studentCourses.displayCourseInformation();
    }
}
