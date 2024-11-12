public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Clyde", 01, 5000, 1000);
        Employee developer = new Developer("Kipkoech", 02, 50, 160);

        // Display information and calculate salaries
        manager.displayInfo();
        System.out.println("Manager Salary: ksh " + manager.calculateSalary());

        developer.displayInfo();
        System.out.println("Developer Salary: ksh " + developer.calculateSalary());
    }
}

