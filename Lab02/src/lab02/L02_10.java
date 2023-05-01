import java.util.*;

public class L02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in Uppercase) : ");
        char types = sc.next().charAt(0);
        if(types == 'A' | types == 'C'){
            System.out.print("Yoru total money in one year = " + (money+(money*0.015)));
        }
        else if(types == 'B'){
            System.out.print("Yoru total money in one year = " + (money+(money*0.02)));
        }
        else if(types == 'X'){
            System.out.print("Yoru total money in one year = " + (money+(money*0.05)));
        }
        
    }
}
