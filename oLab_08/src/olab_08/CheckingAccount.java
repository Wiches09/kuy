package olab_08;






public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        this(0.0,"",0.0);
    }
    
    public CheckingAccount(double balance, String name, double credit){
        setBalance(balance);
        setName(name);
        setCredit(credit);
    }
    
    public void setCredit(double credit){
        this.credit = credit;
    }
    
    public double getCredit(){
        return credit;
    }
    
    public void withdraw(double a){
        if (balance - a >= 0){
            super.withdraw(a);
            System.out.println(a+" baht is withdrawn from "+getName()+" and your credit balance is "+getCredit());
        }
        else if(credit - (a - balance) >= 0){
            setBalance(0);
            setCredit(credit-(a-balance));
            System.out.println(a+" baht is withdrawn from "+getName()+" and your credit balance is "+getCredit());
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a){
        withdraw(Double.parseDouble(a));
    }
    
    public String toString(){
        return "The "+getName()+" account gas "+getBalance()+" baht and "+getCredit()+" credits.";
    }
}
