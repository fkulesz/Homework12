package bankAccount;

public class WithdrawExceededException extends RuntimeException {
    public WithdrawExceededException(double money){
        super("wybierasz za dużo pieniążków" + money);
    }

}
