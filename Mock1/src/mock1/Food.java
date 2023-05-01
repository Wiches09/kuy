/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock1;

/**
 *
 * @author helld
 */
public class Food {
    protected String name;
    
    public Food(){

    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract int getPower(){
        
    }
}
