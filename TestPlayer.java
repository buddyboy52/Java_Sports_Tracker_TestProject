public class TestPlayer
{
    // Our 4 hard coded players
    private static FootballPlayer player1 = new FootballPlayer("Jon", "Doe", 28, 240, 74, 40, 85, 1834);
    private static FootballPlayer player2 = new FootballPlayer("Andrew", "McCloud", 21, 200, 36, 35, 47, 2012);
    private static FootballPlayer player3 = new FootballPlayer("Kade", "Thunderbull", 22, 170, 96, 75, 52, 1942);
    private static FootballPlayer player4 = new FootballPlayer("Jason", "Dillman", 21, 165, 84, 49, 102, 1928);


    public static void main(String[] args)
    {

        // Call our display method so we don't repeat as much
        display(player1);
        display(player2);
        display(player3);
        display(player4);
        

    }

    // Create a method to display the football players
    public static void display(FootballPlayer player){

        System.out.println(player.displayPlayer());
        System.out.println(player.toString());
        System.out.println("\n");

    }
}
