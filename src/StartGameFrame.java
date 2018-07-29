import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;




public class StartGameFrame extends JFrame{
	
private JFrame Frame;
	
	private JButton BeginGameButton;
	 private JList PlayerList;
	private JPanel MainPanel;
	private JPanel ListPanel;
	private JPanel ButtonPanel;
	private JLabel ListLabel;
	
	private AllQuestionsClass AllQuestions;
	
	
	public StartGameFrame(){
		
		 AllQuestions = new AllQuestionsClass();
		
		JLabel ListLabel = new JLabel();
		ListLabel.setText("Choose how many Players:");
		
		 PlayerList = new JList();
		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement(" 2 ");
		listModel.addElement(" 3 ");
		listModel.addElement(" 4 ");
		listModel.addElement(" 5 ");
		listModel.addElement(" 6 ");
		PlayerList.setModel(listModel);
		
		PlayerList.setVisibleRowCount(5); 
		
		
		
		BeginGameButton = new JButton("Begin Game");
		BeginGameButton.addActionListener(new BeginGameButtonListener()); 
		BeginGameButton.setSize(50, 10);
		
JPanel mainPanel = new JPanel();
JPanel ListPanel = new JPanel();
JPanel ButtonPanel = new JPanel();
		

		ListPanel.add(ListLabel);
		ListPanel.add(new JScrollPane(PlayerList));
		
		
		ButtonPanel.add(BeginGameButton);
		
		mainPanel.setLayout(new BorderLayout());
		
		mainPanel.add(ListPanel,  BorderLayout.NORTH);
		
		mainPanel.add(ButtonPanel, BorderLayout.SOUTH);
		
		
		this.setContentPane(mainPanel);
		
		this.setSize(1024,600);
		this.setTitle("Combat Quiz");
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
class BeginGameButtonListener implements ActionListener{

		
		
		public void actionPerformed(ActionEvent e) {
			
			String PlayerCount = (String) PlayerList.getSelectedValue();
			double IntPlayer = Double.parseDouble(PlayerCount);
			
				
				double PlayingPlayer = (IntPlayer - (IntPlayer-1));
				int TotalCorrectAnswers = 0;
			
			
			new Question1Frame(AllQuestions,PlayingPlayer,TotalCorrectAnswers);
			 
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
