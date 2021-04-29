public class FootballPlayer extends Player
{
    // Variables
    private int gamesPlayed;
    private int gamesWon;
    private int touchdowns;
    private int rushingYards;
    private String playerTeam;
    // Statistics
    private double winPercentage;
    private double avgTDsPerGame;
    private double avgRushingYardsPerGame;

    // Our constructor with parameters
    public FootballPlayer(String firstName, String lastName, int age, int weightLbs, String playerTeam, int gamesPlayed, int gamesWon, int touchdowns, int rushingYards)
    {
        super(firstName, lastName, age, weightLbs);
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.touchdowns = touchdowns;
        this.rushingYards = rushingYards;
        this.playerTeam = playerTeam;

        // Calculate the statistics
        calculateStatistics();
    }

    /***
     * Getters and setters
     */
    public int getGamesPlayed()
    {
        return this.gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed)
    {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon()
    {
        return this.gamesWon;
    }

    public void setGamesWon(int gamesWon)
    {
        this.gamesWon = gamesWon;
    }

    public int getTouchdowns()
    {
        return this.touchdowns;
    }

    public void setTouchdowns(int touchdowns)
    {
        this.touchdowns = touchdowns;
    }

    public void setTeam(String playerTeam){
        this.playerTeam = playerTeam;
    }

    public int getRushingYards()
    {
        return this.rushingYards;
    }

    public void setRushingYards(int rushingYards)
    {
        this.rushingYards = rushingYards;
    }

    public String getWinPercentage()
    {
        String result = String.format("%.2f", (this.winPercentage*100));
		return result + "%";
	}

    public double getAvgTDsPerGame()
    {
		return this.avgTDsPerGame;
	}

    public double getAvgRushingYardsPerGame()
    {
		return this.avgRushingYardsPerGame;
	}
    
    private String getTeam()
    {
        return this.playerTeam;
    }



    public void calculateStatistics()
    {
        this.winPercentage = calcWinPercent(this.gamesPlayed, this.gamesWon);
        this.avgTDsPerGame = calcAvgTDs(this.gamesPlayed, this.touchdowns);
        this.avgRushingYardsPerGame = calcAvgRushingYards(this.gamesPlayed, this.rushingYards);
    }

    private double calcWinPercent(int gamesPlayed, int gamesWon)
    {
        return (double)gamesWon / (double)gamesPlayed;
    }

    private double calcAvgTDs(int gamesPlayed, int touchdowns)
    {
        return (double)touchdowns / (double)gamesPlayed;
    }

    private double calcAvgRushingYards(int gamesPlayed, int rushingYards)
    {
        return (double)rushingYards / (double)gamesPlayed;
    }

    // Our toString method to display the players
    @Override
    public String toString()
    {
        return super.getFirstName() + " " + super.getLastName() + "\n"
                + "Sport: Football\n"
                + "Team: " + getTeam() + "\n"
                + "Age: " + super.getAge() + "\n"
                + "Weight (lbs): " + super.getWeightLbs() + "\n"
                + "Games played: " + getGamesPlayed() + "\n"
                + "Games won: " + getGamesWon() + "\n"
                + "Touchdowns: " + getTouchdowns() + "\n"
                + "Rushing yards: " + getRushingYards() + "\n";
    }

    // Our displayPlayer method
    public String displayPlayer()
    {
        return super.getFirstName() + " " + super.getLastName() + " is a football player.\n"
                + "Here are some statistics:\n"
                + "Win percent: " + getWinPercentage() + "\n"
                + "Average touchdowns: " + getAvgTDsPerGame() + "\n"
                + "Average rushing yards: " + getAvgRushingYardsPerGame() + "\n";
    }
}
