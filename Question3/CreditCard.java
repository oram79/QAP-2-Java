package Question3;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0);
        this.creditLimit = new Money(creditLimit);
    }

    public Money getBalance() {
        return new Money(balance);
    }
    public Money getcreditLimit() {
        return new Money(creditLimit);
    }
    public String getInfo() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money newBalance = new Money(balance.getAmount() + amount.getAmount());
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds Credit Limit");
        }
    }

    public void payment(Money amount) {
        balance = new Money(balance.getAmount() - amount.getAmount());
        System.out.println("Payment: " + amount);
    }
}