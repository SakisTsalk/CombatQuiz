import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class PlayerNamesWindow extends JFrame{
	 private JTextField textField;
	 private JTextField textField_1;
	 private JTextField textField_2;
	 private JTextField textField_3;
	 private JTextField textField_4;
	 private JTextField textField_5;
	 private AllQuestionsClass AllQuestions;
		private double IntPlayer;
		private int PlayingPlayer;
		double CorrectAnswer;
		int TotalCorrectAnswers1;
		int TotalCorrectAnswers2;
		int TotalCorrectAnswers3;
		int TotalCorrectAnswers4;
		int TotalCorrectAnswers5;
		int TotalCorrectAnswers6;
		int TotalQuestions;
		private ArrayList<Questions> QuestionList;
	 
	
	public PlayerNamesWindow(AllQuestionsClass AllQuestions,int TotalCorrectAnswers1,int TotalCorrectAnswers2,int TotalCorrectAnswers3,int TotalCorrectAnswers4,int TotalCorrectAnswers5,int TotalCorrectAnswers6,int TotalQuestions,double IntPlayer,int PlayingPlayer){

	
		this.IntPlayer=IntPlayer;
		this.TotalCorrectAnswers1 = TotalCorrectAnswers1;
		this.TotalCorrectAnswers2 = TotalCorrectAnswers2;
		this.TotalCorrectAnswers3 = TotalCorrectAnswers3;
		this.TotalCorrectAnswers4 = TotalCorrectAnswers4;
		this.TotalCorrectAnswers5 = TotalCorrectAnswers5;
		this.TotalCorrectAnswers6 = TotalCorrectAnswers6;
		this.TotalQuestions = TotalQuestions;
		this.PlayingPlayer = PlayingPlayer;

	 
		ImageIcon img1 = new ImageIcon("icon.jpg");
	    setIconImage(img1.getImage());
		
		getContentPane().setBackground(new Color(240, 240, 240));
		getContentPane().setLayout(null);
		
		
		this.setSize(1024,600);
		
		this.setTitle("Combat Quiz");
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label_2 = new JLabel("\u0394\u03CE\u03C3\u03C4\u03B5 \u03BF\u03BD\u03CC\u03BC\u03B1\u03C4\u03B1 \u03C0\u03B1\u03B9\u03BA\u03C4\u03CE\u03BD:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(84, 70, 202, 29);
		getContentPane().add(label_2);
		
		
		
		
		
		
		
		textField = new JTextField();
		textField.setText("\u03C0\u03B1\u03AF\u03BA\u03C4\u03B7\u03C2 1");
		textField.setBounds(296, 76, 123, 20);
		
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\u03C0\u03B1\u03B9\u03BA\u03C4\u03B7\u03C2 2");
		textField_1.setBounds(296, 120, 123, 20);
		
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("\u03C0\u03B1\u03B9\u03BA\u03C4\u03B7\u03C2 3");
		textField_2.setBounds(296, 159, 123, 20);
		
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("\u03C0\u03B1\u03AF\u03BA\u03C4\u03B7\u03C2 4");
		textField_3.setBounds(505, 76, 136, 20);
		
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("\u03C0\u03B1\u03AF\u03BA\u03C4\u03B7\u03C2 5");
		textField_4.setBounds(505, 120, 136, 20);
		
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("\u03C0\u03B1\u03AF\u03BA\u03C4\u03B7\u03C2 6");
		textField_5.setBounds(505, 159, 136, 20);
		
		textField_5.setColumns(10);
		
		if (IntPlayer == 6){
			
			getContentPane().add(textField_5);
			getContentPane().add(textField_4);
			getContentPane().add(textField_3);
			getContentPane().add(textField_2);
			getContentPane().add(textField_1);
			getContentPane().add(textField);
				}
		    if (IntPlayer ==  5) {
		    	getContentPane().add(textField_4);
				getContentPane().add(textField_3);
				getContentPane().add(textField_2);
				getContentPane().add(textField_1);
				getContentPane().add(textField); }
				
		   if (IntPlayer == 4){
			   getContentPane().add(textField_3);
				getContentPane().add(textField_2);
				getContentPane().add(textField_1);
				getContentPane().add(textField);	}
		  
		   if (IntPlayer == 3){
			   
			  
				getContentPane().add(textField_2);
				getContentPane().add(textField_1);
				getContentPane().add(textField);}
		   if (IntPlayer == 2) {
			   
			   getContentPane().add(textField_1);
				getContentPane().add(textField);
		}
		
		

		JButton btnStartGame = new JButton("ΞΕΚΙΝΗΣΤΕ ΤΟ ΠΑΙΧΝΙΔΙ");
		btnStartGame.setBounds(336, 426, 194, 29);
		btnStartGame.addActionListener(new BeginGameButtonListener()); 
	
	
	
		getContentPane().add(btnStartGame);
	
	
			
			
		
		
		
		JLabel label_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Background2.png")).getImage();
		label_1.setIcon(new ImageIcon(img));
		label_1.setBounds(0, 0, 1008, 561);
		getContentPane().add(label_1);
		
		
	}
class BeginGameButtonListener implements ActionListener{

		
		
		public void actionPerformed(ActionEvent e) {
			
		
			
				
			String  Player1Name = textField.getText();
			String  Player2Name = textField_1.getText();
			String  Player3Name = textField_2.getText();
            String  Player4Name = textField_3.getText();
            String  Player5Name = textField_4.getText();
            String  Player6Name = textField_5.getText();

			
				
			
			new QuestionFrameWindow(AllQuestions,TotalCorrectAnswers1,TotalCorrectAnswers2,TotalCorrectAnswers3,TotalCorrectAnswers4,TotalCorrectAnswers5,TotalCorrectAnswers6,TotalQuestions,IntPlayer,PlayingPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);
			 
			Object source = e.getSource();
			 
			  if (source instanceof Component) {

			   Component c = (Component) source;
			 
			 Frame frame = JOptionPane.getFrameForComponent(c);
			
			 
		
			      if(frame != null) {
			    	  
			    	  frame.dispose();
			
	
			
			                 }

		}}
	}

}
