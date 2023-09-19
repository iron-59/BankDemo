import java.util.List;

public class Customer {
    private String name;
    private List<Loan> loans;
    private int age, creditScore;

    public Customer(String name, List<Loan> loans, int age, int creditScore) {
        this.name = name;
        this.loans = loans;
        this.age = age;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
