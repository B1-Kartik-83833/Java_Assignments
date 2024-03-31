public class Employee
{
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

        public static void main(String[] args) {

            Employee emp1 = new Employee("Hemant", "Sangole", 50000);
            Employee emp2 = new Employee("Steve", "Smith", 70000);

            System.out.println("Yearly Salary of " + emp1.getFirstName() + " " + emp1.getLastName() + ": Rs " + (emp1.getSalary() * 12));
            System.out.println("Yearly Salary of " + emp2.getFirstName() + " " + emp2.getLastName() + ": Rs " + (emp2.getSalary() * 12));

            emp1.setSalary(emp1.getSalary() * 1.10);
            emp2.setSalary(emp2.getSalary() * 1.10);

            System.out.println("\nYearly Salary after 10% raise for " + emp1.getFirstName() + ": Rs " + (emp1.getSalary() * 12));
            System.out.println("Yearly Salary after 10% raise for " + emp2.getFirstName() + ": Rs " + (emp2.getSalary() * 12));
        }
}