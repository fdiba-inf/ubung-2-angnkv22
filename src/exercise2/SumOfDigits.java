package exercise2;
  import java.util.Scanner;
  public class SumOfDigits  {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println ("Gib eine Zahl zwischen 0 und 999 ein: ");
 int number = input.nextInt();
 int i1 = number%10;
 number = number/10;
 int i2 = number%10;
 number = number/10;
 int i3 = number%10;
 number = number/10;
System.out.println("Sum of digits: " + (i1 + i2 + i3));
  }
}
