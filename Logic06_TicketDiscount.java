import java.util.Scanner;

public class Logic06_TicketDiscount {
  public static void main(String[] args) {
    int pricePerTicket = 45;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the age and number of tickets: ");
    int age = sc.nextInt();
    double tickets = sc.nextDouble();
    double total=pricePerTicket*tickets;
    System.out.println("total before discounts: " + total);
    if (age<=18 || age>=65){
      total*=0.75;
    }
    if (tickets>=4 && total>=150){
      total-=10;
    }
    System.out.println("total to pay: " + total);
    sc.close();
  }
}
