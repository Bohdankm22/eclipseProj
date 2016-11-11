package alex.progress_bar;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class myProgress extends JFrame {
	
	JProgressBar current;
	JTextArea out;
	JButton find;
	Thread runner;
	int num = 0;
	public myProgress(){
		setTitle("Progress");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		current = new JProgressBar(0, 60);
		current.setValue(0);
		current.setStringPainted(true);
		p.add(current);
		setContentPane(p);
		
	}
	public void iterate(){
		while (num <=60){
			current.setValue(num);
			try{
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {}
			num += 1;
		}
	}
	

}
