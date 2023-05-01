import java.util.*;
public class Lab02 {

    public static void main(String[] args   ) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        if( money > 50000){
            System.out.println(money*0.1);
        } 
        else{
            System.out.println(money*0.05);
        }
    }
    
}
