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
	
	//Create an array to store the random list
	int num[] = new int[100];
	boolean isSame;
	int i;
	int userScore = 0;
	int k; //the number of the pictures
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
		

		//Create panel p1 to display the score
		JPanel p1 = new JPanel();
		score = new JLabel("Quiz " + que + "    Score " + userScore);
		Font font = new Font(Font.DIALOG_INPUT, Font.BOLD, 40);
		score.setFont(font);
		score.setForeground(Color.BLUE);
		p1.add(score);
		
		//Create panel p2 to display the picture
		JPanel p2 = new JPanel();
		jlbl = new JLabel(picture[num[que]]);
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

		
		add(p1,BorderLayout.NORTH);
		add(p2);
		add(p3,BorderLayout.SOUTH);
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
			if(num[que] >= 0 && num[que] <= 19){
				if(e.getSource() == baseballB){
					userScore += 1;
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == basketballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == tennisB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == soccerB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == videoB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == musicB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				}
					
			}
			
			if(num[que] >= 20 && num[que] <= 39){
				if(e.getSource() == baseballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == basketballB){
					userScore += 1;
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == tennisB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == soccerB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == videoB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == musicB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				}
			}
			
			if(num[que] >= 40 && num[que] <= 49){
				if(e.getSource() == baseballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				
				}else if(e.getSource() == basketballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				
				}else if(e.getSource() == tennisB){
					userScore += 1;
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				
				}else if(e.getSource() == soccerB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				
				}else if(e.getSource() == videoB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				
				}else if(e.getSource() == musicB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				}
			}
			
			if(num[que] >= 50 && num[que] <= 59){
				if(e.getSource() == baseballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == basketballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == tennisB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == soccerB){
					userScore += 1;
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == videoB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == musicB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				}
			}
			
			if(num[que] >= 60 && num[que] <= 79){
				if(e.getSource() == baseballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == basketballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == tennisB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == soccerB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == videoB){
					userScore += 1;
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == musicB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				}
			}
			
			if(num[que] >= 80 && num[que] <= 99){
				if(e.getSource() == baseballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == basketballB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == tennisB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == soccerB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == videoB){
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
					
				}else if(e.getSource() == musicB){
					userScore += 1;
					que += 1;
					score.setText("Quiz " + que + "    Score " + userScore);
					jlbl.setIcon(picture[num[que]]);
				}
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

