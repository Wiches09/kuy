/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helld
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public boolean equals(Employee e){
        return e.name.equals(this.getName());
    }
    
    public String toString(){
        return "My name is "+getName()+".\n"
                + "I have "+getEnergy()+" energy left.\n"
                        + "I have a balance of "+wallet.getBalance()+" baht.";
    }
    
    public boolean buyFood(Seller s){
        Food maybe_f = s.sell(this);
        if(maybe_f != null){
            eat(maybe_f);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void eat(Food f){
        energy += f.getEnergy();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Wallet getWallet(){
        return this.wallet;
    }
    
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    
    public int getEnergy(){
        return this.energy;
    }
    
    public void setEnergy(int energy){
        this.energy = energy;
    }
    
    public static String getNationality(){
        return Employee.nationality;
    }
    
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
}
