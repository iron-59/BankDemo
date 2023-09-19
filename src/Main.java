import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            Loan houseLoan = new Loan(200000 + random.nextInt(100000), 500 + random.nextInt(100000), 0.05 + Math.min(0.1, random.nextDouble()));
            Loan carLoan = new Loan(50000 + random.nextInt(5000), 0, 0.025);

            List<Loan> loans = new ArrayList<>();
            loans.add(houseLoan);
            loans.add(carLoan);

            Customer customer = new Customer(random.nextDouble() < .5 ? "John Doe" : "Jane Doe", loans, random.nextInt(100), 300 + random.nextInt(400));
            customers.add(customer);
        }

        Bank bank = new Bank("Random Bank", 10000000, 15, customers);
        System.out.println("Value of loans: $" + bank.calculateValueOfLoans());

    }
}