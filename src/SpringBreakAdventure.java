import java.util.ArrayList;
import java.util.Scanner;

public class SpringBreakAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set up locations
        Location beach = new Location("Sunny Beach", "A beautiful beach with golden sand and crashing waves.");
        Location resort = new Location("Tropical Resort", "A luxurious resort with a pool and a smoothie bar.");
        beach.addConnection(resort);
        resort.addConnection(beach);

        // Set up player
        Player player = new Player();
        player.currentLocation = beach;

        System.out.println("🌴 Welcome to Spring Break Adventure! 🌞");
        System.out.println("Type 'help' to see commands.");

        boolean playing = true;
        while (playing) {
            player.currentLocation.enterLocation();

            System.out.print("What do you want to do? ");
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "help":
                    System.out.println("Available commands: travel, look, inventory, quit");
                    break;
                case "look":
                    player.currentLocation.enterLocation();
                    break;
                case "inventory":
                    System.out.println("Inventory: " + player.inventory);
                    break;
                case "travel":
                    System.out.println("Where do you want to go?");
                    for (int i = 0; i < player.currentLocation.connections.size(); i++) {
                        System.out.println(i + ": " + player.currentLocation.connections.get(i).name);
                    }
                    System.out.print("Enter number: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 0 && choice < player.currentLocation.connections.size()) {
                        player.travel(player.currentLocation.connections.get(choice));
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case "quit":
                    playing = false;
                    System.out.println("Thanks for playing! 🌞");
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }
}
