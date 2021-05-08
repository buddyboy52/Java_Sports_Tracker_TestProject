import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;


public class retrievePlayer {

    static String player;

    public static String pullTeam(){

        try{

        File players = new File("playersData.txt");
        Scanner reader = new Scanner(players);

        while (reader.hasNextLine()){

            player = player + "<br/>" + reader.nextLine();

        }

        player = "<html>" + player + "</html>";

        reader.close();

    } catch (FileNotFoundException e){

        JOptionPane.showMessageDialog(null, "Error");

    }

        return player;

    }


    
    
}
