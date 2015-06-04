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
	private ImageIcon video = new ImageIcon("icon/video.PNG");
	private ImageIcon music = new ImageIcon("icon/music.PNG");

	
	//Create buttons
	JButton baseballB = new JButton(baseball);
	JButton basketballB = new JButton(basketball);
	JButton tennisB = new JButton(tennis);
	JButton soccerB = new JButton(soccer);
	JButton videoB = new JButton(video);
	JButton musicB = new JButton(music);

			
	//Create a label to display the score
	JLabel score = new JLabel();
	
	//Create a label to put picture
	JLabel jlbl = new JLabel();
	
	
	int num[] = new int[100]; //Create an array to store the random list
	boolean isSame;
	int i;
	int userScore = 0;
	int k; //the number of the pictures
	int quiz[] = new int[30]; //Create an array to store the questions
	int que = 1; //the number of the questions
	
	
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
		
		//Create the questions list
		for(i = 0; i < 30; i++) { 
			quiz[i] = num[i];
		}

		//Create panel p1 to display the score
		JPanel p1 = new JPanel();
		score = new JLabel("Quiz " + que + "    Score " + userScore);
		Font font = new Font(Font.DIALOG_INPUT, Font.BOLD, 40);
		score.setFont(font);
		score.setForeground(Color.BLUE);
		p1.add(score);
		
		//Create panel p2 to display the picture
		JPanel p2 = new JPanel();
		jlbl = new JLabel(picture[quiz[que - 1]]);
		jlbl.setHorizontalTextPosition(JLabel.CENTER);
		
		p2.add(jlbl);
		
		//Create panel p3 to put the six button
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,6,15,15));
		p3.add(baseballB);
		p3.add(basketballB);
		p3.add(tennisB);
		p3.add(soccerB);
		p3.add(videoB);
		p3.add(musicB);
		
		//Create panel p4 to put main menu
		JPanel p4 = new JPanel();
		JLabel title = new JLabel();
		title = new JLabel("名人領域猜一猜");
		Font fontMain = new Font("華康細圓體", Font.BOLD, 50);
		title.setFont(fontMain);
		title.setForeground(Color.BLUE);
		p4.add(title);
		
		//add(p1,BorderLayout.NORTH);
		//add(p2);
		//add(p3,BorderLayout.SOUTH);
		add(p4);
		baseballB.addActionListener(new Button());
		basketballB.addActionListener(new Button());
		tennisB.addActionListener(new Button());
		soccerB.addActionListener(new Button());
		videoB.addActionListener(new Button());
		musicB.addActionListener(new Button());
	}

	private class Button implements ActionListener {
		@Override
			public void actionPerformed(ActionEvent e) {
			
			
				if(e.getSource() == baseballB){
					if(quiz[que - 1] >= 0 && quiz[que - 1] <= 19){
						userScore += 1;	
					}		
				}
			
				
				if(e.getSource() == basketballB){
					if(quiz[que - 1] >= 20 && quiz[que - 1] <= 39){
						userScore += 1;
					}
				}
			
				
				if(e.getSource() == tennisB){
					if(quiz[que - 1] >= 40 && quiz[que - 1] <= 49){
						userScore += 1;						
					}
				}
			
				
				if(e.getSource() == soccerB){
					if(quiz[que - 1] >= 50 && quiz[que - 1] <= 59){
						userScore += 1;						
					}
				}
			
			
				if(e.getSource() == videoB){
					if(quiz[que - 1] >= 60 && quiz[que - 1] <= 79){
						userScore += 1;						
					}
				}
			
				
				if(e.getSource() == musicB){
					if(quiz[que - 1] >= 80 && quiz[que - 1] <= 99){
						userScore += 1;						
					}
				}
				
				if(que < 30){
					que++;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[quiz[que - 1]]);
					
				} else if (que == 30) {
					score.setText("Quiz " + que + "    Score " + userScore);
				}
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
