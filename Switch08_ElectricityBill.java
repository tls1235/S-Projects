import java.util.Scanner;

public class Switch08_ElectricityBill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kWh;
    double bill = 0;
    System.out.print("Enter the monthly consumption in kWh: ");
    kWh = sc.nextInt();
    System.out.println("consumption: " + kWh + "kWh");
    if (kWh > 300) {
      bill = 100 * 0.5 + 200 * 0.75 + (kWh - 300) * 1.25;
    } else if (kWh > 100) {
      bill = 100 * 0.5 + (kWh - 100) * 0.75;
    } else {
      bill = kWh * 0.5;
    }
    System.out.println("total bill: " + bill);
    sc.close();
  }
}
