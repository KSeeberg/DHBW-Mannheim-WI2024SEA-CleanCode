package solid.srp.exercise;

public class InventoryManager {
    
    public void addInventoryItem(String item, int quantity) {
        System.out.println("Added " + quantity + " units of " + item + " to inventory.");
    }

    public void removeInventoryItem(String item) {
        System.out.println("Removed " + item + " from inventory.");
    }

    public void updateInventoryItemQuantity(String item, int quantity) {
        System.out.println("Updated inventory of " + item + " to " + quantity + " units.");
    }

    public void generateInventoryReport() {
        System.out.println("Generated inventory report.");
    }
}