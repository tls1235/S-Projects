import java.util.Scanner;

public class Switch02_CurrencyExchange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double rate = 0;
    double value;
    boolean isValid = true;
    System.out.print("Enter currency code (1=USD, 2=EUR, 3=GBP): ");
    switch (sc.nextInt()) {
    case 1:
      rate = 3.75;
      break;
    case 2:
      rate = 4.25;
      break;
    case 3:
      rate = 5;
      break;
    default:
      isValid = false;
    }
    if (isValid) {
      System.out.print("Enter the amount in the foreign currency: ");
    } else {
      System.out.println("the number entered is not valid");
    }
    value = sc.nextDouble();
    if (isValid) {
      System.out.println("amount in shekels: " + value * rate);
    }
    sc.close();
  }
}
