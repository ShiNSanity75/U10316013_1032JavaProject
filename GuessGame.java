import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessGame extends JFrame {

	//Create an array to store the 100 picture
	private ImageIcon[] picture = new ImageIcon[100];
	
	private ImageIcon menu = new ImageIcon("icon/menu1.jpg");
	private ImageIcon informationP = new ImageIcon("icon/information.PNG");
	private ImageIcon baseball = new ImageIcon("icon/baseball.PNG");
	private ImageIcon basketball = new ImageIcon("icon/basketball.PNG");
	private ImageIcon tennis = new ImageIcon("icon/tennis.PNG");
	private ImageIcon soccer = new ImageIcon("icon/soccer.PNG");
	private ImageIcon video = new ImageIcon("icon/video.PNG");
	private ImageIcon music = new ImageIcon("icon/music.PNG");
	private ImageIcon result = new ImageIcon("icon/result.PNG");

	
	//Create buttons
	JButton start = new JButton("開始遊戲");
	JButton start2 = new JButton("開始遊戲");
	JButton start3 = new JButton("再玩一次");
	JButton scoreB = new JButton("我的成績");
	JButton returnB = new JButton("返回");
	JButton information = new JButton("遊戲規則");
	JButton baseballB = new JButton(baseball);
	JButton basketballB = new JButton(basketball);
	JButton tennisB = new JButton(tennis);
	JButton soccerB = new JButton(soccer);
	JButton videoB = new JButton(video);
	JButton musicB = new JButton(music);
		
			
	//Create a label to display the score
	JLabel score = new JLabel();
	
	//Create a label to put picture
	JLabel jlblMenu = new JLabel();
	JLabel jlblGame = new JLabel();
	JLabel jlblInformation = new JLabel();
	JLabel photo = new JLabel();

	
	
	int num[] = new int[100]; //Create an array to store the random list
	boolean isSame;
	int i;
	int userScore = 0;
	int k; //the number of the pictures
	int quiz[] = new int[30]; //Create an array to store the questions
	int que = 1; //the number of the questions
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel p8 = new JPanel();
	JPanel p9 = new JPanel();
	JPanel p12 = new JPanel();
	JPanel p13 = new JPanel();
	JPanel p14 = new JPanel();
	
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
		score = new JLabel("題目 " + que + "      得分 " + userScore);
		Font font = new Font("華康童童體", Font.BOLD, 40);
		score.setFont(font);
		score.setForeground(Color.BLUE);
		p1.add(score);
		
		//Create panel p2 to display the picture
		jlblGame = new JLabel(picture[quiz[que - 1]]);
		jlblGame.setHorizontalTextPosition(JLabel.CENTER);
		p2.add(jlblGame);
		
		//Create panel p3 to put the six button
		p3.setLayout(new GridLayout(1,6,15,15));
		p3.add(baseballB);
		p3.add(basketballB);
		p3.add(tennisB);
		p3.add(soccerB);
		p3.add(videoB);
		p3.add(musicB);
		
		//Create panel p4 to put main menu title
		JLabel title = new JLabel();
		title = new JLabel("名人領域猜一猜");
		Font fontMain = new Font("華康童童體", Font.BOLD, 60);
		title.setFont(fontMain);
		title.setForeground(Color.BLUE);
		p4.add(title);
		
		//Create panel p5 to display the picture on menu
		jlblMenu = new JLabel(menu);
		jlblMenu.setHorizontalTextPosition(JLabel.CENTER);				
		p5.add(jlblMenu);
		
		//Create panel p6 to put the button on main menu		
		Font fontButton = new Font("華康童童體", Font.BOLD, 30);
		start.setFont(fontButton);
		information.setFont(fontButton);
		p6.add(start,new FlowLayout(FlowLayout.CENTER));
		p6.add(information,new FlowLayout(FlowLayout.CENTER));
		
		//Create panel p7 to put main menu
		JLabel titleRule = new JLabel();
		titleRule = new JLabel("遊戲規則");
		Font fontRule = new Font("華康童童體", Font.BOLD, 60);
		titleRule.setFont(fontRule);
		titleRule.setForeground(Color.BLUE);
		p7.add(titleRule);
		
		//Create panel p8 to put the information
		jlblInformation = new JLabel(informationP);
		jlblInformation.setHorizontalTextPosition(JLabel.CENTER);	
		p8.add(jlblInformation);
		
		//Create panel p9 to put the button on information	
		Font fontButton2 = new Font("華康童童體", Font.BOLD, 30);
		start2.setFont(fontButton2);
		p9.add(start2,new FlowLayout(FlowLayout.CENTER));
		
		//Create panel p12 to put the result information
		JLabel resultP = new JLabel(result);
		resultP.setHorizontalTextPosition(JLabel.CENTER);	
		p12.add(resultP);
		
		//Create panel p13 to put the button on result	
		Font fontstart3 = new Font("華康童童體", Font.BOLD, 30);
		start3.setFont(fontstart3);
		scoreB.setFont(fontstart3);
		p13.add(scoreB,new FlowLayout(FlowLayout.CENTER));
		p13.add(start3,new FlowLayout(FlowLayout.CENTER));
		
		//Create panel p14 to put the button on score page
		Font fontReturnB = new Font("華康童童體", Font.BOLD, 30);
		returnB.setFont(fontReturnB);
		p14.add(returnB,new FlowLayout(FlowLayout.CENTER));
		
		add(p4,BorderLayout.NORTH);
		add(p5);
		add(p6,BorderLayout.SOUTH);
		
		start.addActionListener(new ButtonStart());
		start2.addActionListener(new ButtonStart2());
		start3.addActionListener(new ButtonStart3());
		information.addActionListener(new ButtonInformation());
		baseballB.addActionListener(new ButtonGames());
		basketballB.addActionListener(new ButtonGames());
		tennisB.addActionListener(new ButtonGames());
		soccerB.addActionListener(new ButtonGames());
		videoB.addActionListener(new ButtonGames());
		musicB.addActionListener(new ButtonGames());
		scoreB.addActionListener(new ButtonScoreB());
		returnB.addActionListener(new ButtonReturnB());
				
	}
	

	private class ButtonStart implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == start){
				
				//start the game
				p4.setVisible(false);
				p5.setVisible(false);
				p6.setVisible(false);
				add(p1,BorderLayout.NORTH);
				add(p2);
				add(p3,BorderLayout.SOUTH);
			}
		}
	}
	
	private class ButtonStart2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == start2){
				
				//start the game
				p7.setVisible(false);
				p8.setVisible(false);
				p9.setVisible(false);
				add(p1,BorderLayout.NORTH);
				add(p2);
				add(p3,BorderLayout.SOUTH);
			}
		}
	}
	
	private class ButtonStart3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == start3){
				
				//start the game again
				p12.setVisible(false);
				p13.setVisible(false);
				
				que = 1;
				userScore = 0;
				score.setText("題目 " + que + "      得分 " + userScore);
				
				
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

				
				jlblGame.setIcon(picture[quiz[que - 1]]);
				
				add(p1,BorderLayout.NORTH);
				add(p2);
				add(p3,BorderLayout.SOUTH);
				p1.setVisible(true);
				p2.setVisible(true);
				p3.setVisible(true);
				
				
			}
		}
	}
	
	private class ButtonInformation implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == information){
				
				//the rule of the game
				p4.setVisible(false);
				p5.setVisible(false);
				p6.setVisible(false);
				add(p7,BorderLayout.NORTH);
				add(p8);
				add(p9,BorderLayout.SOUTH);
			}
		}
	}
	
	
	private class ButtonGames implements ActionListener {
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
					score.setText("題目 " + que + "      得分 " + userScore);
					jlblGame.setIcon(picture[quiz[que - 1]]);
					
				} else if (que == 30) {
					score.setText("題目 " + que + "      得分 " + userScore);
					que++;
					
				}
				
				if(que > 30) {
					p1.setVisible(false);
					p2.setVisible(false);
					p3.setVisible(false);
					add(p12);
					add(p13,BorderLayout.SOUTH);
					p12.setVisible(true);
					p13.setVisible(true);
					
					
				}
			}
		
		
	}
	
	private class ButtonScoreB implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == scoreB){
				
				//display the score
				p12.setVisible(false);
				p13.setVisible(false);
				add(p1,BorderLayout.NORTH);
				add(p2);
				add(p14,BorderLayout.SOUTH);
				p1.setVisible(true);
				p2.setVisible(true);	
				p14.setVisible(true);
			}
		}
	}
	
	private class ButtonReturnB implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == returnB){
				
				//display the score
				p14.setVisible(false);
				p1.setVisible(false);
				p2.setVisible(false);
				add(p12);
				add(p13,BorderLayout.SOUTH);
				p12.setVisible(true);
				p13.setVisible(true);
			}
		}
	}
	
	/**Main Method*/
	public static void main (String[] args) {
		GuessGame frame = new GuessGame(); //Create a frame
		frame.setTitle("名人領域猜一猜"); //set the title of frame
		frame.setSize(500, 580); //Set the size of frame
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //Display the frame
	}
}
