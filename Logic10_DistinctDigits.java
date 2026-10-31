import java.util.Scanner;

public class Logic10_DistinctDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a 3 digit number: ");
    int num = sc.nextInt();
    if (num / 1000 == 0) {
      int hundreds = num / 100, tens = num / 10 % 10, units = num % 10;
      System.out.println("hundreds digit: " + hundreds);
      System.out.println("tens digit: " + tens);
      System.out.println("units digit: " + units);
      System.out.print("all digits are different: ");
      if (hundreds != tens && hundreds != units && tens != units) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
      System.out.print("all digits are even: ");
      if (hundreds % 2 == 0 && tens % 2 == 0 && units % 2 == 0) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    } else {
      System.out.println("you didnt enter a 3 digit number");
    }
    sc.close();
  }
}
