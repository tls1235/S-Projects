import java.util.Scanner;

public class Switch04_AirQuality {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the AQI value: ");
    int AQI = sc.nextInt();
    System.out.println(AQI);
    if (0 <= AQI && AQI <= 50) {
      System.out.println("level: healthy\nrecommendation: no restrictions");
    } else if (51 <= AQI && AQI <= 100) {
      System.out.println("level: moderate\nrecommendation: limit outdoor activity");
    } else if (101 <= AQI && AQI <= 150) {
      System.out.println("level: unhealthy for sensitive groups\nrecommendation: children and elderly stay indoors");
    } else if (151 <= AQI && AQI <= 200) {
      System.out.println("level: unhealthy\nrecommendation: limit outdoor activity");
    } else if (AQI > 200) {
      System.out.println("level: very unhealthy\nrecommendation: stay indoors");
    } else {
      System.out.println("invalid value");
    }
    sc.close();
  }
}
