import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ResultsFrameWindow extends JFrame{
	
	
	int TotalCorrectAnswers1;
	int TotalCorrectAnswers2;
	int TotalCorrectAnswers3;
	int TotalCorrectAnswers4;
	int TotalCorrectAnswers5;
	int TotalCorrectAnswers6;
	double IntPlayer;
	
	String Player1Name;
	String Player2Name;

	String Player3Name;

	String Player4Name;
	String Player5Name;
	String Player6Name;
	
	public ResultsFrameWindow(int TotalCorrectAnswers1, int TotalCorrectAnswers2, int TotalCorrectAnswers3,int TotalCorrectAnswers4,int TotalCorrectAnswers5,int TotalCorrectAnswers6,double IntPlayer,
			String Player1Name,String Player2Name,String Player3Name,String Player4Name,String Player5Name,String Player6Name)   {

	
		this.TotalCorrectAnswers1 = TotalCorrectAnswers1;
		this.TotalCorrectAnswers2 = TotalCorrectAnswers2;
		this.TotalCorrectAnswers3 = TotalCorrectAnswers3;
		this.TotalCorrectAnswers4 = TotalCorrectAnswers4;
		this.TotalCorrectAnswers5 = TotalCorrectAnswers5;
		this.TotalCorrectAnswers6 = TotalCorrectAnswers6;
		this.IntPlayer = IntPlayer;
		
		this.Player1Name = Player1Name;
		this.Player2Name = Player2Name;
		this.Player3Name = Player3Name;
		this.Player4Name = Player4Name;
		this.Player5Name = Player5Name;
		this.Player6Name = Player6Name;
		
		getContentPane().setLayout(null);
		
		ImageIcon img1 = new ImageIcon("icon.jpg");
	    setIconImage(img1.getImage());
		
		this.setSize(1024,600);
		this.setTitle("Combat Quiz");
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblResults = new JLabel("ΑΠΟΤΕΛΕΣΜΑΤΑ");
		lblResults.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResults.setBounds(33, 26, 201, 47);
		getContentPane().add(lblResults);
		
		JLabel lblNewLabel = new JLabel(Player1Name+ " ΑΠΑΝΤΗΣΕΣ : "+TotalCorrectAnswers1 +" ΕΡΩΤΗΣΕΙΣ ΣΩΣΤΕΣ");
		lblNewLabel.setBounds(22, 90, 380, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(Player2Name+ " ΑΠΑΝΤΗΣΕΣ : "+TotalCorrectAnswers1 +" ΕΡΩΤΗΣΕΙΣ ΣΩΣΤΕΣ");
		lblNewLabel_1.setBounds(573, 90, 401, 27);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(Player3Name+ " ΑΠΑΝΤΗΣΕΣ : "+TotalCorrectAnswers1 +" ΕΡΩΤΗΣΕΙΣ ΣΩΣΤΕΣ");
		lblNewLabel_2.setBounds(22, 133, 349, 27);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(Player4Name+ " ΑΠΑΝΤΗΣΕΣ : "+TotalCorrectAnswers1 +" ΕΡΩΤΗΣΕΙΣ ΣΩΣΤΕΣ");
		lblNewLabel_3.setBounds(573, 133, 407, 27);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(Player5Name+ " ΑΠΑΝΤΗΣΕΣ : "+TotalCorrectAnswers1 +" ΕΡΩΤΗΣΕΙΣ ΣΩΣΤΕΣ");
		lblNewLabel_4.setBounds(22, 183, 366, 27);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(Player6Name+ "ΑΠΑΝΤΗΣΕΣ : "+TotalCorrectAnswers1 +" ΕΡΩΤΗΣΕΙΣ ΣΩΣΤΕΣ");
		lblNewLabel_5.setBounds(573, 171, 373, 26);
		getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("ΝΕΟ ΠΑΙΧΝΙΔΙ");
		btnNewButton.setBounds(459, 375, 200, 50);
		btnNewButton.addActionListener(new StartGameButtonListener());
		getContentPane().add(btnNewButton);
		
		
		
if (IntPlayer< 6){
			
	    getContentPane().remove(lblNewLabel_5);
			}
	    if (IntPlayer< 5) {
	    	 getContentPane().remove(lblNewLabel_5);
	    	 getContentPane().remove(lblNewLabel_4);}
			
	   if (IntPlayer< 4){
		   getContentPane().remove(lblNewLabel_5);
		   getContentPane().remove(lblNewLabel_4);
		   getContentPane().remove(lblNewLabel_3);	}
	  
	   if (IntPlayer< 3){
		   
		   getContentPane().remove(lblNewLabel_5);
		   getContentPane().remove(lblNewLabel_4);
		   getContentPane().remove(lblNewLabel_3);
		   getContentPane().remove(lblNewLabel_2);}
	   
	   JLabel label = new JLabel("");
	   Image img = new ImageIcon(this.getClass().getResource("/Background2.png")).getImage();
	   label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 1008, 561);
		getContentPane().add(label);
		
	}
	
class StartGameButtonListener implements ActionListener{

		
		
		public void actionPerformed(ActionEvent e) {
			new StartFrameWindow();
			 
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
