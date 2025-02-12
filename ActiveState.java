public class ActiveState implements AccountState{

    public String getState(){
        return "active";
    }

    public void closeState(Account account){
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }

    public void suspendState(Account account){
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    public void activateState(Account account){
        System.out.println("Account is already activated!");
    }

    public void deposit(Account account, double depositAmount){
        double newBalance = account.getBalance() + depositAmount;
        account.setBalance(newBalance);
        System.out.println("Deposited " + depositAmount + ". New balance: " + newBalance);
    }

    public void withdraw(Account account, double withdrawAmount){
        double newBalance = account.getBalance() - withdrawAmount;
        account.setBalance(newBalance);
        System.out.println("Withdraw " + withdrawAmount + ". New balance: " + newBalance);
    }
}
