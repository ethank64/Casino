// Imports
import java.util.Scanner;

public class Casino { 
    // Class Variables
    static int money = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to my Casino!");

        while (true) {
            // Print Games
            System.out.println("1) Slots");
            System.out.println("2) 21");
            System.out.println("Enter a game number to play or 0 to exit: ");

            // Create Game Input
            Scanner gameScanner = new Scanner(System.in);
            int gameInput = gameScanner.nextInt();
            
            // Check Game Input
            if (gameInput == 1) {
                Slots slots = new Slots();
                slots.play();
            } else if (gameInput == 2) {
                TwentyOne twentyOne = new TwentyOne();
                twentyOne.play();
            } else if (gameInput == 0) {
                break;
            } else {
                System.out.println("Invalid Option");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
    }
}