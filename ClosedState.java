public class ClosedState implements AccountState{

    public String getState(){
        return "closed";
    }

    public void closeState(Account account){
        System.out.println("Account is already closed!");
    }

    public void suspendState(Account account){
        System.out.println("You cannot suspend a closed account!");
    }

    public void activateState(Account account){
        System.out.println("You cannot activate a closed account!");
    }

    public void deposit(Account account, double depositAmount){
        System.out.println("You cannot deposit on closed account!");
    }

    public void withdraw(Account account, double withdrawAmount){
        System.out.println("You cannot withdraw on closed account!");
    }
}
