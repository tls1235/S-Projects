import java.util.Scanner;

public class Switch09_HandGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean isValid = true;
    int x1, x2;
    System.out.print("Enter player 1 choice (1=rock, 2=paper, 3=scissors): ");
    x1 = sc.nextInt();
    System.out.print("Enter player 2 choice (1=rock, 2=paper, 3=scissors): ");
    x2 = sc.nextInt();
    System.out.print("player 1 chose: ");
    switch (x1) {
    case 1:
      System.out.println("rock");
      break;
    case 2:
      System.out.println("paper");
      break;
    case 3:
      System.out.println("scissors");
      break;
    default:
      isValid = false;
      System.out.println("invalid option");
    }
    System.out.print("player 2 chose: ");
    switch (x2) {
    case 1:
      System.out.println("rock");
      break;
    case 2:
      System.out.println("paper");
      break;
    case 3:
      System.out.println("scissors");
      break;
    default:
      isValid = false;
      System.out.println("invalid option");
    }
    if (isValid) {
      if (x1 == x2) {
        System.out.println("tie");
      } else if (x1 == x2 % 3 + 1) {
        System.out.println("player 1 won");
      } else if (x1 % 3 + 1 == x2) {
        System.out.println("player 2 won");
      } else {
        System.out.println("error");
      }
    }
    sc.close();
  }
}
