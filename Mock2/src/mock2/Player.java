package mock2;


public class Player {
    private String name;
    private int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    
    public Player(){
        this("",0);
    }
    
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    
    public Player(int hp){
        name = "";
        this.hp = hp;
    }
    
    public Player(String name){
        this.name = name;
        hp = 0;
    }
    
    public int getAttackDamage(){
        return attackDamage;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getHP(){
        return hp;
    }
    
    public void setHP(int hp){
        if (hp < 0 ){
            this.hp = 0;
        }
        else if (hp > 20){
            this.hp = 20;
        }
        else{
            this.hp = hp;
        }
    }
    
    public void setMana(int mana){
        if (mana < 0 ){
            this.mana = 0;
        }
        else if (mana > 50){
            this.mana = 50;
        }
        else{
            this.mana = mana;
        }
    }
    
    public int getMana(){
        return mana;
    }
    
    public void setHouses(Houses houses){
        this.houses = houses;
    }
    
    public Houses getHouses(){
        return houses;
    }
    
    public String toString(){
        return "[Player] : "+name+" HP: "+hp+" Mana: "+mana+" || "+houses;
    }
    
    public boolean equals(Player player){
        return player.name.equals(name) & player.houses == houses;
    }
    
    public void attack(Player target, Spell spell){
       houses.Houses(houses.getName(),houses.getColor()).attackSpell(this, target, spell);
       if (target.getHP() <= 0){
           System.out.println("[DEAD]: "+target.getName()+" was killed by "+name);
       }
    }
    
    public void protectFromPlayer(Player target){
        houses.defense(target);
    }
}
