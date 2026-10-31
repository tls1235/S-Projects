import java.util.Scanner;

public class Logic09_TriangleCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the lengths of 3 sides of a triangle: ");
    double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();
    if (s1 > s2 + s3 || s2 > s1 + s3 || s3 > s1 + s2) {
      System.out.println("the sides cant form a triangle");
    } else {
      System.out.println("the sides can form a triangle");
      if (s1 == s2 || s1 == s3 || s2 == s3) {
        System.out.println("the triangle is isosceles");
      } else {
        System.out.println("the triangle is not isosceles");
      }
    }
    sc.close();
  }
}
