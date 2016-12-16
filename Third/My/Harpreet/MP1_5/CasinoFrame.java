package Harpreet.MP1_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import finalassigment.Pong;
import Harpreet.mp1_3.GuessingGame21;
import alex.micro_project1.Soundtest;
import alex.micro_project1.*;
import bohdan.Databases.ProjDataAccess;

public class CasinoFrame extends JFrame implements ActionListener{
	JPanel mainPanel = new JPanel();
	JPanel topPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JTextField txtUserName = new JTextField(10);
	JTextField txtPassword = new JTextField(10);
    JPanel subPanel1 = new JPanel();
    JPanel subPanel2 = new JPanel();
    JButton btnLogin = new JButton("Login");
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	ProjDataAccess data = new ProjDataAccess();
	static boolean isLogedIn = false;
	String usName;
	
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
		buildPong();
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
		JLabel lbl4 = new JLabel("Harpreet Kaur 300910377");
		JLabel lbl5 = new JLabel("Bohdan Sharipov 300908588");
		JLabel lbl6 = new JLabel("Guillermo Peralta 300923022");
		JLabel lbl7 = new JLabel("Alexey Ulyanov 300913498");
		p1.add(lbl3);
		p1.add(lbl4);
		p1.add(lbl5);
		p1.add(lbl6);
		
		p.add(p1,  BorderLayout.CENTER);
		topPanel.add(p);
	}
	
	public void buildLogin(){
		JPanel p = new JPanel();
		p.setSize((int)screenSize.getWidth(), 200);
		BoxLayout layout = new BoxLayout(p, BoxLayout.PAGE_AXIS);
	
		JLabel lbl = new JLabel("UserName:");
		
		subPanel1.add(lbl);
		subPanel1.add(txtUserName);
		JLabel lbl2 = new JLabel("Password:");
		int j=0;
		JButton btnArray[]=new JButton[100];
		for(int i=0; i<10; i++){
			j= i + 1; 
			btnArray[i] = new JButton("" + j);
			btnArray[i].addActionListener(this);
			btnArray[i].setName(j + "");
			subPanel2.add(btnArray[i]);
			
		}
		
		subPanel2.add(lbl2);
		subPanel2.add(txtPassword);
		

        btnLogin.addActionListener(this);
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
		ImageIcon icon = new ImageIcon("Recourc/guessingGame.png");
		
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
	
	public void buildPong(){
		JPanel p = new JPanel();
		ImageIcon icon = new ImageIcon("Recourc/pong.png");
		JButton btnPong = new JButton(icon);
		btnPong.addActionListener(this);
		btnPong.setSize(100, 100);
		btnPong.setName("btnPong");
		p.add(btnPong);
		
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
		    if (isLogedIn) {
                GuessingGame21 guessingGame21 = new GuessingGame21(usName);
            }
		}else if(btn.getName().equals("btnMusic")){
			Soundtest sound = new Soundtest();

			
			Thread music = new Thread(new Runnable() {
				@Override
				public void run() {
					while(true) {
						sound.startPlaying();
					}
				}	
			});
			music.setDaemon(true);
			music.start();
		}else if(btn.getName().equals("btnScore")){
			if (isLogedIn) {
				Scores scores = new Scores(usName);
			}
		}else if(btn.getName() == "btnPong"){
			if (isLogedIn) {
				Pong Pong = new Pong();
				//gfdgfd
			}
		}else if(btn.getName().equals("btnLogin")){
			//txtUserName
            String userName = txtUserName.getText();
			isLogedIn = ProjDataAccess.checkUserCredentials(userName, txtPassword.getText());
			if (isLogedIn) {
				usName = userName;
                subPanel1.setVisible(false);
                subPanel2.setVisible(false);
                btnLogin.setText("Welcome, " + userName);
            }
		}else if(btn.getName().equals("btnRegister")){
			RegisterUser reg = new RegisterUser();
		}else{
			
			int number = Integer.parseInt(btn.getText());
			txtPassword.setText(txtPassword.getText() + number );
		}
	}
}
