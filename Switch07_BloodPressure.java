import java.util.Scanner;

public class Switch07_BloodPressure {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int systolic;
    int diastolic;
    System.out.print("Enter the systolic value: ");
    systolic = sc.nextInt();
    System.out.print("Enter the diastolic value: ");
    diastolic = sc.nextInt();
    System.out.println("blood pressure: " + systolic + "/" + diastolic);
    System.out.print("category: ");
    if (systolic >= 140 || diastolic >= 90) {
      System.out.println("stage 2 hypertension");
    } else if (systolic >= 130 || diastolic >= 80) {
      System.out.println("stage 1 hypertension");
    } else if (systolic >= 120) {
      System.out.println("elevated");
    } else {
      System.out.println("normal");
    }
    sc.close();
  }
}
