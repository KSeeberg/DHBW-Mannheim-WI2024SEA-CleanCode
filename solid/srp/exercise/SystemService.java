package solid.srp.exercise;

public class SystemService {
    
    public void connectToDatabase() {
        System.out.println("Connected to database.");
    }

    public void disconnectFromDatabase() {
        System.out.println("Disconnected from database.");
    }

    public void saveDataToDatabase(String data) {
        System.out.println("Saved data to the database: " + data);
    }

    public void loadDataFromDatabase() {
        System.out.println("Loaded data from the database.");
    }

    public void saveReportToFile(String report, String filePath) {
        System.out.println("Saved report to file: " + filePath);
    }

    public void loadReportFromFile(String filePath) {
        System.out.println("Loaded report from file: " + filePath);
    }

    public void sendEmail(String emailAddress, String subject, String message) {
        System.out.println("Sent email to " + emailAddress + " with subject: " + subject);
    }

    public void logEvent(String event) {
        System.out.println("Logged event: " + event);
    }

    public void sendSystemNotification(String notification) {
        System.out.println("Sent system notification: " + notification);
    }

    public void printDocument(String document) {
        System.out.println("Printed document: " + document);
    }

    public void shutdownSystem() {
        System.out.println("System shutting down.");
    }
}