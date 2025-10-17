package solid.srp.exercise;

public class ManagementSystem {
    
    private final EmployeeManager employeeManager;
    private final PayrollManager payrollManager;
    private final CustomerManager customerManager;
    private final InventoryManager inventoryManager;
    private final ReportService reportService;
    private final SystemService systemService;
    
    public ManagementSystem() {
        this.employeeManager = new EmployeeManager();
        this.payrollManager = new PayrollManager();
        this.customerManager = new CustomerManager();
        this.inventoryManager = new InventoryManager();
        this.reportService = new ReportService();
        this.systemService = new SystemService();
    }
    
    public EmployeeManager getEmployeeManager() {
        return employeeManager;
    }
    
    public PayrollManager getPayrollManager() {
        return payrollManager;
    }
    
    public CustomerManager getCustomerManager() {
        return customerManager;
    }
    
    public InventoryManager getInventoryManager() {
        return inventoryManager;
    }
    
    public ReportService getReportService() {
        return reportService;
    }
    
    public SystemService getSystemService() {
        return systemService;
    }
}
