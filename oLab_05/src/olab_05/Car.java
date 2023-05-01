/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olab_05;

/**
 *
 * @author helld
 */
public class Car extends Vehicle{
    private String typeEngine;
    
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void setCarInfo(int s, String t, String y){
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    public void showCarInfo(){
        System.out.println("Car engine is "+getTypeEngine()+".");
        System.out.println("Fuel is "+getFuel()+" litre and Top Speed is "+getTopSpeed()+" m/s.");
    }
    public void move(){
        setFuel(getFuel()-50);
        int num = getFuel();
        if (num <= 0){
            System.out.println("Please add fuel.");
            setFuel(getFuel()+50);
        }
        else{
            System.out.println("Move.");
        }
    }
}
