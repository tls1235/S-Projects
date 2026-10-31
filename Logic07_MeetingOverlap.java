import java.util.Scanner;

public class Logic07_MeetingOverlap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the start and ending hour of the first meeting: ");
    int firstStart = sc.nextInt(), firstEnd = sc.nextInt();
    System.out.print("enter the start and ending hour of the second meeting: ");
    int secondStart = sc.nextInt(), secondEnd = sc.nextInt();
    if (firstEnd > secondStart) {
      System.out.println("the meetings overlap");
    } else {
      System.out.println("the meetings dont overlap");
    }
    sc.close();
  }
}
