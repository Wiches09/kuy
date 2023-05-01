
package mock1;

public class abstract Bird extends Animal implements Flyable{
    public Bird(String name, int age){
        setName(name);
        setAge(age);
        setPower(150);
    }
    
    public abstract void wingAttack(Animal a);
}
