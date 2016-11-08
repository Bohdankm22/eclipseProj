package bohdan.jframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons extends JFrame {
	
	JButton abort = new JButton("Abort");
	JButton rerty = new JButton("Retry");
	JButton fail = new JButton("Fail");
	
	public Buttons() {
		setSize(80, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.add(abort);
		p.add(rerty);
		p.add(fail);
		setContentPane(p);
	}
}
