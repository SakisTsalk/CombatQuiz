import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class QuestionFrameWindow extends JFrame{
	
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
	String Player1Name;
	String Player2Name;

	String Player3Name;

	String Player4Name;
	String Player5Name;
	String Player6Name;

	
	
	public QuestionFrameWindow(AllQuestionsClass AllQuestions,int TotalCorrectAnswers1,int TotalCorrectAnswers2,int TotalCorrectAnswers3,int TotalCorrectAnswers4,int TotalCorrectAnswers5,int TotalCorrectAnswers6,int TotalQuestions,double IntPlayer,int PlayingPlayer,
			String Player1Name,	String Player2Name,	String Player3Name, 	String Player4Name,	String Player5Name, 	String Player6Name){
	
		this.IntPlayer=IntPlayer;
		this.TotalCorrectAnswers1 = TotalCorrectAnswers1;
		this.TotalCorrectAnswers2 = TotalCorrectAnswers2;
		this.TotalCorrectAnswers3 = TotalCorrectAnswers3;
		this.TotalCorrectAnswers4 = TotalCorrectAnswers4;
		this.TotalCorrectAnswers5 = TotalCorrectAnswers5;
		this.TotalCorrectAnswers6 = TotalCorrectAnswers6;
		this.TotalQuestions = TotalQuestions;
		this.PlayingPlayer = PlayingPlayer;
		this.Player1Name = Player1Name;
		this.Player2Name = Player2Name;
		this.Player3Name = Player3Name;
		this.Player4Name = Player4Name;
		this.Player5Name = Player5Name;
		this.Player6Name = Player6Name;
		
		Answer1ButtonListener e1 = new Answer1ButtonListener();
		 Answer2ButtonListener e2 = new Answer2ButtonListener();
		 Answer3ButtonListener e3 = new Answer3ButtonListener();
		 Answer4ButtonListener e4 = new Answer4ButtonListener();
		 
		 ImageIcon img1 = new ImageIcon("icon.jpg");
		    setIconImage(img1.getImage());
		
		getContentPane().setLayout(null);
		
		this.setSize(1024,600);

		this.setTitle("Combat Quiz");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (PlayingPlayer == 1){
		
			JLabel lblPlayer = new JLabel(" ΠΑΙΚΤΗΣ : "+ Player1Name);
			
		
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlayer.setBounds(10, 11, 676, 38);
		getContentPane().add(lblPlayer);}
		
		if (PlayingPlayer == 2){
			
			JLabel lblPlayer = new JLabel(" ΠΑΙΚΤΗΣ : "+ Player2Name);
			
		
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlayer.setBounds(10, 11, 676, 38);
		getContentPane().add(lblPlayer);}
		
if (PlayingPlayer == 3){
			
			JLabel lblPlayer = new JLabel(" ΠΑΙΚΤΗΣ : "+ Player3Name);
			
		
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlayer.setBounds(10, 11, 676, 38);
		getContentPane().add(lblPlayer);}

if (PlayingPlayer == 4){
	
	JLabel lblPlayer = new JLabel(" ΠΑΙΚΤΗΣ : "+ Player4Name);
	

lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
lblPlayer.setBounds(10, 11, 676, 38);
getContentPane().add(lblPlayer);}

if (PlayingPlayer == 5){
	
	JLabel lblPlayer = new JLabel(" ΠΑΙΚΤΗΣ : "+ Player5Name);
	

lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
lblPlayer.setBounds(10, 11, 676, 38);
getContentPane().add(lblPlayer);}

if (PlayingPlayer == 6){
	
	JLabel lblPlayer = new JLabel(" ΠΑΙΚΤΗΣ : "+ Player6Name);
	

lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
lblPlayer.setBounds(10, 11, 676, 38);
getContentPane().add(lblPlayer);}
		
		
		QuestionList = new ArrayList<Questions>();
		Questions Q01 = new Questions("ΠΟΣΟΙ ΠΑΙΚΤΕΣ ΑΝΗΚΟΥΝ ΣΕ ΜΙΑ ΟΜΑΔΑ ΜΠΑΣΚΕΤ?", "10", "8", "12", "5", 1.0);
		Questions Q02 = new Questions("ΠΟΙΑ ΕΙΝΑΙ Η ΜΕΓΑΛΥΤΕΡΗ ΠΟΛΗ ΣΤΟΝ ΚΟΣΜΟ?", "ΝΕΑ ΥΟΡΚΗ", "ΣΑΝΓΚΑΙ", "ΤΟΚΙΟ", "ΣΑΟ ΠΑΟΛΟ", 2.0);
		
		QuestionList.add(Q01);
		QuestionList.add(Q02);
		
		Random randomGenerator = new Random();
		Questions q = QuestionList.get(randomGenerator.nextInt(QuestionList.size()));	
		
		String QuestionName = q.getQuestion();
		String Answer1 = q.getAnswer1();
		String Answer2 = q.getAnswer2();
		String Answer3 = q.getAnswer3();
		String Answer4 = q.getAnswer4();
		 CorrectAnswer = q.getCorrectAnswer();
		 
		 JLabel label = new JLabel("ΕΡΩΤΗΣΗ Νο: " + TotalQuestions +" " +QuestionName);
		 label.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label.setBounds(10, 46, 676, 38);
			getContentPane().add(label);
			
			JButton btnNewButton = new JButton(" "+Answer1);
			btnNewButton.setBounds(85, 95, 114, 30);
			getContentPane().add(btnNewButton);
			btnNewButton.addActionListener(e1);
			
			JButton btnNewButton_1 = new JButton(" "+Answer2);
			btnNewButton_1.setBounds(374, 95, 131, 30);
			getContentPane().add(btnNewButton_1);
			btnNewButton_1.addActionListener(e2);
			
			JButton btnNewButton_2 = new JButton(" "+Answer3);
			btnNewButton_2.setBounds(85, 159, 114, 30);
			getContentPane().add(btnNewButton_2);
			btnNewButton_2.addActionListener(e3);
			JButton btnNewButton_3 = new JButton(" "+Answer4);
			btnNewButton_3.setBounds(374, 159, 131, 30);
			getContentPane().add(btnNewButton_3);
			
			JLabel label_1 = new JLabel("");
			Image img = new ImageIcon(this.getClass().getResource("/Background2.png")).getImage();
			label_1.setIcon(new ImageIcon(img));
			label_1.setBounds(0, 0, 1008, 561);
			getContentPane().add(label_1);
			btnNewButton_3.addActionListener(e4);
		 
	}
	
	

	class Answer1ButtonListener implements ActionListener{
		

		

		public void actionPerformed(ActionEvent e) {

      
 
			if(CorrectAnswer == 1.0){
				if (PlayingPlayer == 1){
					
					TotalCorrectAnswers1 =( TotalCorrectAnswers1+1);
				}
             if (PlayingPlayer == 2){
					
					TotalCorrectAnswers2 =( TotalCorrectAnswers2+1);
				}
             if (PlayingPlayer == 3){
					
					TotalCorrectAnswers3 =( TotalCorrectAnswers3+1);
				}
             if (PlayingPlayer == 4){
					
					TotalCorrectAnswers4 =( TotalCorrectAnswers4+1);
				}
             if (PlayingPlayer == 5){
					
					TotalCorrectAnswers5 =( TotalCorrectAnswers5+1);
				}
             if (PlayingPlayer == 6){
					
					TotalCorrectAnswers6 =( TotalCorrectAnswers6+1);
				}

				
			}
			
			
			TotalQuestions ++;
			if (TotalQuestions > 10){
				PlayingPlayer = PlayingPlayer +1;
				TotalQuestions = 1;
				if (PlayingPlayer <= IntPlayer ){
					if (PlayingPlayer == 1){
				JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player1Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 2){
						JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player2Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 3){
						JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player3Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 4){
						JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player4Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 5){
						JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player5Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 6){
						JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player6Name,JOptionPane.INFORMATION_MESSAGE);}
				}
			}

			if (PlayingPlayer > IntPlayer ){
				JOptionPane.showMessageDialog(null, "ΠΙΕΣΤΕ ΓΙΑ ΝΑ ΔΕΙΤΕ ΤΑ ΑΠΟΤΕΛΕΣΜΑΤΑ!","ΤΕΛΟΣ ΠΑΙΧΝΙΔΙΟΥ! " ,JOptionPane.INFORMATION_MESSAGE);
				new ResultsFrameWindow(TotalCorrectAnswers1, TotalCorrectAnswers2, TotalCorrectAnswers3, TotalCorrectAnswers4, TotalCorrectAnswers5, TotalCorrectAnswers6,IntPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);

			}
			else{

				new QuestionFrameWindow(AllQuestions,TotalCorrectAnswers1,TotalCorrectAnswers2,TotalCorrectAnswers3,TotalCorrectAnswers4,TotalCorrectAnswers5,TotalCorrectAnswers6,TotalQuestions,IntPlayer,PlayingPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);}

			dispose();

		}

	}
	
class Answer2ButtonListener implements ActionListener{
		

		

		public void actionPerformed(ActionEvent e) {


 
			if(CorrectAnswer == 2.0){
				if (PlayingPlayer == 1){
					
					TotalCorrectAnswers1 =( TotalCorrectAnswers1+1);
				}
             if (PlayingPlayer == 2){
					
					TotalCorrectAnswers2 =( TotalCorrectAnswers2+1);
				}
             if (PlayingPlayer == 3){
					
					TotalCorrectAnswers3 =( TotalCorrectAnswers3+1);
				}
             if (PlayingPlayer == 4){
					
					TotalCorrectAnswers4 =( TotalCorrectAnswers4+1);
				}
             if (PlayingPlayer == 5){
					
					TotalCorrectAnswers5 =( TotalCorrectAnswers5+1);
				}
             if (PlayingPlayer == 6){
					
					TotalCorrectAnswers6 =( TotalCorrectAnswers6+1);
				}

				
			}

			TotalQuestions ++;
			if (TotalQuestions > 10){
				PlayingPlayer = PlayingPlayer +1;
				TotalQuestions = 1;
				if(PlayingPlayer <= IntPlayer ){
					if (PlayingPlayer == 1){
				       JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player1Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 2){
					   JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player2Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 3){
						   JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player3Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 4){
						   JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player4Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 5){
						   JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player5Name,JOptionPane.INFORMATION_MESSAGE);}
					if (PlayingPlayer == 6){
						   JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player6Name,JOptionPane.INFORMATION_MESSAGE);}
				}
			}

			if (PlayingPlayer > IntPlayer ){
				
				JOptionPane.showMessageDialog(null,"ΠΙΕΣΤΕ ΓΙΑ ΝΑ ΔΕΙΤΕ ΤΑ ΑΠΟΤΕΛΕΣΜΑΤΑ!","ΤΕΛΟΣ ΠΑΙΧΝΙΔΙΟΥ! ",JOptionPane.INFORMATION_MESSAGE);
				new ResultsFrameWindow(TotalCorrectAnswers1, TotalCorrectAnswers2, TotalCorrectAnswers3, TotalCorrectAnswers4, TotalCorrectAnswers5, TotalCorrectAnswers6,IntPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);

			}
			else{

				new QuestionFrameWindow(AllQuestions,TotalCorrectAnswers1,TotalCorrectAnswers2,TotalCorrectAnswers3,TotalCorrectAnswers4,TotalCorrectAnswers5,TotalCorrectAnswers6,TotalQuestions,IntPlayer,PlayingPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);}

			dispose();

		}

	}

class Answer3ButtonListener implements ActionListener{
	

	

	public void actionPerformed(ActionEvent e) {



		if(CorrectAnswer == 3.0){
			if (PlayingPlayer == 1){
				
				TotalCorrectAnswers1 =( TotalCorrectAnswers1+1);
			}
         if (PlayingPlayer == 2){
				
				TotalCorrectAnswers2 =( TotalCorrectAnswers2+1);
			}
         if (PlayingPlayer == 3){
				
				TotalCorrectAnswers3 =( TotalCorrectAnswers3+1);
			}
         if (PlayingPlayer == 4){
				
				TotalCorrectAnswers4 =( TotalCorrectAnswers4+1);
			}
         if (PlayingPlayer == 5){
				
				TotalCorrectAnswers5 =( TotalCorrectAnswers5+1);
			}
         if (PlayingPlayer == 6){
				
				TotalCorrectAnswers6 =( TotalCorrectAnswers6+1);
			}

			
		}

		TotalQuestions ++;
		if (TotalQuestions > 10){
			PlayingPlayer = PlayingPlayer +1;
			TotalQuestions = 1;
			if (PlayingPlayer <= IntPlayer ){
				if (PlayingPlayer == 1){
				JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player1Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 2){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player2Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 3){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player3Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 4){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player4Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 5){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player5Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 6){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player6Name,JOptionPane.INFORMATION_MESSAGE);}
				}
			
		}

		if (PlayingPlayer > IntPlayer ){
			
			JOptionPane.showMessageDialog(null, "ΠΙΕΣΤΕ ΓΙΑ ΝΑ ΔΕΙΤΕ ΤΑ ΑΠΟΤΕΛΕΣΜΑΤΑ!","ΤΕΛΟΣ ΠΑΙΧΝΙΔΙΟΥ! " ,JOptionPane.INFORMATION_MESSAGE);
			new ResultsFrameWindow(TotalCorrectAnswers1, TotalCorrectAnswers2, TotalCorrectAnswers3, TotalCorrectAnswers4, TotalCorrectAnswers5, TotalCorrectAnswers6,IntPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);

		}
		else{

			new QuestionFrameWindow(AllQuestions,TotalCorrectAnswers1,TotalCorrectAnswers2,TotalCorrectAnswers3,TotalCorrectAnswers4,TotalCorrectAnswers5,TotalCorrectAnswers6,TotalQuestions,IntPlayer,PlayingPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);}

		dispose();

	}

}

class Answer4ButtonListener implements ActionListener{
	

	

	public void actionPerformed(ActionEvent e) {


  System.out.println(+CorrectAnswer);
		if(CorrectAnswer == 4.0){
			if (PlayingPlayer == 1){
				
				TotalCorrectAnswers1 =( TotalCorrectAnswers1+1);
			}
         if (PlayingPlayer == 2){
				
				TotalCorrectAnswers2 =( TotalCorrectAnswers2+1);
			}
         if (PlayingPlayer == 3){
				
				TotalCorrectAnswers3 =( TotalCorrectAnswers3+1);
			}
         if (PlayingPlayer == 4){
				
				TotalCorrectAnswers4 =( TotalCorrectAnswers4+1);
			}
         if (PlayingPlayer == 5){
				
				TotalCorrectAnswers5 =( TotalCorrectAnswers5+1);
			}
         if (PlayingPlayer == 6){
				
				TotalCorrectAnswers6 =( TotalCorrectAnswers6+1);
			}

			
		}

		TotalQuestions ++;
		if (TotalQuestions > 10){
			PlayingPlayer = PlayingPlayer +1;
			TotalQuestions = 1;
			if (PlayingPlayer <= IntPlayer ){
				if (PlayingPlayer == 1){
				JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player1Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 2){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player2Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 3){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player3Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 4){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player4Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 5){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player5Name,JOptionPane.INFORMATION_MESSAGE);}
				if (PlayingPlayer == 6){
					JOptionPane.showMessageDialog(null, "ΣΕΙΡΑ ΣΟΥ!","ΠΑΙΚΤΗ " +Player6Name,JOptionPane.INFORMATION_MESSAGE);}
				}
			
		}

		if (PlayingPlayer > IntPlayer ){
			JOptionPane.showMessageDialog(null, "ΠΙΕΣΤΕ ΓΙΑ ΝΑ ΔΕΙΤΕ ΤΑ ΑΠΟΤΕΛΕΣΜΑΤΑ!","ΤΕΛΟΣ ΠΑΙΧΝΙΔΙΟΥ! " ,JOptionPane.INFORMATION_MESSAGE);
			new ResultsFrameWindow(TotalCorrectAnswers1, TotalCorrectAnswers2, TotalCorrectAnswers3, TotalCorrectAnswers4, TotalCorrectAnswers5, TotalCorrectAnswers6,IntPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);

		}
		else{

			new QuestionFrameWindow(AllQuestions,TotalCorrectAnswers1,TotalCorrectAnswers2,TotalCorrectAnswers3,TotalCorrectAnswers4,TotalCorrectAnswers5,TotalCorrectAnswers6,TotalQuestions,IntPlayer,PlayingPlayer,Player1Name,Player2Name,Player3Name,Player4Name,Player5Name,Player6Name);}

		dispose();

	}

}
	
	
	

}
