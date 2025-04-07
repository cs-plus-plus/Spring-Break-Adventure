
public class Location {
    String name;
    String description;
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Location> connections = new ArrayList<>();
    
    public void addConnection(Location location) {
        connections.add(location);
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void enterLocation() {
        System.out.println("You arrived at " + name);
        System.out.println(description);
        System.out.println("Items here: " + items);
        System.out.println("Connections: " + connections);
    }
}
