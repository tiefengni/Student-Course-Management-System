import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Student> students;
    private List<Course> courses;

    public CourseManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public Course findCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public void enrollStudentInCourse(int studentId, String courseCode) {
        Student student = findStudentById(studentId);
        Course course = findCourseByCode(courseCode);

        if (student != null && course != null) {
            course.enrollStudent(student);
            System.out.println("Student enrolled successfully.");
        } else {
            System.out.println("Student or course not found.");
        }
    }

    public void assignGrade(int studentId, String courseName, String grade) {
        Student student = findStudentById(studentId);

        if (student != null) {
            student.addGrade(courseName, grade);
            System.out.println("Grade assigned successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println();
        }
    }

    public void displayAllCourses() {
        for (Course course : courses) {
            course.displayCourseInfo();
            System.out.println();
        }
    }
}
