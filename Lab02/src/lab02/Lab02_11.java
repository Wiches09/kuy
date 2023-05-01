import java.util.*;

public class Lab02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert your number of working days : ");
        int w_days = sc.nextInt();
        System.out.print("Please insert your number of absent days : ");
        int a_days = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = sc.nextDouble();
        int sal = 0;
        
        // Find Salary and Print
        System.out.println("Hi, "+name);
        System.out.print("Your salary is ");
        if (21 <= age && age <= 30){
            sal = (w_days*300)-(a_days*50);
            System.out.println(sal+" Baht");
        }
        else if (30 < age && age <= 40){
            sal = (w_days*500)-(a_days*50);
            System.out.println(sal+" Baht");
        }
        else if (40 < age && age <= 50){
            sal = (w_days*1000)-(a_days*25);
            System.out.println(sal+" Baht");
        }
        else if (50 < age && age <= 60){
            sal = (w_days*3000);
            System.out.println(sal+" Baht");
        }
        
        // Find Bonus and Print
        System.out.print("Your salary and Bonus is ");
        if (10 < weight & weight <= 60){
            System.out.println((sal+5000)+" Baht");
        }
        else if (60 < weight & weight <= 90){
            System.out.println((sal+(5000-((weight-60)*10)))+" Baht");
        }
        else if (weight > 90){
            System.out.println(sal+" Baht");
        }
    }
}
