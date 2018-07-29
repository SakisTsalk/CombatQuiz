import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;


public class PlayerMenuWindow extends JFrame{
	
	 private JList list;
	 private AllQuestionsClass AllQuestions;
	 private JTextField textField;
	 private JTextField textField_1;
	 private JTextField textField_2;
	 private JTextField textField_3;
	 private JTextField textField_4;
	 private JTextField textField_5;
	 
	public PlayerMenuWindow() {
		getContentPane().setLayout(null);
		
		ImageIcon img1 = new ImageIcon("icon.jpg");
	    setIconImage(img1.getImage());
		
		this.setSize(1024,600);
		this.setTitle("Combat Quiz");
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		 AllQuestions = new AllQuestionsClass();
		 
		JList list = new JList();
		
		this.list = list;
		list.setFont(new Font("Tahoma", Font.PLAIN, 12));
		list.setVisibleRowCount(5);
		list.setToolTipText("");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"2", "3", "4", "5", "6"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(504, 37, 15, 85);
		getContentPane().add(list);
		
		JLabel label = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03C4\u03BF\u03BD \u03B1\u03C1\u03B9\u03B8\u03BC\u03CC \u03C4\u03C9\u03BD \u03C0\u03B1\u03B9\u03BA\u03C4\u03CE\u03BD:");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(230, 67, 269, 29);
		getContentPane().add(label);
		
		JButton btnStartGame = new JButton("ΣΥΝΕΧΕΙΑ");
		btnStartGame.setBounds(358, 324, 194, 29);
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
			
			String PlayerCount = (String) list.getSelectedValue();
			double IntPlayer = Double.parseDouble(PlayerCount);
			
				
				//double PlayingPlayer = (IntPlayer - (IntPlayer-1));
				int TotalCorrectAnswers1 = 0;
				int TotalCorrectAnswers2 = 0;
				int TotalCorrectAnswers3 = 0;
				int TotalCorrectAnswers4 = 0;
				int TotalCorrectAnswers5 = 0;
				int TotalCorrectAnswers6 = 0;
				int TotalQuestions = 1;
				int PlayingPlayer = 1;
			
			new PlayerNamesWindow(AllQuestions,TotalCorrectAnswers1,TotalCorrectAnswers2,TotalCorrectAnswers3,TotalCorrectAnswers4,TotalCorrectAnswers5,TotalCorrectAnswers6,TotalQuestions,IntPlayer,PlayingPlayer);
			 
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
