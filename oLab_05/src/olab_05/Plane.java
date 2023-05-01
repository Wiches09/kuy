/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olab_05;

/**
 *
 * @author helld
 */
public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is "+getFuel()+" litre and Top Speed is "+getTopSpeed()+" m/s.");
    }
    public void fly(){
        setFuel(getFuel()-200);
        int num = getFuel();
        if(num <= 0){
            System.out.println("Please add fuel.");
            setFuel(getFuel()+200);
        }
        else{
            System.out.println("Fly.");
        }
    }
}
