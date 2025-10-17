package solid.srp.exercise;

public class Main {

	public static void main(String[] args) {
        ManagementSystem managementSystem = new ManagementSystem();

        managementSystem.getEmployeeManager().addEmployee("John Doe", 101, "Engineering");
        managementSystem.getEmployeeManager().updateEmployee(101, "Jonathan Doe");
        managementSystem.getEmployeeManager().removeEmployee(101);

        managementSystem.getPayrollManager().processPayroll(102, 75000.50);
        managementSystem.getPayrollManager().generatePayrollReport();

        managementSystem.getEmployeeManager().assignProject(102, "AI Development");
        managementSystem.getEmployeeManager().completeProject(102, "AI Development");
        managementSystem.getReportService().generateProjectStatusReport("AI Development");

        managementSystem.getCustomerManager().addCustomer("Alice Smith", "alice@example.com");
        managementSystem.getCustomerManager().updateCustomer(201, "alice.smith@example.com");
        managementSystem.getCustomerManager().sendPromotionalEmail(201, "50% Off Sale!");
        managementSystem.getCustomerManager().removeCustomer(201);

        managementSystem.getCustomerManager().recordSale(202, 1500.75);
        managementSystem.getCustomerManager().generateSalesReport();

        managementSystem.getInventoryManager().addInventoryItem("Laptop", 50);
        managementSystem.getInventoryManager().updateInventoryItemQuantity("Laptop", 45);
        managementSystem.getInventoryManager().generateInventoryReport();
        managementSystem.getInventoryManager().removeInventoryItem("Laptop");

        managementSystem.getReportService().generateCompanyWideReport();

        managementSystem.getSystemService().connectToDatabase();
        managementSystem.getSystemService().saveDataToDatabase("Sample data");
        managementSystem.getSystemService().loadDataFromDatabase();
        managementSystem.getSystemService().disconnectFromDatabase();

        managementSystem.getSystemService().saveReportToFile("Annual Report", "reports/annual_report.txt");
        managementSystem.getSystemService().loadReportFromFile("reports/annual_report.txt");

        managementSystem.getSystemService().sendEmail("admin@example.com", "System Update", "The system will undergo maintenance tonight.");
        managementSystem.getSystemService().logEvent("System maintenance scheduled.");
        managementSystem.getSystemService().sendSystemNotification("Reminder: Maintenance scheduled at 10 PM.");
        managementSystem.getSystemService().printDocument("Company Policy Document");

        managementSystem.getSystemService().shutdownSystem();
	}

}
