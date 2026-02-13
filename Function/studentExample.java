import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println();
    }
}

class GradeManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }
}

public class studentExample {
    public static void main(String[] args) {

        GradeManager manager = new GradeManager();

        Student s1 = new Student("Ram Manohar Maurya");
        Student s2 = new Student("Anjana Maurya");

        manager.addStudent(s1);
        manager.addStudent(s2);

        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(78);

        s2.addGrade(88);
        s2.addGrade(92);
        s2.addGrade(80);

        manager.displayAllStudents();
    }
}
