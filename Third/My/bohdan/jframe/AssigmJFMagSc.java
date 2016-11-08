package bohdan.jframe;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AssigmJFMagSc extends JFrame {
	
	public AssigmJFMagSc(int numb) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Magic Squre");
		GridLayout dl = new GridLayout(numb, numb, 5, 5);
		JPanel p = new JPanel();
		p.setLayout(dl);
		setContentPane(p);
		
	}

}
