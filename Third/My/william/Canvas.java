package william;

import javax.swing.JFrame;



public class Canvas extends JFrame{
	public Canvas(){
		super("Canvas to draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,100);
		Flag f=new Flag();
		getContentPane().add(f);
	}

}