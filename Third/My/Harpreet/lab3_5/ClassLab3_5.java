package Harpreet.lab3_5;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClassLab3_5 extends JFrame{
	public ClassLab3_5(){
		setSize(400,100);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JLabel lbl = new JLabel("Expiration Date:");
		Integer[] months = new Integer[12];
		for(int i=0;i<12;i++){
			months[i] = i +1;
		}
		JComboBox<Integer> cmbMonths = new JComboBox<Integer>(months);
		Integer years[] = new Integer[17];
		for(int i=0,j=2000; j<=2016;j++,i++){
			years[i] = j;
		}
		JComboBox<Integer> cmbYears = new JComboBox<>(years);
		p.add(lbl);
		p.add(cmbMonths);
		p.add(cmbYears);
		setContentPane(p);
	}
}
