package Harpreet.MP1_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Harpreet.mp1_3.GuessingGame21;
import alex.micro_project1.Soundtest;
import bohdan.Databases.ProjDataAccess;

public class CasinoFrame extends JFrame implements ActionListener{
	JPanel mainPanel = new JPanel();
	JPanel topPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JTextField txtUserName = new JTextField(10);
	JTextField txtPassword = new JTextField(10);
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	ProjDataAccess data = new ProjDataAccess();
	
	public CasinoFrame(){
		//setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(screenSize);
		
		BoxLayout layout = new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS);
		mainPanel.setLayout(layout);
		mainPanel.setSize(screenSize);
		buildLayouts();
		build();
		setContentPane(mainPanel);
		pack();
		setVisible(true);
	}
	public void buildLayouts(){
		FlowLayout fl = new FlowLayout();
		topPanel.setLayout(fl);
		
		GridLayout gl = new GridLayout(1, 4);
		bottomPanel.setLayout(gl);
		//FlowLayout
	}
	public void build(){
		
		buildImage();
		buildStudentInfo();
		buildLogin();
		buildRegister();
		buildGuessingGame();
		buildMusic();
		buildScores();
		buildAll();
	}
	public void buildImage(){
		JPanel p1 = new JPanel();
		p1.setSize(200,200);
		p1.setLocation(0, 0);
		ImageIcon icon = new ImageIcon("Recourc/CasinoImage.png");
		JLabel lbl = new JLabel(icon);		
		p1.add(lbl);
		
		topPanel.add(p1);
	}
	public void buildStudentInfo(){
		JPanel p = new JPanel();
		p.setSize(200,200);
		BorderLayout layout = new BorderLayout();
		p.setLayout(layout);
		ImageIcon icon = new ImageIcon("Recourc/centennialLogo.jpg");
		JLabel lbl = new JLabel(icon);
		lbl.setSize(100,100);
		
		p.add(lbl,BorderLayout.WEST);
		JLabel lbl2 = new JLabel("COMP 228 CASINO");
		Font font = new Font("Courier New", Font.BOLD, 40);
		lbl2.setFont(font);
		p.add(lbl2, BorderLayout.NORTH);
		JPanel p1 = new JPanel();
		BoxLayout boxLayout = new BoxLayout(p1, BoxLayout.PAGE_AXIS);
		p1.setLayout(boxLayout);
		JLabel lbl3 = new JLabel("Developed By: ");
		JLabel lbl4 = new JLabel("Harpreet Kaur");
		JLabel lbl5 = new JLabel("Bohdan Sharipov");
		p1.add(lbl3);
		p1.add(lbl4);
		p1.add(lbl5);
		
		p.add(p1,  BorderLayout.CENTER);
		topPanel.add(p);
	}
	
	public void buildLogin(){
		JPanel p = new JPanel();
		p.setSize((int)screenSize.getWidth(), 200);
		BoxLayout layout = new BoxLayout(p, BoxLayout.PAGE_AXIS);
		JPanel subPanel1 = new JPanel();
		JPanel subPanel2 = new JPanel();
	
		JLabel lbl = new JLabel("UserName:");
		
		subPanel1.add(lbl);
		subPanel1.add(txtUserName);
		JLabel lbl2 = new JLabel("Password:");
		
		subPanel2.add(lbl2);
		subPanel2.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setName("btnLogin");
		p.add(subPanel1);
		p.add(subPanel2);
		p.add(btnLogin);
		
		centerPanel.add(p);
	}
	
	public void buildRegister(){
		JPanel p = new JPanel();
		JButton btnRegister = new JButton("User Registration \n New User? Click here to Register.");
		btnRegister.addActionListener(this);
		btnRegister.setName("btnRegister");
		p.add(btnRegister);
		centerPanel.add(p);
	}
	
	public void buildGuessingGame(){
		JPanel p = new JPanel();
		ImageIcon icon = new ImageIcon("Recourc/uessingGame.png");
		
		JButton btnGuessing = new JButton(icon);
		btnGuessing.addActionListener(this);
		btnGuessing.setSize(100, 100);
		btnGuessing.setName("btnGuessing");
		p.add(btnGuessing);
		
		bottomPanel.add(p);
		
	}
	
	public void buildMusic(){
		JPanel p = new JPanel();
		ImageIcon icon = new ImageIcon("Recourc/playmusicImage.png");
		JButton btnMusic = new JButton(icon);
		btnMusic.setSize(100,100);
		btnMusic.setName("btnMusic");
		btnMusic.addActionListener(this);
		p.add(btnMusic);
		
		bottomPanel.add(p);
	}
	
	public void buildScores(){
		JPanel p = new JPanel();
		ImageIcon icon = new ImageIcon("Recourc/scoresImage.png");
		JButton btnScore = new JButton(icon);
		btnScore.setName("btnScore");
		btnScore.addActionListener(this);
		p.add(btnScore);
		
		bottomPanel.add(p);
	}
	public void buildAll(){
		mainPanel.add(topPanel);
		mainPanel.add(centerPanel);
		mainPanel.add(bottomPanel);
		
	}
	
	public void actionPerformed(ActionEvent evt){
		Object source = evt.getSource();
		JButton btn = (JButton)source;
		if(btn.getName().equals("btnGuessing")){
			GuessingGame21 guessingGame21 = new GuessingGame21();
		}else if(btn.getName().equals("btnMusic")){
			Soundtest sound = new Soundtest();
			sound.startPlaying();
		}else if(btn.getName().equals("btnScore")){
			Scores scores = new Scores();
		}else if(btn.getName().equals("btnLogin")){
			//txtUserName
			boolean loggedIn = ProjDataAccess.checkUserCredentials(txtUserName.getText(), txtPassword.getText());
		}else if(btn.getName().equals("btnRegister")){
			RegisterUser reg = new RegisterUser();
		}
	}
}
