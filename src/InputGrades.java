import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        // Loop to enter data for 10 students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter ID for student " + (i + 1) + ": ");
            students[i].setIdNumber(scanner.nextInt());
            scanner.nextLine(); // Consume the newline

            // Loop to enter grades for 5 courses
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter course ID for course " + (j + 1) + ": ");
                String courseID = scanner.nextLine();

                char grade;
                while (true) {
                    System.out.print("Enter grade for course " + (j + 1) + " (A, B, C, D, F): ");
                    grade = scanner.nextLine().toUpperCase().charAt(0);
                    if ("ABCDE".indexOf(grade) != -1) {
                        break; // Valid grade entered
                    } else {
                        System.out.println("Invalid grade. Please enter A, B, C, D, or F.");
                    }
                }

                CollegeCourse course = new CollegeCourse(courseID, 3, grade); // Assuming 3 credit hours
                students[i].setCourse(course, j);
            }
        }

        // Display entered data
        System.out.println("\nEntered Grades:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getIdNumber());
            for (int j = 0; j < 5; j++) {
                CollegeCourse course = student.getCourse(j);
                System.out.println("  Course ID: " + course.getCourseID() + ", Grade: " + course.getLetterGrade());
            }
        }

        scanner.close();
    }
}
