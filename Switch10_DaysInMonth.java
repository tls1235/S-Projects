import java.util.Scanner;

public class Switch10_DaysInMonth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year, month;
    System.out.print("Enter the month number (1-12): ");
    month = sc.nextInt();
    System.out.print("Enter the year: ");
    year = sc.nextInt();
    switch (month) {
    case 1, 3, 5, 7, 8, 10, 12: {
      System.out.println("Days in the month: 31");
      break;
    }
    case 4, 6, 9, 11: {
      System.out.println("Days in the month: 30");
      break;
    }
    case 2: {
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println("Days in the month: 29");
      } else {
        System.out.println("Days in the month: 28");
      }
      break;
    }
    default:
      System.out.println("invalid month");
      break;
    }
    sc.close();
  }
}
