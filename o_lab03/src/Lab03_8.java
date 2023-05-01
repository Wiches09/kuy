import java.util.*;

public class Lab03_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int x = 1; x<= num ; x+= 1)
            if(x%5 == 0){
                System.out.print("/");
            }
            else{
                System.out.print("|");
            }
    }
}
