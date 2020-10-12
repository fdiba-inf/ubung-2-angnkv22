package exercise2;
import java.util.Scanner;
public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("Gib Wert für a");
        double b = input.nextDouble();
        System.out.println("Gib Wert für b");
        double c = input.nextDouble();
        System.out.println("Gib Wert für c");

      if (a != 0) {
      double discriminante = b*b-4*a*c;

      if (discriminante >= 0) {
        double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
        System.out.println(x1 + ", " + x2); 
        }
      else {
          System.out.println("Imaginäre Werte");
        }
        }
      else if (b != 0) {
      double x = -c/ b;
      System.out.println(x);
        }
      else if (b == 0 & c != 0) {
      System.out.println("Keine Werte");
    }
         else {
      System.out.println("Mehrere Werte");
    }

  }

}