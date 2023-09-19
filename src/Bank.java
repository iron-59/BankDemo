import java.util.List;

public class Bank {
    private String name;
    private double value;
    private int numEmployees; //Note that this could also use a complex data structure such as an Employee class
    private List<Customer> customers;

    public Bank(String name, double value, int numEmployees, List<Customer> customers) {
        this.name = name;
        this.value = value;
        this.numEmployees = numEmployees;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public double calculateValueOfLoans() {
        double total = 0;
        for (Customer customer : customers) {
            List<Loan> loans = customer.getLoans();
            for (Loan loan : loans) {
                total += loan.getTotalAmount();
            }
        }
        return total;
    }
}
