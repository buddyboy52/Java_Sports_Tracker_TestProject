import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;

public class retrieveTeam {

    static String team;

    public static String pullTeam(){

        try{

        File players = new File("teamsData.txt");
        Scanner reader = new Scanner(players);

        while (reader.hasNextLine()){

            team = team + "<br/>" + reader.nextLine();

        }

        team = "<html>" + team + "</html>";

        reader.close();

    } catch (FileNotFoundException e){

        JOptionPane.showMessageDialog(null, "Error");

    }

        return team;

    }
    
}
