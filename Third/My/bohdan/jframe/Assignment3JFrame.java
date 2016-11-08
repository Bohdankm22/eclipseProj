package bohdan.jframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Assignment3JFrame extends JFrame {


	private static final long serialVersionUID = 1L;

	public Assignment3JFrame () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random r = new Random();
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int height = r.nextInt(d.height / 5);
		int width = height * 5;//r.nextInt(d.width);
//		System.out.println(" width" + width);
//		System.out.println(" height" + height);
		setSize(width, height);
		int locWidth = r.nextInt(d.width - width);
		int locHeight = r.nextInt(d.height - height);
//		System.out.println("Loc width" + locWidth);
//		System.out.println("Loc height" + locHeight);
		setLocation(locWidth, locHeight);
		
		JLabel label = new JLabel("Software Engineering");
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, height / 2));
		label.setForeground(Color.RED);
		getContentPane().add(label);
	}
}

