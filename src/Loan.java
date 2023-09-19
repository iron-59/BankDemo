public class Loan {

    private double totalAmount, amountPaid, percentInterest;

    public Loan(double totalAmount, double amountPaid, double percentInterest) {
        this.totalAmount = totalAmount;
        this.amountPaid = amountPaid;
        this.percentInterest = percentInterest;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getPercentInterest() {
        return percentInterest;
    }

    public void setPercentInterest(double percentInterest) {
        this.percentInterest = percentInterest;
    }
}
