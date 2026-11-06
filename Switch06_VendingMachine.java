import java.util.Scanner;

public class Switch06_VendingMachine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int code;
    double amount;
    double price = 0;
    boolean isValid = true;
    System.out.print("Enter the product code (1-4): ");
    code = sc.nextInt();
    System.out.print("enter amount inserted: ");
    amount = sc.nextDouble();
    switch (code) {
    case 1:
      price = 6;
      break;
    case 2:
      price = 8.5;
      break;
    case 3:
      price = 5.5;
      break;
    case 4:
      price = 14;
      break;
    default:
      isValid = false;
      System.out.println("invalid code");
      break;
    }
    if (isValid) {
      System.out.println("product price: " + price);
      if (amount < price) {
        System.out.println("amount missing: " + (price - amount));
      } else {
        System.out.println("change: " + (amount - price));
      }
    }
    sc.close();
  }
}
