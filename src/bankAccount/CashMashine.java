package bankAccount;

public class CashMashine {
    public static void main(String[] args) {
        Person person = new Person("filip", "Kulesz");
        try{
            BankAccount newBankAccount = new BankAccount(null, 123);
            newBankAccount.deposit(200);
            newBankAccount.withdraw(500);

        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
