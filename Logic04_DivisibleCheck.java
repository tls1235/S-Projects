import java.util.Scanner;

public class Logic04_DivisibleCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter an integer: ");
    int num = sc.nextInt();
    System.out.println("the number is: " + num);
    System.out.print("the number is divisible by both 3 and 5: ");
    if (num % 3 == 0 && num % 5 == 0) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
    System.out.print("divisible by atleast one of them: ");
    if (num % 3 == 0 || num % 5 == 0){
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
    sc.close();
  }
}
