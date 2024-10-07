package Question3;

public class CreditCardDemo {
    public static void main(String[] args) {
        Money Limit = new Money(1000);
        Money firstAmount = new Money(200);
        Money secondAmount = new Money(10.02);
        Money thirdAmount = new Money(25);
        Money fourthAmount = new Money(990);

        Person owner = new Person("Logan", "Oram", new Address(" 7071 Rue St Zotique E", " Anjou", " QC", " H1M 3S7"));
        CreditCard visa = new CreditCard(owner, Limit);

        System.out.println(visa.getInfo());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getcreditLimit());
        System.out.println();

        System.out.println("Attempt to charge " + firstAmount);
        visa.charge(firstAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + secondAmount);
        visa.charge(secondAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to pay " + thirdAmount);
        visa.payment(thirdAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + fourthAmount);
        visa.charge(fourthAmount);
        System.out.println("Balance: " + visa.getBalance());
    }
}
