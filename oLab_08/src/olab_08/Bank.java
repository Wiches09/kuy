
package olab_08;

public class Bank {
    private Account acct;
    private int numAcct;

    public Account getAcct() {
        return acct;
    }

    public int getNumAcct() {
        return numAcct;
    }
    
    public Bank(){
       acct = new Account[10];
    }
    
    public void addBankAccount(Account acc){
        
    }
}
