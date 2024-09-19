import java.util.Scanner;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String inputDay = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(inputDay);
            switch (day) {
                case SUNDAY:
                    System.out.println("Business hours: 11 AM to 5 PM");
                    break;
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("Business hours: 9 AM to 9 PM");
                    break;
                case SATURDAY:
                    System.out.println("Business hours: 10 AM to 6 PM");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }

        scanner.close();
    }
}
