import java.util.Scanner;
import java.lang.Math;

public class EquationSolver_GF{
    public static void EquationSolver(double a, double b, double c){
        if (a == 0) {
            System.out.println("This equation has only one root x = ");
        }
        else {
            double d = b*b - 4*a*c;
            if (d < 0) {
                System.out.println("This equation has two complex roots: ");
                double x1 = (-b - Math.sqrt(d)) / (2*a);
                double x2 = (-b + Math.sqrt(d)) / (2*a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if (d == 0) {
                System.out.println("This equation has one double root: ");
                double x = - b / (2*a);
                System.out.println("x - " + x);
            }
            else {
                System.out.println("This equation has two real roots: ");
                double x1 = (-b - Math.sqrt(d)) / (2*a);
                double x2 = (-b + Math.sqrt(d)) / (2*a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    public static void main(String args[]){
        Scanner params = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = params.nextInt();
        System.out.println("Enter b:");
        double b = params.nextInt();
        System.out.println("Enter c:");
        double c = params.nextInt();
        EquationSolver(a, b, c);
    }
}