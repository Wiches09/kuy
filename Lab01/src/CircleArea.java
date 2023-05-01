
import static java.lang.Math.pow;
import java.util.Scanner;


public class CircleArea {
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = pow(radius,2)*Math.PI;
        System.out.println(area);
    }
}
