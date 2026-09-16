import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the Video Game Name");
        String VideoGameName = scanner.nextLine();

        System.out.println("Type the Platform you played it on");
        String PlatformName = scanner.nextLine();

        System.out.println("Did you complete the Main Story?");
        String CompletedMain = scanner.nextLine();

        System.out.println("Did you complete 100% of the game?");
        String Comptleted100 = scanner.nextLine();

        System.out.println("How many hours did you play?");
        int Timeplayed = scanner.nextInt();

        System.out.println("What rating would you give the game?");
        double Rating = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Write a review for the game");
        String Review = scanner.nextLine();

         VideoGames tracker = new VideoGames(VideoGameName, PlatformName, CompletedMain, Comptleted100, Timeplayed, Rating, Review);

        FileWriter writer = new FileWriter("VideoGames.txt", true);
        writer.write(tracker.toString());
        writer.write(System.lineSeparator());
        writer.close();

        System.out.println("Do you want to add more Games?");
        String addMore = scanner.nextLine();
        if (addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("y")) {
            main(args);
        } else {
            System.out.println("Thank you for using the Video Game Tracker!");
        }
    }
    
}