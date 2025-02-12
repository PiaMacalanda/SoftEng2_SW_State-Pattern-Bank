public class SuspendedState implements AccountState{

    public String getState(){
        return "suspended";
    }

    public void closeState(Account account){
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }

    public void suspendState(Account account){
        System.out.println("Account is already suspended!");
    }

    public void activateState(Account account){
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }

    public void deposit(Account account, double depositAmount){
        System.out.println("You cannot deposit on suspended account!");
    }

    public void withdraw(Account account, double withdrawAmount){
        System.out.println("You cannot withdraw on suspended account!");
    }
}
