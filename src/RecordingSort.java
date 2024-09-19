import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recording[] recordings = new Recording[5];

        // Input recording data
        for (int i = 0; i < recordings.length; i++) {
            recordings[i] = new Recording();
            System.out.print("Enter title for recording " + (i + 1) + ": ");
            recordings[i].setTitle(scanner.nextLine());
            System.out.print("Enter artist for recording " + (i + 1) + ": ");
            recordings[i].setArtist(scanner.nextLine());
            System.out.print("Enter playing time (in seconds) for recording " + (i + 1) + ": ");
            recordings[i].setPlayingTime(scanner.nextInt());
            scanner.nextLine(); // Consume newline
        }

        // Prompt for sorting criteria
        System.out.print("Sort by (1) Title, (2) Artist, or (3) Playing Time? ");
        int choice = scanner.nextInt();

        // Sort based on user's choice
        switch (choice) {
            case 1:
                Arrays.sort(recordings, Comparator.comparing(Recording::getTitle));
                break;
            case 2:
                Arrays.sort(recordings, Comparator.comparing(Recording::getArtist));
                break;
            case 3:
                Arrays.sort(recordings, Comparator.comparingInt(Recording::getPlayingTime));
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        // Display sorted recordings
        System.out.println("\nSorted Recordings:");
        for (Recording recording : recordings) {
            System.out.println(recording);
        }

        scanner.close();
    }
}
