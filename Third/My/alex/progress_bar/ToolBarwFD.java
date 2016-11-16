package alex.progress_bar;

import java.awt.BorderLayout;
import java.awt.FileDialog;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class ToolBarwFD extends JFrame {
	
	public ToolBarwFD() {
		
		setTitle("Tool Bar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JFrame b = new JFrame();
		FileDialog fd = new FileDialog(b, "Pick a file:", FileDialog.LOAD);
		//fd.setFile(".pdf");
		fd.setVisible(true);
		String filename = fd.getFile();
		System.out.println(filename);
		String a = fd.getDirectory();
	
		System.out.println(a+filename);

		ImageIcon image1 = new ImageIcon(a+filename);
		JButton button1 = new JButton(image1);
		ImageIcon image2 = new ImageIcon(a+filename);
		JButton button2 = new JButton(image2);
		ImageIcon image3 = new ImageIcon(a+filename);
		JButton button3 = new JButton(image3);
		JToolBar bar = new JToolBar();
		bar.add(button1);
		bar.add(button2);
		bar.add(button3);
		JTextArea edit = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		JPanel p = new JPanel();
		BorderLayout bor = new BorderLayout();
		p.setLayout(bor);
		p.add("North", bar);
		p.add("Center", scroll);
		setContentPane(p);


		
		
		System.out.println("");
		}
}