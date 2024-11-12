abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Method to display employee information
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

