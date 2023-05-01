/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olab_04;

/**
 *
 * @author helld
 */
/*import java.util.*;// MyAdd2
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyAdd2 obj = new MyAdd2();
    
        System.out.println("Please insert number1 : ");
        int x = sc.nextInt();
        System.out.println("Please insert number2 : ");
        int num = sc.nextInt();
        System.out.println("The result#1 is "+num);
    
        int result = obj.AddTwo(x);
        System.out.println("The result#1 is "+ result);
        
        result = obj.AddNum(x+5, num);
        System.out.println("The result#2 is "+ result);
        
        result = obj.AddTwo(x*3+2);
        System.out.println("The result#3 is "+ result);
    }
}
*/

/* Student
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();
    }
}
*/

/* Fraction 1
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before "+ f1.toFraction());
        System.out.println("before "+ f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after "+ f1.toFraction());
        System.out.println("after "+ f1.toFloat());
    }
}
*/

/* Fraction 2
public class Main{
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        Fraction f2 = new Fraction();
        f2.topN = 4;
        f2.btmN = 16;
        Fraction f3 = new Fraction();
        f3.topN = 5;
        f3.btmN = 15;
 
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());
    }
}
*/

/*/ CAT
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.defineCat("Mew","White");
        c.speak();
        c.upWeight(5);
        c.upHeight(10);
        c.speak();
        c.upWeight(-5);
        c.upHeight(-10);
        c.downWeight(-2);
        c.speak();
 }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.name = "Taravichet";
 
        MyDate dob = new MyDate();
        dob.day = 8;
        dob.month = 11;
        dob.year = 2023;
 
        Account acct = new Account();
        acct.name = c.name;
        acct.balance = 500;
 
        c.DOB = dob;
        c.acct = acct;
 
        System.out.println("My name is " + c.name + ".");
 
        c.acct.showInfo();
        c.DOB.showDate();
 
        c.acct.deposit(500);
        c.acct.showInfo();
        c.acct.withdraw(3000);
        c.acct.showInfo();
 
 }
}
*/