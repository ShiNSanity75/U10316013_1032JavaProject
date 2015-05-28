import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessGame extends JFrame {

	//Create an array to store the 100 picture
	ImageIcon[] picture = new ImageIcon[100];
	
	//Create a label to put picture
	JLabel jlbl = new JLabel();
	
	
	public GuessGame() {
		
		//Create an image icon from an icon file
		for(int k = 0; k < 100; k++) {
			picture[k] = new ImageIcon("icon/"+(k+1)+".jpg");
		} 
		
		//Create panel p1 to display the picture
		JPanel p1 = new JPanel();
		int i = 40;
		jlbl = new JLabel(picture[i]);
		jlbl.setHorizontalTextPosition(JLabel.CENTER);
		
		p1.add(jlbl);
			
	
		add(p1);
	}

	/**Main Method*/
	public static void main (String[] args) {
		GuessGame frame = new GuessGame(); //Create a frame
		frame.setTitle("名人領域猜一猜"); //set the title of frame
		frame.setSize(400, 500); //Set the size of frame
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //Display the frame
	}
}
