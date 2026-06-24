import java.util.HashMap;
import java.util.Map;

public class Student {
    private int studentId;
    private String name;
    private Map<String, String> grades;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new HashMap<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void addGrade(String courseName, String grade) {
        grades.put(courseName, grade);
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);

        if (grades.isEmpty()) {
            System.out.println("No grades available.");
        } else {
            System.out.println("Grades:");
            for (String course : grades.keySet()) {
                System.out.println(course + ": " + grades.get(course));
            }
        }
    }
}
