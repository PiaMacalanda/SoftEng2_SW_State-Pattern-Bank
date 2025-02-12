public interface AccountState {

    public String getState();
    public void activateState(Account account);
    public void suspendState(Account account);
    public void closeState(Account account);
    public void deposit(Account account, double depositAmount);  // Updated to accept Account object
    public void withdraw(Account account, double withdrawAmount);  // Updated to accept Account object
}
