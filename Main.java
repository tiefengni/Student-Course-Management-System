public class Main {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();

        Student student1 = new Student(1001, "Alice");
        Student student2 = new Student(1002, "Bob");

        Course course1 = new Course("Data Structures", "CS101");
        Course course2 = new Course("Database Systems", "CS202");

        manager.addStudent(student1);
        manager.addStudent(student2);

        manager.addCourse(course1);
        manager.addCourse(course2);

        manager.enrollStudentInCourse(1001, "CS101");
        manager.enrollStudentInCourse(1002, "CS202");

        manager.assignGrade(1001, "Data Structures", "A");
        manager.assignGrade(1002, "Database Systems", "B+");

        System.out.println("All Students:");
        manager.displayAllStudents();

        System.out.println("All Courses:");
        manager.displayAllCourses();
    }
}
