import java.util.Scanner;

public class Logic05_PointInRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the width and height of the rectangle: ");
    double width = sc.nextDouble(), height = sc.nextDouble();
    System.out.print("enter the x and y of the point: ");
    double x = sc.nextDouble(), y = sc.nextDouble();
    if (width >= x && height >= y) {
      System.out.println("the point is inside the rectangle");
    }
    if (!(width >= x && height >= y)) {
      System.out.println("the point is outside the rectangle");
    }
    sc.close();
  }
}
