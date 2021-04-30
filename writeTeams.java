import java.io.*;
import java.io.IOException;

public class writeTeams {

	
	public static void writeFile(Teams team) {
		
		try {

			// File writer to write data to 
			FileWriter writeFile = new FileWriter("teamsData.txt");
			
			// send data to string variables
			String teamStats = team.displayTeamStatistics();
			String team_data = team.toString();
			
			// Write and close data to file 
			writeFile.write(teamStats);
			writeFile.write("\n-------------\n");
			writeFile.write(team_data);
			writeFile.close();

			System.out.println("Successfully Wrote!");
			
			
			
		}catch(IOException e) {
			//catch errors and display error message
			System.out.println("An error has ocurred");
			e.printStackTrace();

		}
		
	}
	
}
