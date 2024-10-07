package Question3;

public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    // Copy Constructor
    public Money(Money other) {
        this.amount = other.amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean equals(Money other) {
        return this.amount == other.amount;
    }

    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }

    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }
}


