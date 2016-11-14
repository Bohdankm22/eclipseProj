package alex.micro_project1;


import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Soundtest extends JFrame {
	
	Clip clip;
	JProgressBar progressBar;
	JTextArea textArea;
//	JButton button;
	File soundFile;
	
	public Soundtest(){
		
		setTitle("Progress");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame b = new JFrame();
		FileDialog fd = new FileDialog(b, "Pick a file:", FileDialog.LOAD);
		fd.setVisible(true);
		
		soundFile = new File(fd.getDirectory() + fd.getFile());
	}
	
	private void showProgressBar(long micro) {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		progressBar = new JProgressBar(0, (int)micro / 1000); //
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		textArea = new JTextArea();
		textArea.setText("Duration is " + micro + " microseconds \nCurrent fragment is 0");
		p.add(textArea);
		p.add(progressBar);
		setContentPane(p);
		pack();
		setVisible(true);
	}
	
	public void startPlaying() {
		playMedia(soundFile);
		showProgressBar(clip.getMicrosecondLength());
		iterate(clip.getMicrosecondLength());
	}

	private void iterate(long durInMicro){
		int num = 0;
		int durInMili = Math.round(durInMicro / 1000);
		while (num <= durInMili){
			progressBar.setValue(num);
			textArea.setText("Duration is " + durInMicro + " microseconds \nCurrent fragment is " + num * 1000);
			try{
				Thread.sleep(1);
			} catch (InterruptedException e) {}
			num += 1;
		}
		
	}
	
	private void playMedia(File Sound) {
        try {
        	clip = AudioSystem.getClip();
        	clip.open(AudioSystem.getAudioInputStream(Sound));
        	clip.start();
        } catch(Exception e) {	
        	System.out.println(e);
      }
	}
}

