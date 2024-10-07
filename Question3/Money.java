package Question3;

public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return fromCents(totalCents);
    }

    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        if (totalCents < 0) {
            throw new IllegalArgumentException("Resulting amount cannot be negative");
        }
        return fromCents(totalCents);
    }

    public int compareTo(Money otherObject) {
        long totalCentsThis = this.toCents();
        long totalCentsOther = otherObject.toCents();
        return Long.compare(totalCentsThis, totalCentsOther);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money other = (Money) obj;
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    private long toCents() {
        return (dollars * 100) + cents;
    }

    private static Money fromCents(long totalCents) {
        long dollars = totalCents / 100;
        long cents = totalCents % 100;
        return new Money(dollars + (cents / 100.0));
    }
}

