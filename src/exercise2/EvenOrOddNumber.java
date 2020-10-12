package exercise2;
import java.util.Scanner;
public class EvenOrOddNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Gib eine Zahl ein: ");
    int number = input.nextInt();
    if (number%2 == 0) {
      System.out.println("Die Zahl ist gerade");
    }
    else {
      System.out.println("Die Zahl ist ungerade");
    }
  }

}