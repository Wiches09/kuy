/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olab_04;

/**
 *
 * @author helld
 */
public class Cat {
    public String name;
    public String color;
    public double height;
    public double weight;
    
    private void setWeight(double w){
        if(w <= 0){
            System.out.println("Error");
        }
        else{
            weight = w;
        }
    }
    
    private void setHeight(double h){
        if (h <= 0){
            System.out.println("Error");
        }
        else{
            height = h;
        }
    }
    
    private void setName(String n){
        name = n;
    }

    private void setColor(String c){
        color = c;
    }
    
    
    
    public void upWeight(double w){
        if(w <= 0){
            System.out.println("Error");
        }
        else{
            setWeight(weight+w);
        }
    }
    
    public void downWeight(double w){
        if(w <= 0){
            System.out.println("Error");
        }
        else{
            setWeight(weight-w);
        }
    }
    
    public void upHeight(double h){
        setHeight(h);
    }
    
    public void defineCat(String n, String c){
        setName(n);
        setColor(c);
    }
    
    public void speak(){
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}
