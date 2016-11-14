package alex.graphics;

import javax.swing.*;

import java.awt.*;

public class Canvas extends JFrame {
	
	

	public Canvas() {
		
		super("Canvas to draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		FigurePane f = new FigurePane();
		getContentPane().add(f);
		
	}
}
