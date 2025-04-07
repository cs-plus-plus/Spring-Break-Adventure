# 🌴 Spring Break Adventure Game - CS++ Code Sprint 🌞

Welcome to the **Spring Break Adventure Game**! In this 3-day code sprint, you and your team will build a sunny, text-based adventure game where players explore tropical destinations, encounter quirky characters, and collect exciting souvenirs along the way. Your goal is to create a playable game with clear, object-oriented code using arrays and ArrayLists.

---

## 🏖️ Project Overview

In this game, players will navigate through locations on a spring break getaway—beaches, resorts, jungle trails, and more—meeting characters, picking up items, and solving challenges to make the most of their vacation. By designing classes, using arrays or ArrayLists, and coding game logic, you'll create a spring break-themed game that brings together your programming skills and creativity!

### Objective
- **Design** and **implement** classes (`Location`, `Character`, `Item`, and `Player`).
- **Use arrays/ArrayLists** to store and manage game elements.
- Complete the game within **3 class periods**!

---

## 👥 Teams and Sprint Structure

- **Team Size**: 3-4 members  
- **Time Limit**: 3 days 
- **Roles**: Assign each team member a class or feature to work on (e.g., `Location`, `Character`, `Item`, `Player`, or Game Logic).

## 📜 Instructions

### 1. **Game Premise**
   - Players are on a spring break trip and must explore fun locations to complete their ultimate vacation.
   - Each location may contain unique characters and items that players can interact with.
   - Use object-oriented principles, arrays, and ArrayLists to build the adventure world.

### 2. **Design the Classes**

   - **SpringBreakAdventure Class**
     - Methods: `main`
     
   - **Location Class**
     - Properties: `name`, `description`, `items` (ArrayList<Item>), `connections` (ArrayList<Location>)
     - Methods: `addConnection(Location location)`, `addItem(Item item)`, `enterLocation()`

   - **Character Class**
     - Properties: `name`, `energy`, `description`
     - Methods: `describe()`, `interact(Player player)`

   - **Item Class**
     - Properties: `name`, `description`, `effect`
     - Methods: `use(Player player, Character character)`

   - **Player Class**
     - Properties: `energy`, `inventory` (ArrayList<Item>), `currentLocation`
     - Methods: `pickUpItem(Item item)`, `travel(Location nextLocation)`, `useItem(Item item, Character character)`

### 3. **Use Arrays and ArrayLists**

   - **Location Connections**: Store linked destinations in the `connections` ArrayList in each `Location` object.
   - **Location Items**: Use an ArrayList to hold `Item` objects at each location.
   - **Player Inventory**: Track the player’s items in an ArrayList in the `Player` class.

### 4. **Gameplay Mechanics**

   - **Traveling Between Locations**:  
     Players can view connected destinations and choose where to travel next.

   - **Item Interactions**:  
     Players can pick up items (e.g., sunscreen, souvenirs, snacks) to add to their inventory and use during their adventure.

   - **Character Encounters**:  
     Players can talk to characters or use items to gain information or overcome challenges (e.g., get a ride to the beach or unlock a hidden trail).

   - **End Goal**:  
     The player’s objective is to complete a checklist of vacation goals before the trip ends.

### 5. **Class Structure Example**

Use the following skeleton code as a starting point:

```java
class Location {
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

class Item {
    String name;
    String description;
    String effect;

    public void use(Player player, Character character) {
        // Define what the item does
    }
}

class Character {
    String name;
    int energy;
    String description;

    public void interact(Player player) {
        // Affect player's energy or provide clues
    }
}

class Player {
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
```

---

## 🧪 Testing and Final Playthrough

- **Test each part**: Try out location transitions, item collection and usage, and character interactions.
- **Final Playthrough**: Play through the game as a team to ensure smooth flow and fun gameplay.

---

## 🎉 Wrap-Up

At the end of the sprint, each team will present their game. Highlight your spring break destinations, wild encounters, and anything unique or fun your team added to the experience.

---

**Authors**: CS++  
**Date**: April 7, 2025  

---
