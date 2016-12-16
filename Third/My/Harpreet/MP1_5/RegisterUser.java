package Harpreet.MP1_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bohdan.Databases.ProjDataAccess;

public class RegisterUser extends JFrame implements ActionListener{
	ProjDataAccess data = new ProjDataAccess();
	JTextField txtName = new JTextField(10);
	JTextField txtPass = new JTextField(10);
	public RegisterUser(){

		
		JPanel panel = new JPanel();
		setSize(500,500);
		JLabel lbl = new JLabel("Enter UserName: ");
		
		JLabel lbl2 = new JLabel("ENter Password:");
		
		JButton btnAdd = new JButton("Register");
		btnAdd.addActionListener(this);
		panel.add(lbl);
		panel.add(txtName);
		panel.add(lbl2);
		panel.add(txtPass);
		panel.add(btnAdd);
		setContentPane(panel);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evt){
		data.registerNewUser(txtName.getText(), txtPass.getText());
	}
}
