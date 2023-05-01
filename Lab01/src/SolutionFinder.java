

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SolutionFinder {
    public static void main(String[] args) {
        double a = 4, b = 8, c = 3, x, y;
        x = (-b + sqrt(pow(b,2)-4*a*c))/(2*a);
        y = (-b - sqrt(pow(b,2)-4*a*c))/(2*a);
        System.out.println(x);
        System.out.println(y);
    }
}
