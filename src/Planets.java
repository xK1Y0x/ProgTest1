import java.util.Scanner;

enum Planet {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE
}

public class Planets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a planet name: ");
        String inputPlanet = scanner.nextLine().toUpperCase();

        try {
            Planet planet = Planet.valueOf(inputPlanet);
            System.out.printf("%s is planet number %d in the solar system.%n", planet, planet.ordinal() + 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid planet name entered.");
        }

        scanner.close();
    }
}
