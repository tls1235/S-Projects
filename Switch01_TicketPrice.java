import java.util.Scanner;

public class Switch01_TicketPrice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double price;
    int count;
      System.out.print("Enter passenger type code (1=child, 2=student, 3=adult, 4=senior): ");
    switch (sc.nextInt()) {
    case 1:
      price = 20;
      break;
    case 2:
      price = 32.5;
      break;
    case 3:
      price = 45;
      break;
    case 4:
      price = 25;
      break;
    default:
      price = 99999;
      break;
    }
      System.out.print("enter the amount of tickets: ");
    count = sc.nextInt();
    System.out.println("price per ticket: " + price);
    System.out.println("total price: " + price * count);
    sc.close();
  }
}
