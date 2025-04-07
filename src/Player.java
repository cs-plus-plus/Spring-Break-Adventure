
public class Player {
    int energy = 100;
    ArrayList<Item> inventory = new ArrayList<>();
    Location currentLocation;

    public void pickUpItem(Item item) {
        inventory.add(item);
    }

    public void travel(Location nextLocation) {
        currentLocation = nextLocation;
        currentLocation.enterLocation();
    }
}
