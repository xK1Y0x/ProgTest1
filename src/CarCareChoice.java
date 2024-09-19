import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available services:");
        System.out.println("1. Oil Change - $25");
        System.out.println("2. Tire Rotation - $22");
        System.out.println("3. Battery Check - $15");
        System.out.println("4. Brake Inspection - $5");

        System.out.print("Enter a service: ");
        String service = scanner.nextLine().toLowerCase();

        switch (service) {
            case "oil change":
                System.out.println("Service: Oil Change, Price: $25");
                break;
            case "tire rotation":
                System.out.println("Service: Tire Rotation, Price: $22");
                break;
            case "battery check":
                System.out.println("Service: Battery Check, Price: $15");
                break;
            case "brake inspection":
                System.out.println("Service: Brake Inspection, Price: $5");
                break;
            default:
                System.out.println("Error: Invalid service.");
                break;
        }

        scanner.close();
    }
}
