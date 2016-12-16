package Harpreet.mp1_3;

import java.awt.*;

import javax.swing.*;

public class HangingMan extends JPanel{
	Graphics2D comp2D;
	public void paintComponent(Graphics comp){
		comp2D = (Graphics2D)comp;
		
		comp2D.drawRect(70, 280, 120, 50);
		switch(GuessingGame21.drawNext){
		case 9 : drawFace(comp2D);
				
				break;
		case 8 : drawEyes(comp2D);
		
				break;
		case 7 : drawNose(comp2D);
				break;
		case 6 : drawMouth(comp2D);
				break;
		case 5 : drawEar(comp2D);
				break;
		case 4 : drawNeck(comp2D);
				break;
		case 3 : drawChest(comp2D);
				break;
		case 2 : drawArms(comp2D);
				break;
		case 1 : drawLegs(comp2D);
				break;
		case 0 : drawRope(comp2D);
		}
	}
	public void repaintCOmp(){
		paintComponent(getGraphics());
	}
	public void drawFace(Graphics2D comp2D){
		//comp2D.setColor(Color.white);
		//comp2D.fillRect(210,35,6,15);
		//comp2D.setColor(Color.pink);
        comp2D.drawOval(100, 50, 50, 70);
        //comp2D.setColor(Color.white);
        //comp2D.fillRect(207,75,15,6);
	}
	public void drawEyes(Graphics2D comp2D){
		comp2D.drawOval(110,70,10,10);
		comp2D.drawOval(130,70,10,10);
	}
public void drawMouth(Graphics2D comp2D){
		comp2D.drawOval(118, 100, 15, 7);
	}
public void drawNose(Graphics2D comp2D){
	comp2D.drawLine(125, 85, 125, 95);
}
public void drawEar(Graphics2D comp2D){
	comp2D.drawOval(93,80,6,10);
	comp2D.drawOval(151,80,6,10);
}
public void drawNeck(Graphics2D comp2D){
	comp2D.drawLine(126, 120, 126, 130);
}
public void drawChest(Graphics2D comp2D){
	comp2D.drawRoundRect(100, 130, 60, 100, 10, 10);
}
public void drawArms(Graphics2D comp2D){
	comp2D.drawLine(100,130, 80, 180);
	comp2D.drawLine(160, 130, 180, 180);
}
public void drawLegs(Graphics2D comp2D){
	comp2D.drawLine(100,230, 80, 280);
	comp2D.drawLine(160, 230, 180, 280);
}
public void drawRope(Graphics2D comp2D){
	comp2D.clearRect(70, 280, 130, 60);
	comp2D.setColor(Color.red);
	comp2D.drawArc(70, 0, 110, 125, -180, 180);

}
}
