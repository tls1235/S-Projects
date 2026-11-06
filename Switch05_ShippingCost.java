import java.util.Scanner;

public class Switch05_ShippingCost {
  public static void main(String[] args) {
    double weight;
    double shipping;
    boolean isValid = true;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the package weight in kg: ");
    weight = sc.nextDouble();
    System.out.println("weight: " + weight + "kg");
    if (weight <= 1) {
      shipping = 15;
    } else if (1 < weight && weight <= 5) {
      shipping = 28;
    } else if (5 < weight && weight <= 20) {
      shipping = 45;
    } else if (weight > 20) {
      shipping = 45 + (weight - 20) * 2.5;
    } else {
      shipping = 0;
      isValid = false;
    }
    if (isValid) {
      System.out.println("shipping cost: " + shipping);
    }
    sc.close();
  }
}
