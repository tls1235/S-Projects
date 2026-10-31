import java.util.Scanner;

public class Logic01_ComfortRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the room temp: ");
    int temp = sc.nextInt();
    if (temp > 18 && temp < 24) {
      System.out.println("the room temp is comfortable");
    } else {
      System.out.println("the room temp isnt comfortable");
    }
    sc.close();
  }
}
