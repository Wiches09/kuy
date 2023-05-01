
package mock2;

public abstract class Spell {
    private final String name;
    private int damage;
    
    public Spell(){
        this("");
    }
    
    public Spell(String name){
        this.name = name;
    }
    
    public abstract String getName();
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public int getDamage(){
        return damage;
    }
}
