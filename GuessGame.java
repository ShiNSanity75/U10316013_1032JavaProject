import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessGame extends JFrame {

	//Create an array to store the 100 picture
	private ImageIcon[] picture = new ImageIcon[100];
	
	private ImageIcon baseball = new ImageIcon("icon/baseball.PNG");
	private ImageIcon basketball = new ImageIcon("icon/basketball.PNG");
	private ImageIcon tennis = new ImageIcon("icon/tennis.PNG");
	private ImageIcon soccer = new ImageIcon("icon/soccer.PNG");
	private ImageIcon music = new ImageIcon("icon/music.PNG");
	private ImageIcon video = new ImageIcon("icon/video.PNG");
	
	//Create a label to put picture
	JLabel jlbl = new JLabel();
	JLabel jlbl1 = new JLabel();
	
	//Create an array to store the random list
	int num[] = new int[100];
	boolean isSame;
	int i;
	
	
	public GuessGame() {
		
		//Create an image icon from an icon file
		for(int k = 0; k < 100; k++) {
			picture[k] = new ImageIcon("icon/"+(k+1)+".jpg");
		} 
		
		//Create the random list
		for(i = 0; i < 100; i++) { 
			isSame = true;
			
			while(isSame){
				isSame = false;
				num[i] = (int)(Math.random() * 100);

				for(int j = 0; j < i; j++) {
					if(num[i] == num[j]) {
						isSame = true;
					}
				}
				
			}
		}
		
		//Create panel p1 to display the score
		JPanel p1 = new JPanel();
		jlbl1 = new JLabel("Score:");
		Font font = new Font(Font.DIALOG_INPUT, Font.BOLD, 40);
		jlbl1.setFont(font);
		jlbl1.setForeground(Color.BLUE);
		p1.add(jlbl1);
		
		//Create panel p2 to display the picture
		JPanel p2 = new JPanel();
		jlbl = new JLabel(picture[num[30]]);
		jlbl.setHorizontalTextPosition(JLabel.CENTER);
		
		p2.add(jlbl);
		
		//Create panel p3 to put the six button
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,6,15,15));
		p3.add(new JButton(baseball));
		p3.add(new JButton(basketball));
		p3.add(new JButton(tennis));
		p3.add(new JButton(soccer));
		p3.add(new JButton(music));
		p3.add(new JButton(video));
		
		add(p1,BorderLayout.NORTH);
		add(p2);
		add(p3,BorderLayout.SOUTH);
	}

	/**Main Method*/
	public static void main (String[] args) {
		GuessGame frame = new GuessGame(); //Create a frame
		frame.setTitle("名人領域猜一猜"); //set the title of frame
		frame.setSize(500, 600); //Set the size of frame
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //Display the frame
	}
}//Create a label to display the score
	JLabel score = new JLabel();
	
	//Create a label to put picture
	JLabel jlbl = new JLabel();
	
	
	//Create an array to store the random list
	int num[] = new int[100];
	boolean isSame;
	int i;
	int userScore = 0;
	int k; //the number of the pictures
	
	
	public GuessGame() {
		
		//Create an image icon from an icon file
		for(k = 0; k < 100; k++) {
			picture[k] = new ImageIcon("icon/"+(k+1)+".jpg");
		} 
		
		//Create the random list
		for(i = 0; i < 100; i++) { 
			isSame = true;
			
			while(isSame){
				isSame = false;
				num[i] = (int)(Math.random() * 100);

				for(int j = 0; j < i; j++) {
					if(num[i] == num[j]) {
						isSame = true;
					}
				}
				
			}
		}
		
		//Create panel p1 to display the score
		JPanel p1 = new JPanel();
		score = new JLabel("Score: " + userScore);
		Font font = new Font(Font.DIALOG_INPUT, Font.BOLD, 40);
		score.setFont(font);
		score.setForeground(Color.BLUE);
		p1.add(score);
		
		//Create panel p2 to display the picture
		JPanel p2 = new JPanel();
		jlbl = new JLabel(picture[num[0]]);
		jlbl.setHorizontalTextPosition(JLabel.CENTER);
		
		p2.add(jlbl);
		
		//Create panel p3 to put the six button
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,6,15,15));
		p3.add(new JButton(baseball));
		p3.add(new JButton(basketball));
		p3.add(new JButton(tennis));
		p3.add(new JButton(soccer));
		p3.add(new JButton(music));
		p3.add(new JButton(video));
		
		add(p1,BorderLayout.NORTH);
		add(p2);
		add(p3,BorderLayout.SOUTH);
	}

	private class Button implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(k >= 0 && k <= 19){}
			if(k >= 20 && k <= 39){}
			if(k >= 40 && k <= 49){}
			if(k >= 50 && k <= 59){}
			if(k >= 60 && k <= 79){}
			if(k >= 80 && k <= 99){}

		}
	}
	
	/**Main Method*/
	public static void main (String[] args) {
		GuessGame frame = new GuessGame(); //Create a frame
		frame.setTitle("名人領域猜一猜"); //set the title of frame
		frame.setSize(500, 600); //Set the size of frame
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //Display the frame
	}
}

