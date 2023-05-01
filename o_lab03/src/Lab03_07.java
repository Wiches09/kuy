import java.util.*;
public class Lab03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int odd = 0, even = 0;
        while (num != -1)
            num = sc.nextInt();
            if ((num%2) != 0){
                odd += 1;
            }
            else{
                even += 1;
            }
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}
