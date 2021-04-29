import java.io.*;

public class writePlayers {
	
	public static void writeFile(FootballPlayer player) {
		
		try {
			
			File playerFile = new File("C:\\Users\\talk2\\OneDrive - Western Nebraska Community College\\Documents\\New folder\\java-team-sports-tracker-guild-5-runtime-terror\\.git\\java-team-sports-tracker-guild-5-runtime-terror\\playersData.txt");
			
			FileWriter writeFile = new FileWriter("playersData.txt");
			
			String playerStats = player.displayPlayer();
			String playerData = player.toString();
			
			writeFile.write(playerStats);
			writeFile.write("\n-------------\n");
			writeFile.write(playerData);
			writeFile.close();

			System.out.println("Successfully Wrote!");
			
			
			
		}catch(IOException e) {
			
			System.out.println("An error has ocurred");
			e.printStackTrace();
			
		}
		
	}

}
