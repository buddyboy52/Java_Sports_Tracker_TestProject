import javax.swing.*;

public class viewItems extends JFrame{
	
	static final int WIDTH = GUI.WIDTH;
	static final int HEIGHT = GUI.HEIGHT;
	
	// Create our GUI object
	GUI guiFrame = new GUI();
	
	private static JFrame frame = new JFrame();
	
	private static JPanel panel = new JPanel();
	
	public static void createView() {
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	
	

}
