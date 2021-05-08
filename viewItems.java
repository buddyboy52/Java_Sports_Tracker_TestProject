import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewItems extends JFrame{
	
	static int width = 400;
	static int height = 200;
	
	// Create our GUI object
	GUI guiFrame = new GUI();
	
	private static JFrame smallFrame = new JFrame();
	private static JFrame bigFrame = new JFrame();
	
	private static JPanel smallPanel = new JPanel();
	private static JPanel bigPanel = new JPanel();

	private static JButton btnTeams = new JButton();
	private static JButton btnPlayers = new JButton();

	private static JLabel lblDisplay = new JLabel();

	// ------------------------------------------------------- \\

	private static String retrievedItem;
	
	public static void createView() {
		
		smallFrame.setSize(width, height);
		smallFrame.setVisible(true);
		smallFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		smallFrame.setResizable(false);
		smallFrame.add(smallPanel);

		smallPanel.setLayout(null);
		smallPanel.add(btnTeams);
		smallPanel.add(btnPlayers);

		smallPanel.setBackground(Color.RED);

		btnPlayers.setBounds((width/2) - 166, 75, 150, 50);
		btnPlayers.setText("View Players");
		btnPlayers.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnTeams.setBounds((width/2) - 11, 75, 150, 50);
		btnTeams.setText("View Teams");
		btnTeams.setHorizontalAlignment(SwingConstants.CENTER);

		btnPlayers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				createFrame();
				viewPlayers();

			}					
					
		});

		btnTeams.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				createFrame();
				viewTeams();

			}					
					
		});
		
	}

	public static void createFrame(){

		width = GUI.WIDTH;
		height = GUI.HEIGHT;

		bigFrame.setSize(width, height);
		bigFrame.setResizable(true);
		bigFrame.setVisible(true);
		smallFrame.setVisible(false);
		bigFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		bigFrame.add(bigPanel);

		bigPanel.add(lblDisplay);
		
		lblDisplay.setBounds(0,0,width - 6, height - 6);


	}

	public static void viewTeams(){

		retrieveTeam team = new retrieveTeam();

		retrievedItem = team.pullTeam();

		System.out.println(retrievedItem);

		lblDisplay.setText(retrievedItem);

	}
	

	public static void viewPlayers(){

		retrievePlayer player = new retrievePlayer();

		retrievedItem = player.pullTeam();

		lblDisplay.setText(retrievedItem);

	}
	

}
