import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class enterTeams extends GUI
{	
	// Declare our finals
	static final int WIDTH = GUI.WIDTH;
	static final int HEIGHT = GUI.HEIGHT;
	
	// ----------- Create Objects ----------- \\
	static GUI guiFrame = new GUI();
	static writeTeams writeTheTeams = new writeTeams();
		
	private static JFrame frame = new JFrame();
		
	private static JPanel enterTeamPanel = new JPanel();
	
	// Textboxes
	private static JTextField txtTeamRank = new JTextField();
	private static JTextField txtTeamPlayers = new JTextField();
	private static JTextField txtTeamName = new JTextField();
	private static JTextField txtGamesPlayed = new JTextField();
	private static JTextField txtGamesWon = new JTextField();
	private static JTextField txtTouchdowns = new JTextField();
	private static JTextField txtRushingYds = new JTextField();
	
	// Labels
	private static JLabel lblTeamRank = new JLabel();
	private static JLabel lblTeamPlayers = new JLabel();
	private static JLabel lblTeamName = new JLabel();
	private static JLabel lblGamesPlayed = new JLabel();
	private static JLabel lblGamesWon = new JLabel();
	private static JLabel lblTouchdowns = new JLabel();
	private static JLabel lblRushingYds = new JLabel();

	// Buttons
	private static JButton btnSubmit = new JButton();
	
	// ----------- Declare Variables ----------- \\
	private static String teamName;
	private static Color colorOne;
	private static Color colorTwo;
	
	public static void create()
	{
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.add(enterTeamPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		enterTeamPanel.setLayout(null);
		
		// ---------------- Add items to panel ---------------- \\
		enterTeamPanel.add(GUI.lblTitle);
		// Textboxes
		enterTeamPanel.add(txtTeamRank);
		enterTeamPanel.add(txtTeamPlayers);
		enterTeamPanel.add(txtTeamName);
		enterTeamPanel.add(txtGamesPlayed);
		enterTeamPanel.add(txtGamesWon);
		enterTeamPanel.add(txtTouchdowns);
		enterTeamPanel.add(txtRushingYds);
		// Labels
		enterTeamPanel.add(lblTeamRank);
		enterTeamPanel.add(lblTeamPlayers);
		enterTeamPanel.add(lblTeamName);
		enterTeamPanel.add(lblGamesPlayed);
		enterTeamPanel.add(lblGamesWon);
		enterTeamPanel.add(lblTouchdowns);
		enterTeamPanel.add(lblRushingYds);
		// Buttons
		enterTeamPanel.add(btnSubmit);
		
		lblTitle.setText("Player Entry");

		// ---------------- enterTeamPanel Customization ---------------- \\
		enterTeamPanel.setBackground(Color.RED);
		enterTeamPanel.setVisible(true);
		
		// ---------------- JTextField Customization ---------------- \\
		txtTeamRank.setBounds((WIDTH / 2) - 20, 200, 150, 20);
		txtTeamPlayers.setBounds((WIDTH / 2) - 20, 250, 150, 20);
		txtTeamName.setBounds((WIDTH / 2) - 20, 300, 150, 20);
		txtGamesPlayed.setBounds((WIDTH / 2) - 20, 350, 150, 20);
		txtGamesWon.setBounds((WIDTH / 2) - 20, 400, 150, 20);
		txtTouchdowns.setBounds((WIDTH / 2) - 20, 450, 150, 20);
		txtRushingYds.setBounds((WIDTH / 2) - 20, 500, 150, 20);
		
		// ---------------- Labels Customization ---------------- \\
		lblTeamRank.setText("Enter the team's rank:");
		lblTeamRank.setForeground(Color.WHITE);
		lblTeamRank.setBounds(120, 198, 150, 20);
		lblTeamRank.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblTeamPlayers.setText("Enter # of players:");
		lblTeamPlayers.setForeground(Color.WHITE);
		lblTeamPlayers.setBounds(120, 248, 150, 20);
		lblTeamPlayers.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblTeamName.setText("Enter the team's name:");
		lblTeamName.setForeground(Color.WHITE);
		lblTeamName.setBounds(120, 298, 150, 20);
		lblTeamName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblGamesPlayed.setText("Enter # of games played:");
		lblGamesPlayed.setForeground(Color.WHITE);
		lblGamesPlayed.setBounds(120, 348, 150, 20);
		lblGamesPlayed.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblGamesWon.setText("Enter # of games won:");
		lblGamesWon.setForeground(Color.WHITE);
		lblGamesWon.setBounds(120, 398, 150, 20);
		lblGamesWon.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblTouchdowns.setText("Enter # of touchdowns:");
		lblTouchdowns.setForeground(Color.WHITE);
		lblTouchdowns.setBounds(120, 448, 150, 20);
		lblTouchdowns.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblRushingYds.setText("Enter # of rushing yards:");
		lblRushingYds.setForeground(Color.WHITE);
		lblRushingYds.setBounds(120, 498, 150, 20);
		lblRushingYds.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btnSubmit.setBounds((WIDTH / 2) - 50, 700, 100, 30);
		btnSubmit.setText("Submit");
	}
	
	public static void createTeam()
	{
		String teamName;
		
		try
		{
			create();
			btnSubmit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
					int teamRank = Integer.parseInt(txtTeamRank.getText());
					int teamPlayers = Integer.parseInt(txtTeamPlayers.getText());
					String teamName = txtTeamName.getText();
					int gamesPlayed = Integer.parseInt(txtGamesPlayed.getText());
					int gamesWon = Integer.parseInt(txtGamesWon.getText());
					int touchdowns = Integer.parseInt(txtTouchdowns.getText());
					int rushingYards = Integer.parseInt(txtRushingYds.getText());
					
					Teams teamInfo = new Teams(teamRank, teamPlayers, teamName, gamesPlayed, gamesWon, touchdowns, rushingYards);
					
					writeTheTeams.writeFile(teamInfo);

					txtTeamRank.setText("");
					txtTeamPlayers.setText("");
					txtTeamName.setText("");
					txtGamesPlayed.setText("");
					txtGamesWon.setText("");
					txtTouchdowns.setText("");
					txtRushingYds.setText("");

					txtTeamRank.setFocusable(true);
				}
			});
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "You entered an error!");
			
		}
		
	}
	

}
