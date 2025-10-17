package solid.srp.exercise;

public class CustomerManager {
    
    public void addCustomer(String name, String email) {
        System.out.println("Added customer: " + name + " with email: " + email);
    }

    public void removeCustomer(int customerId) {
        System.out.println("Removed customer with ID: " + customerId);
    }

    public void updateCustomer(int customerId, String newEmail) {
        System.out.println("Updated customer ID: " + customerId + " with new email: " + newEmail);
    }

    public void recordSale(int customerId, double amount) {
        System.out.println("Recorded sale of $" + amount + " for customer ID: " + customerId);
    }

    public void generateSalesReport() {
        System.out.println("Generated sales report.");
    }

    public void sendPromotionalEmail(int customerId, String promotion) {
        System.out.println("Sent promotional email: " + promotion + " to customer ID: " + customerId);
    }
}