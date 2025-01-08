import java.util.Scanner;
class Bowler {
    String name;
    int wickets, matches, balls_bowled, runs_conceded;
    public Bowler() {
    }
    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }


    private boolean hasError() {
        return wickets < 0 || runs_conceded < 0 || matches < 0 || balls_bowled < 0 || (matches == 0 && (runs_conceded > 0 || balls_bowled > 0));
    }
    public void computeBowlingAverage() {
        if (hasError()) {
            System.out.println("Error");
        } else {
            double avg = (wickets == 0) ? 0.0 : (double) runs_conceded / wickets;
            System.out.println("Name: " + name);
            System.out.println("bowling_avg=" + avg);
        }
    }
    public void showStatistics() {
        if (hasError()) {
            System.out.println("Error");
        } else {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + balls_bowled);
            System.out.println("runs_conceded=" + runs_conceded);
        }
    }
    public void computeStrikeRate() {
        if (hasError()) {
            System.out.println("Error");
        } else {
            double strikeRate = (balls_bowled == 0) ? 0.0 : (double) runs_conceded / balls_bowled;
            System.out.println("Name: " + name);
            System.out.println("Strike_rate=" + strikeRate);
        }
    }
}

public class PS003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bowler's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of wickets: ");
        int wickets = scanner.nextInt();
        System.out.print("Enter number of matches: ");
        int matches = scanner.nextInt();
        System.out.print("Enter number of balls bowled: ");
        int balls_bowled = scanner.nextInt();
        System.out.print("Enter number of runs conceded: ");
        int runs_conceded = scanner.nextInt();
        Bowler bowler = new Bowler(name, wickets, matches, balls_bowled, runs_conceded);
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
        scanner.close();
    }
}
