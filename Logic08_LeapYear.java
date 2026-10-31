import java.util.Scanner;

public class Logic08_LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a year: ");
    int year = sc.nextInt();
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("year " + year + " is a leap year");
    } else {
      System.out.println("year " + year + " is not a leap year");
    }
    sc.close();
  }
}
