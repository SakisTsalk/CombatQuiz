import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Question2Frame  extends JFrame{
	
	private ArrayList<Questions> QuestionList;
	
	private AllQuestionsClass AllQuestions;
	private double PlayerNumber;
	private JLabel PlayerLabel;
	private JLabel QuestionLabel;
	private JButton Answer1Button;
	private JButton Answer2Button;
	private JButton Answer3Button;
	private JButton Answer4Button;
	  

	
	
	
	public Question2Frame(AllQuestionsClass AllQuestions, double PlayerNumber,int TotalCorrectAnswers){
		
		JLabel QuestionLabel = new JLabel();
		JPanel MainPanel = new JPanel();
		JLabel PlayerLabel = new JLabel();
		JPanel QuestionPanel = new JPanel();
		JPanel AnswerPanel = new JPanel();
		JPanel Answer1Panel = new JPanel();
		JPanel Answer2Panel = new JPanel();
		JPanel Answer3Panel = new JPanel();
		JPanel Answer4Panel = new JPanel();
		JPanel WrapperPanel = new JPanel();

		
		QuestionList = new ArrayList<Questions>();
		Questions Q01 = new Questions("How Many Players are on a basketball team?", "10", "8", "12", "5", 1);
		Questions Q02 = new Questions("Which is the most populated city in the world?", "New York", "Shanghai", "Tokyo", "Sao Paulo", 2);
		
		QuestionList.add(Q01);
		QuestionList.add(Q02);
		
		Random randomGenerator = new Random();
		Questions q = QuestionList.get(randomGenerator.nextInt(QuestionList.size()));			
		
		String QuestionName = q.getQuestion();
			String Answer1 = q.getAnswer1();
			String Answer2 = q.getAnswer2();
			String Answer3 = q.getAnswer3();
			String Answer4 = q.getAnswer4();
			Double CorrectAnswer = q.getCorrectAnswer();
			
			JButton Answer1Button = new JButton(" "+Answer1);
			//Answer1Button.addActionListener(new Answer1ButtonListener(CorrectAnswer,TotalCorrectAnswers));
			
			JButton Answer2Button = new JButton(" "+Answer2);
			
			JButton Answer3Button = new JButton(" "+Answer3);
			
			JButton Answer4Button = new JButton(" "+Answer4);
			
			int i = (int) PlayerNumber;
			
			PlayerLabel.setText(" Player : "+i);
			
			
			QuestionLabel.setText("Question Number 1: "+QuestionName);
			
			Answer1Panel.add(Answer1Button);
			Answer2Panel.add(Answer2Button);
			Answer3Panel.add(Answer3Button);
			Answer4Panel.add(Answer4Button);
			

			GridLayout AnswerLayout = new GridLayout(2,2);			
			
			AnswerPanel.setLayout(AnswerLayout);
			
			AnswerPanel.add(Answer1Panel);
			AnswerPanel.add(Answer2Panel);
			AnswerPanel.add(Answer3Panel);
			AnswerPanel.add(Answer4Panel);

			
			AnswerPanel.setPreferredSize(new Dimension(200, 200));
			QuestionPanel.setLayout(new BorderLayout());
			
			
			
			QuestionPanel.add(QuestionLabel,BorderLayout.NORTH);
			QuestionPanel.add(AnswerPanel,BorderLayout.CENTER);
			
			QuestionPanel.setPreferredSize(new Dimension(200, 200));
			
			MainPanel.setLayout(new BorderLayout());
			MainPanel.add(PlayerLabel,BorderLayout.NORTH);
			QuestionPanel.setPreferredSize(new Dimension(200, 200));
			MainPanel.add(QuestionPanel,BorderLayout.CENTER);
			
			//WrapperPanel.setLayout(new BoxLayout(WrapperPanel, BoxLayout.PAGE_AXIS));
			//WrapperPanel.add(PlayerLabel);
			//WrapperPanel.add(QuestionPanel);
			
			this.setContentPane(MainPanel);
	
			this.setSize(1024,600);
			
			this.setTitle("Combat Quiz");
					this.setVisible(true);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	
	
class Answer1ButtonListener implements ActionListener{
	private Double CorrectAnswer;
	private int TotalCorrectAnswers;

	 
	public Answer1ButtonListener(Double CorrectAnswer,int TotalCorrectAnswers,double PlayerNumber) {
        this.CorrectAnswer = CorrectAnswer;
    }
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(TotalCorrectAnswers == 1){
			
			TotalCorrectAnswers =( TotalCorrectAnswers+1);
		}
		new Question1Frame(AllQuestions,PlayerNumber,TotalCorrectAnswers);
		 
		Object source = e.getSource();
		 
		  if (source instanceof Component) {

		   Component c = (Component) source;
		 
		 Frame frame = JOptionPane.getFrameForComponent(c);
		
		 
	
		      if(frame != null) {
		    	  
		    	  frame.dispose();
		

		
		                 }

	}}


}}
