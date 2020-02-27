package bankAccount;

public class BankAccount {
    private Person person;
    private double actualCash;

    public BankAccount(Person person, double actualCash) {
        if(person == null){
            throw new NullPointerException("brak osoby");
        }
        this.person = person;
        this.actualCash = actualCash;
    }

    public void deposit(double amountOfDeposit){
        this.actualCash += amountOfDeposit;
    }

    public void withdraw(double amountOfWithdraw){
        if(amountOfWithdraw > actualCash){
            throw new IllegalArgumentException("próbujesz wybrac wiecej niz masz");
        }
        this.actualCash -= amountOfWithdraw;
    }

}
