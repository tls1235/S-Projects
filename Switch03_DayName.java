import java.util.Scanner;

public class Switch03_DayName {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the day number (1-7): ");
    System.out.print("day: ");
    switch (sc.nextInt()) {
    case 1:
      System.out.println("sunday\ntype: weekday");
      break;
    case 2:
      System.out.println("monday\ntype: weekday");
      break;
    case 3:
      System.out.println("tuesday\ntype: weekday");
      break;
    case 4:
      System.out.println("wednesday\ntype: weekday");
      break;
    case 5:
      System.out.println("thursday\ntype: weekday");
      break;
    case 6:
      System.out.println("friday\ntype: weekend");
      break;
    case 7:
      System.out.println("saturday\ntype: weekend");
      break;
    }
    sc.close();
  }
}
