public class Teams
{
    // Variables
    private int teamRank;
    private int teamPlayers;
    private String teamName;
    private int gamesPlayed;
    private int gamesWon;
    private int touchdowns;
    private int rushingYards;
    // Statistics
    private double winPercentage;
    private double avgTDsPerGame;
    private double avgRushingYardsPerGame;

    // Create our constructor
    public Teams(int teamRank, int teamPlayers, String teamName, int gamesPlayed, int gamesWon, int touchdowns, int rushingYards)
    {
        this.teamRank = teamRank;
        this.teamPlayers = teamPlayers;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.touchdowns = touchdowns;
        this.rushingYards = rushingYards;

        calculateStatistics();
    }

    // Getters and Setters
    public int getTeamRank()
    {
        return this.teamRank;
    }

    public int getTeamPlayers()
    {
        return this.teamPlayers;
    }

    public String getTeamName()
    {
        return this.teamName;
    }

    public void setTeamRank(int teamRank)
    {
        this.teamRank = teamRank;
    }

    public void setTeamPlayers(int teamPlayers)
    {
        this.teamPlayers = teamPlayers;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

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

    public int getRushingYards()
    {
        return this.rushingYards;
    }

    public void setRushingYards(int rushingYards)
    {
        this.rushingYards = rushingYards;
    }

    public double getAvgTDsPerGame()
    {
		return this.avgTDsPerGame;
	}

    public double getAvgRushingYardsPerGame()
    {
		return this.avgRushingYardsPerGame;
	}
    
    public String getWinPercentage()
    {
        String result = String.format("%.2f", (this.winPercentage*100));
		return result + "%";
	}

    // Calculate Statistics
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
    
    // The toString method to show team info
    @Override
    public String toString()
    {
        return "Team Name: " + getTeamName() + "\n"
            + "Team Rank: " + getTeamRank() + "\n"
            + "Player Count: " + getTeamPlayers() + "\n";
    }

    // The displayPlayer method to show team statistics
    public String displayTeamStatistics()
    {
        return "Win percent: " + getWinPercentage() + "\n"
        + "Average touchdowns: " + getAvgTDsPerGame() + "\n"
        + "Average rushing yards: " + getAvgRushingYardsPerGame() + "\n";
    }
}
