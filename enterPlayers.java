import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class enterPlayers extends GUI{
	
	// Declare our finals
	static final int WIDTH = GUI.WIDTH;
	static final int HEIGHT = GUI.HEIGHT;
	
	// ----------- Create Objects ----------- \\
	static GUI guiFrame = new GUI();
	static writePlayers writePlayers = new writePlayers();
		
	private static JFrame frame = new JFrame();
		
	private static JPanel enterPlayerPanel = new JPanel();
	
	private static JTextField txtFirstName = new JTextField();
	private static JTextField txtLastName = new JTextField();
	private static JTextField txtPlayerAge = new JTextField();
	private static JTextField txtPlayerWeight = new JTextField();
	private static JTextField txtGamesPlayed = new JTextField();
	private static JTextField txtGamesWon = new JTextField();
	private static JTextField txtTouchdowns = new JTextField();
	private static JTextField txtRushingYds = new JTextField();	
	private static JTextField txtPlayerTeam = new JTextField();
	
	
	private static JLabel lblFirst = new JLabel();
	private static JLabel lblLast = new JLabel();
	private static JLabel lblAge = new JLabel();
	private static JLabel lblWeight = new JLabel();
	private static JLabel lblPlayerTeam = new JLabel();
	private static JLabel lblGamesPlayed = new JLabel();
	private static JLabel lblGamesWon = new JLabel();
	private static JLabel lblTouchdowns = new JLabel();
	private static JLabel lblRushingYds = new JLabel();

	
	private static JButton btnSubmit = new JButton();
	
	// ----------- Declare Variables ----------- \\
	
	private static String teamName;
	private static Color colorOne;
	private static Color colorTwo;
	
	
	public static void create() {
		
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.add(enterPlayerPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		enterPlayerPanel.setLayout(null);
		
		// ---------------- Add items to panel ---------------- \\
		enterPlayerPanel.add(txtFirstName);
		enterPlayerPanel.add(txtLastName);
		enterPlayerPanel.add(txtPlayerAge);
		enterPlayerPanel.add(txtPlayerWeight);
		enterPlayerPanel.add(lblFirst);
		enterPlayerPanel.add(lblLast);
		enterPlayerPanel.add(lblAge);
		enterPlayerPanel.add(lblWeight);
		enterPlayerPanel.add(lblPlayerTeam);
		enterPlayerPanel.add(GUI.lblTitle);
		enterPlayerPanel.add(btnSubmit);
		enterPlayerPanel.add(txtGamesPlayed);
		enterPlayerPanel.add(txtGamesWon);
		enterPlayerPanel.add(txtTouchdowns);
		enterPlayerPanel.add(txtRushingYds);
		enterPlayerPanel.add(txtPlayerTeam);
		enterPlayerPanel.add(lblGamesPlayed);
		enterPlayerPanel.add(lblGamesWon);
		enterPlayerPanel.add(lblTouchdowns);
		enterPlayerPanel.add(lblRushingYds);

		
		lblTitle.setText("Player Entry");

		// ---------------- enterPlayerPanel Customization ---------------- \\
		enterPlayerPanel.setBackground(Color.RED);
		enterPlayerPanel.setVisible(true);
		
		// ---------------- JTextField Customization ---------------- \\
		txtFirstName.setBounds((WIDTH / 2) - 20, 200, 150, 20);
		txtLastName.setBounds((WIDTH / 2) - 20, 250, 150, 20);
		txtPlayerAge.setBounds((WIDTH / 2) - 20, 300, 150, 20);
		txtPlayerWeight.setBounds((WIDTH / 2) - 20, 350, 150, 20);
		txtGamesPlayed.setBounds((WIDTH / 2) - 20, 400, 150, 20);
		txtGamesWon.setBounds((WIDTH / 2) - 20, 450, 150, 20);
		txtTouchdowns.setBounds((WIDTH / 2) - 20, 500, 150, 20);
		txtRushingYds.setBounds((WIDTH / 2) - 20, 550, 150, 20);
		txtPlayerTeam.setBounds((WIDTH / 2) - 20, 600, 150, 20);

		
		// ---------------- Labels Customization ---------------- \\
		lblFirst.setText("Enter players first name: ");
		lblFirst.setForeground(Color.WHITE);
		lblFirst.setBounds(120, 198, 150, 20);
		lblFirst.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblLast.setText("Enter players last name: ");
		lblLast.setForeground(Color.WHITE);
		lblLast.setBounds(120, 248, 150, 20);
		lblLast.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblAge.setText("Enter players age: ");
		lblAge.setForeground(Color.WHITE);
		lblAge.setBounds(120, 298, 150, 20);
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblWeight.setText("Enter players Weight ");
		lblWeight.setForeground(Color.WHITE);
		lblWeight.setBounds(120, 348, 150, 20);
		lblWeight.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblGamesPlayed.setText("Enter Games played:");
		lblGamesPlayed.setForeground(Color.WHITE);
		lblGamesPlayed.setBounds(120, 398, 150, 20);
		lblGamesPlayed.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblGamesWon.setText("Enter Games Won");
		lblGamesWon.setForeground(Color.WHITE);
		lblGamesWon.setBounds(120, 448, 150, 20);
		lblGamesWon.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblTouchdowns.setText("Enter # of touchdowns:");
		lblTouchdowns.setForeground(Color.WHITE);
		lblTouchdowns.setBounds(120, 498, 150, 20);
		lblTouchdowns.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblRushingYds.setText("Enter rushing yards:");
		lblRushingYds.setForeground(Color.WHITE);
		lblRushingYds.setBounds(120, 548, 150, 20);
		lblRushingYds.setHorizontalAlignment(SwingConstants.RIGHT);

		lblPlayerTeam.setText("Enter team:");
		lblPlayerTeam.setForeground(Color.WHITE);
		lblPlayerTeam.setBounds(120, 598, 150, 20);
		lblPlayerTeam.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btnSubmit.setBounds((WIDTH / 2) - 50, 700, 100, 30);
		btnSubmit.setText("Submit");
		
		
		
	}
	
	public static void createPlayer() {
		
		String teamName;
		
		try {
			
			create();
			
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String playerFirst = txtFirstName.getText();
					String playerLast = txtLastName.getText();
					int playerAge = Integer.parseInt(txtPlayerAge.getText());
					int playerWeight = Integer.parseInt(txtPlayerWeight.getText());
					String playerTeam = txtPlayerTeam.getText();
					int gamesPlayed = Integer.parseInt(txtGamesPlayed.getText());
					int gamesWon = Integer.parseInt(txtGamesWon.getText());
					int touchdowns = Integer.parseInt(txtTouchdowns.getText());
					int rushingYards = Integer.parseInt(txtRushingYds.getText());


					
					FootballPlayer playerInfo = new FootballPlayer(playerFirst, playerLast, playerAge, playerWeight, playerTeam, gamesPlayed, gamesWon, touchdowns, rushingYards);
					
					writePlayers.writeFile(playerInfo);

					txtFirstName.setText(null);
					txtLastName.setText(null);
					txtPlayerAge.setText(null);
					txtPlayerWeight.setText(null);
					txtGamesPlayed.setText(null);
					txtGamesWon.setText(null);
					txtTouchdowns.setText(null);
					txtRushingYds.setText(null);
					txtPlayerTeam.setText(null);

					txtFirstName.setFocusable(true);
				}
			});
			
	
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "You entered an error!");
			
		}
		
	}
	

}
