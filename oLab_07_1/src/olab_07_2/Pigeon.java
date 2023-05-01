

public class Pigeon extends Bird {
    private static int numberOfPigeon;
    
    public void setNumberOfPigeon(int n){
        numberOfPigeon = n;
    }
    
    public int getNumberOfPigeon(){
        return numberOfPigeon;
    }
    
    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        setNumberOfPigeon(getNumberOfPigeon()+1);
    }
    
    public void eat(String food){
        if ("worm".equals(food)){
            setWeight(getWeight()+0.5);
        }
        else if ("seed".equals(food)){
            setWeight(getWeight()+0.2);
        }
        else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    
    public String toString(){
        return ("Pigeon "+super.getWeight()+" kg and "+super.getHeight()+" cm. There are "+getNumberOfPigeon()+" pigeons.");
    }
    
    public void fly(){
        super.setWeight(getWeight()-0.25);
        
        if (getWeight() >= 5){
            System.out.println("Fly Fly");
        }
        else{
            System.out.println("I'm hungry");
        }
    }
    
    public void takeOff(){
        super.setWeight(getWeight()-0.5);
        
        if (getWeight() >= 5){
            System.out.println("Take Off");
        }
        else{
            System.out.println("I'm hungry");
        }
    }
    
    public void landing(){
        super.setWeight(getWeight()-0.5);
        
        if (getWeight() >= 5){
            System.out.println("Landing");
        }
        else{
            System.out.println("I'm hungry");
        }
    }
}
