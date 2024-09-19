import java.util.Scanner;

public class TimesAndInstructors {
    public static void main(String[] args) {
        String[][] courses = {
                {"C25201", "Mon 9 AM", "Khan"},
                {"C25201", "Wed 9 AM", "Khan"},
                {"C25202", "Tue 10 AM", "Smith"},
                {"C25203", "Thu 11 AM", "Johnson"},
                {"C25204", "Fri 1 PM", "Davis"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a course name (e.g., C25201): ");
        String courseName = scanner.nextLine();

        boolean found = false;
        for (String[] course : courses) {
            if (course[0].equalsIgnoreCase(courseName)) {
                System.out.printf("Course: %s, Time: %s, Instructor: %s%n", course[0], course[1], course[2]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }

        scanner.close();
    }
}
