
package mock2;

public class Houses {
    private String name;
    private String color;
    
    public Houses(){
        this("", "");
    }
    
    public Houses(String name, String color){
        setName(name);
        setColor(color);
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "House : "+name+", Color : "+color;
    }
}
