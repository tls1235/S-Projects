import java.util.Scanner;

public class Logic03_RideEntry {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the age: ");
    int age = sc.nextInt();
    System.out.print("enter the height in cm: ");
    int height = sc.nextInt();
    if (age >= 12 && height >= 140) {
      System.out.println("entry is allowed");
    } else {
      System.out.println("entry is not allowed");
    }
    sc.close();
  }
}
