import java.util.Scanner;

public class TestTeams
{

     static  Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        // Get user input for team names
        System.out.println("Please enter team one's name: ");
        String teamOne = input.nextLine();
        System.out.println("Please enter team two's name: ");
        String teamTwo = input.nextLine();
        System.out.println("Please enter team three's name: ");
        String teamThree = input.nextLine();
        System.out.println("Please enter team fours's name: ");
        String teamFour = input.nextLine();

        // Initialize teams
        Teams team1 = new Teams(1, 20, teamOne, 5, 2, 4, 800);
        Teams team2 = new Teams(4, 20, teamTwo, 5, 0, 1, 300);
        Teams team3 = new Teams(2, 20, teamThree, 5, 4, 6, 750);
        Teams team4 = new Teams(3, 20, teamFour, 5, 0, 2, 600);

        // Print team info
        System.out.println(team1.toString());
        System.out.println(team2.toString());
        System.out.println(team3.toString());
        System.out.println(team4.toString());

        // Print team statistics
        System.out.println(team1.displayTeamStatistics());
        System.out.println(team2.displayTeamStatistics());
        System.out.println(team3.displayTeamStatistics());
        System.out.println(team4.displayTeamStatistics());
    }
}
