import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainFrame extends JFrame{
	
	private JFrame Frame;
	
	private JButton StartGameButton;
	
	private JPanel MainPanel;
	
	public MainFrame()   {
		
		StartGameButton = new JButton("New Game");
		StartGameButton.addActionListener(new StartGameButtonListener()); 
		StartGameButton.setSize(50, 10);
		
		
		
		JPanel mainPanel = new JPanel();
		
		mainPanel.add(StartGameButton);
		
		this.setContentPane(mainPanel);
		
		this.setSize(1024,600);
		this.setTitle("Combat Quiz");
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
class StartGameButtonListener implements ActionListener{

		
		
		public void actionPerformed(ActionEvent e) {
			new StartGameFrame();
			 
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
