import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;


public class StartFrameWindow extends JFrame{
	public StartFrameWindow() {
		getContentPane().setBackground(new Color(240, 240, 240));
		getContentPane().setLayout(null);
		

		ImageIcon img1 = new ImageIcon("icon.jpg");
	    setIconImage(img1.getImage());
		
		this.setSize(800,600);
		
		this.setTitle("Combat Quiz");
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("ΝΕΟ ΠΑΙΧΝΙΔΙ");
		btnNewButton.addActionListener(new StartGameButtonListener()); 
		btnNewButton.setBounds(131, 391, 165, 43);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ΟΔΗΓΙΕΣ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(389, 391, 159, 43);
		getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setBounds(-107, 0, 891, 585);
		getContentPane().add(label);
		Image img = new ImageIcon(this.getClass().getResource("/Background1.png")).getImage();
		label.setIcon(new ImageIcon(img));
		

		
		
	}
	
class StartGameButtonListener implements ActionListener{

		
		
		public void actionPerformed(ActionEvent e) {
			new PlayerMenuWindow();
			 
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
	