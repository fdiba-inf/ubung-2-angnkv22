package exercise2;
 import java.util.Scanner;
  public class DayOfWeek  {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println ("Gib eine Zahl zwischen 1 und 7 ein: ");
    int number = input.nextInt();
      if (number == 1) {
      System.out.println("Tag der Woche: Monday");
      }
      else if (number == 2) {
        System.out.println("Tag der Woche: Tuesday");
      }
      else if (number == 3) {
        System.out.println("Tag der Woche: Wednesday");
      }
      else if (number == 4) {
        System.out.println("Tag der Woche: Thursday");
      }
      else if (number == 5) {
        System.out.println("Tag der Woche: Friday");
      }
      else if (number == 6) {
        System.out.println("Tag der Woche: Saturday");
      }
      else if (number == 7) {
        System.out.println("Tag der Woche: Sunday");
      }
      else {
       System.out.println("Tag der Woche: Invalid day");
     }
  }
}
