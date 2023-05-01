
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    public double getFuel(){
        return fuel;
    }
    
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public Vehicle(){
        this(0.0);
    }
    
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    
    public void addFuel(double fuel){
        if (fuel <= 0){
            System.out.println("Input cannot be negative number");
        }
        else{
            this.fuel += fuel;
        }
    }
    
    public abstract void honk();
    
}
