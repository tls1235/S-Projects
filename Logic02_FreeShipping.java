import java.util.Scanner;

public class Logic02_FreeShipping {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of the order: ");
    double value = sc.nextDouble();
    System.out.print("enter the amount of items bought: ");
    int count = sc.nextInt();
    if (value >= 200 || count >= 10) {
      System.out.println("free shipping");
    } else {
      System.out.println("shipping fee: 25");
      value += 25;
    }
    System.out.println("total to pay: " + value);
    sc.close();
  }
}
