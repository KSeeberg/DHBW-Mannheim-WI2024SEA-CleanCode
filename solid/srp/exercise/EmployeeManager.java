package solid.srp.exercise;

public class EmployeeManager {
    
    public void addEmployee(String name, int id, String department) {
        System.out.println("Added employee: " + name + " to " + department);
    }

    public void removeEmployee(int id) {
        System.out.println("Removed employee with ID: " + id);
    }

    public void updateEmployee(int id, String newName) {
        System.out.println("Updated employee ID: " + id + " with name: " + newName);
    }

    public void assignProject(int employeeId, String project) {
        System.out.println("Assigned project: " + project + " to employee ID: " + employeeId);
    }

    public void completeProject(int employeeId, String project) {
        System.out.println("Completed project: " + project + " for employee ID: " + employeeId);
    }
}