

public abstract class Bird implements Flyable{
    private double wingSize;
    private double weight;
    private double height;
   
    public Bird(){
        this(0.0, 0.0, 0.0);
    }
    
    public Bird(double wingSize, double weight, double height){
        this.wingSize = wingSize;
        this.weight = weight;
        this.height = height;
    }
    
    public void eat(double food){
        if (food <= 0){
            System.out.println("Input cannot be negative number");
        }
        else{
            setWeight(getWeight()+food);
        }
    }
    
    public void setWingSize(double s){
        wingSize = s;
    }
    
    public double getWingSize(){
        return wingSize;
    }
    
    public void setWeight(double w){
        weight = w;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setHeight(double h){
        height = h;
    }
    
    public double getHeight(){
        return height;
    }
}
