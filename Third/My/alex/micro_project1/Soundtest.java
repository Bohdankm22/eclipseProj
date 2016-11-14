package alex.micro_project1;


import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileInputStream;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import sun.audio.*;


//test

public class Soundtest extends JFrame {
	
	static Clip clip;
	
	static JProgressBar current;
	static JTextArea out;
	static JButton find;
	Thread runner;

	public static void main(String[] args) {
			
		
		
		
		//System.out.println(Clap.getAbsolutePath());
		//System.out.println(Clap.exists());
		
		Soundtest sound = new Soundtest();	
		
		
	}
	
	public Soundtest(){
		
		setTitle("Progress");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		current = new JProgressBar(0, 100); //
		current.setValue(0);
		current.setStringPainted(true);
		p.add(current);
		setContentPane(p);
		pack();
		setVisible(true);
			
		try {
			clip = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} 
		
		JFrame b = new JFrame();
		FileDialog fd = new FileDialog(b, "Pick a file:", FileDialog.LOAD);
		//fd.setFile(".pdf");
		fd.setVisible(true);
		
		String filename = fd.getFile();
		System.out.println(filename);
		String a = fd.getDirectory();
		System.out.println(a+filename);
		
		//File Clap = new File("sound_converted.wav");
		
		File Clap = new File(a+filename);
		
		
		playMedia(Clap);
		
		
		iterate(clip.getMicrosecondLength());		
		
	}

	public void iterate(long durInMicro){
		int num = 0;
		int durInMili = Math.round(durInMicro / 1000);
		while (num <= durInMili){
			current.setValue(num);
			try{
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {}
			num += 1000;
		}
		
	}
	public void playMedia(File Sound) {
		
		
        try {
        	clip.open(AudioSystem.getAudioInputStream(Sound));
        	clip.start();

        	//Thread.sleep(5000);
        	
//        	Thread.sleep(clip.getMicrosecondLength()/1000);
        	
        } catch(Exception e) {
        	
      }
	}
}

