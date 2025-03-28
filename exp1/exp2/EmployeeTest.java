
class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String fName, String lName, double salary) {
        this.firstName = fName;
        this.lastName = lName;
        setMonthlySalary(salary);
    }

    public void setFirstName(String fName)
     {
         this.firstName = fName;
          }
    public String getFirstName() 
    {
         return firstName; 
         }

    public void setLastName(String lName) 
    {
         this.lastName = lName; 
         }
    public String getLastName() 
    {
         return lastName;
          }

    public void setMonthlySalary(double salary) {
        if (salary >= 0)
            this.monthlySalary = salary;
        else
            this.monthlySalary = 0.0;
    }
    public double getMonthlySalary() 
    {
         return monthlySalary;
          }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        this.monthlySalary *= 1.1;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sumit", "Shendage", 3000);
        Employee emp2 = new Employee("Deepak", "Bhanuse", 4000);

        System.out.println("Initial Yearly Salaries:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": Rs" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": Rs" + emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("\nYearly Salaries after 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": Rs" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": Rs" + emp2.getYearlySalary());
    }
}

