/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helld
 */
public class Seller extends Employee {
    public Food sell(Employee e){
        Food f = new Food();
        double price = f.getPrice();

        if(e.getWallet().getBalance() >= price){
            super.getWallet().setBalance(super.getWallet().getBalance()+f.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance()-f.getPrice());
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
        return f;
    }
}
