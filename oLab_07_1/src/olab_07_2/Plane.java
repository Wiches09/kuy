
public class Plane extends Vehicle implements Flyable{
    private String airline;
    private String boeing;
    private final static int MAX_FLYER = 2;
    
    public void setAirline(String airline){
        this.airline = airline;
    }
    
    public String getAirline(){
        return airline;
    }
    
    public void setBoeing(String boeing){
        this.boeing = boeing;
    }
    
    public String getBoeing(){
        return boeing;
    }
    
    public Plane(){
        this(0.0, "", "");
    }
    
    public Plane(double fuel, String airline, String boeing){
        setFuel(fuel);
        setAirline(airline);
        setBoeing(boeing);
    }
    
    public void startEngine(){
        if (fuel >= 20){
            setFuel(getFuel()-20);
            System.out.println("Plane's Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    
    public void stopEngine(){
        System.out.println("Plane's Engine stops");
    }
    
    public void honk(){
        System.out.println("Weeeeeee");
    }
    
    public void fly(){
        if (fuel >= 20){
            setFuel(getFuel()-20);
            System.out.println("Plane Fly");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    public void takeOff(){
        if (fuel >= 10){
            setFuel(getFuel()-10);
            System.out.println("Plane Already to Take Off");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    public void landing(){
        if (fuel >= 10){
            setFuel(getFuel()-10);
            System.out.println("Plane Already to Landing");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
}
