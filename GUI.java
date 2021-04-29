import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;


public class GUI extends JFrame{
	
	
	static enterPlayers players = new enterPlayers();
	static viewItems viewPanel = new viewItems();
	
	// Create a JFrame object
	public static JFrame frame = new JFrame();
	
	// Create a panel object
	public static JPanel welcomePanel = new JPanel();
		
	// Create our JCombobox for the list of teams entered
	public static JComboBox temaList = new JComboBox();
	
	// Create our labels
	public static JLabel lblTitle = new JLabel();
	
	// Create our buttons
	public static JButton btnTeamSelec = new JButton();
	public static JButton btnPlayerSelec = new JButton();
	public static JButton btnView = new JButton();
	public static JButton btnExit = new JButton();
	
	// Create our font for the title
	public static Font titleFont = new Font("Times Roman", Font.BOLD, 40);
	
	// Create a border for the title
	public static Border titleBorder = BorderFactory.createLineBorder(Color.BLACK, 10);
	
	// Create Dimensions
	public static Dimension buttonDimension = new Dimension(100, 50);
	
	// --------------------------------------------------------------- \\
	
	// Declare our constants
	public static final int WIDTH = 600;
	public static final int HEIGHT = 800;
	
	
	public static void createFrame() {
		
		// ---------------- Frame Customization ---------------- \\
		
		// Set the frame size
		frame.setSize(WIDTH, HEIGHT);
		
		// Make the frame visible 
		frame.setVisible(true);
		
		// Make sure that the application stops when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		
		// Add the panels to the frame
		frame.add(welcomePanel);
			
		// ---------------- Title Customization ---------------- \\
		
		// Customize the title label
		lblTitle.setBounds(0, 0, WIDTH - 14, 100);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setVerticalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.RED);
		lblTitle.setBackground(Color.BLACK);
		lblTitle.setOpaque(true);
		lblTitle.setBorder(titleBorder);
		lblTitle.setText("Java Team Tracker");
		
		// ---------------- welcomePanel customization ---------------- \\
		welcomePanel.setLayout(null);
		
		welcomePanel.add(btnTeamSelec);
		welcomePanel.add(btnPlayerSelec);
		welcomePanel.add(btnView);
		welcomePanel.add(lblTitle);
		welcomePanel.add(btnExit);
		
		welcomePanel.setVisible(true);
		welcomePanel.setBackground(Color.BLACK);
	
		// ---------------- Button Customizations ---------------- \\
		
		btnTeamSelec.setBounds(((frame.getWidth() / 2) - 6) - 100 , 200, 200, 50);
		btnPlayerSelec.setBounds(((frame.getWidth() / 2)- 6) - 100, 300, 200, 50);
		btnView.setBounds(((frame.getWidth() / 2)- 6) - 100, 400, 200, 50);
		btnExit.setBounds(((frame.getWidth() / 2)- 6) - 100, 500, 200, 50);

		
		btnTeamSelec.setText("Add Team");
		btnPlayerSelec.setText("Add Player");
		btnView.setText("View teams and players");
		btnExit.setText("Exit");
		
		btnTeamSelec.setBackground(Color.WHITE);
		btnPlayerSelec.setBackground(Color.WHITE);
		btnView.setBackground(Color.WHITE);
		btnExit.setBackground(Color.WHITE);
		
		btnPlayerSelec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//players.create();
				players.createPlayer();
				
			}
		});
		
		//players.create();
		
	}
	
	public static void main(String[] args) {
		
		createFrame();
		
	}
	


}
