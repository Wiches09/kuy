

public class Ship extends Vehicle implements Floatable{
    public Ship(){
        this(0.0);
    }
    
    public Ship(double fuel){
        this.fuel = fuel;
    }
    
    public void move(){
        fl0at();
    }
    
    public void move(int distance){
        while (distance > 0){
            if (fuel >= 50){
                distance -= 1;
                System.out.println("Ship Moves");
            }
            else{
                System.out.println("Fuel is not enough.");
            }
        }
    }
    
    public void fl0at(){
        if (fuel >= 50){
            setFuel(getFuel()-50);
            System.out.println("Ship Moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    
    public void startEngine(){
        if (fuel >= 20){
            setFuel(getFuel()-20);
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    
    public void honk(){
        System.out.println("Shhhhh");
    }
}
