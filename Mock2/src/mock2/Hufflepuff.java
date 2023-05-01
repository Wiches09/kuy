
package mock2;

public class Hufflepuff extends Houses implements Magicable{
    public Hufflepuff(){
        super("Hufflepuff","Yellow");
    }
    
    public void attackSpell(Player player, Player target, Spell spell){
        if (spell.getName().equals("Incendio")){
            target.setHP(player.getAttackDamage()+spell.getDamage());
            player.setMana(player.getMana()-3);
        }
        else if (spell.getName().equals("Expelliarmus")){
            target.setHP(player.getAttackDamage()+spell.getDamage());
            player.setMana(player.getMana()-4);
        }
        System.out.println("["+player.getName()+"] : use spell ("+spell.getName()+")!");
    }
    
    public void defense(Player player, Player damager){
       player.setHP(4+player.getHP());
       player.setMana(player.getMana()+3);
       System.out.println("["+player.getName()+"]: Protego !");
    }
}
