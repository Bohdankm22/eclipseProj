package myclasses;

import javax.swing.JOptionPane;

public class EligibleToWork {

	public static void main(String[] args) {
//		grade();
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please input your age "));
		boolean isMale = JOptionPane.showInputDialog("Please input M for male").equals("M");
		if (age >= 18 && isMale) {
			JOptionPane.showMessageDialog(null, "Men adult");
		} else if (age >= 18 && !isMale){
			JOptionPane.showMessageDialog(null, "Woman adult");
		} else if(isMale) {
			JOptionPane.showMessageDialog(null, "Man child");
		} else {
			JOptionPane.showMessageDialog(null, "Woman	 child");
		}
	}
	
	public static void grade(){
		int grade = Integer.parseInt(JOptionPane.showInputDialog("Please input your grade "));
		if (grade <= 100 && grade >=90) {
			System.out.println("Your grade is A");
		} else if (grade <= 89 && grade >= 80) {
			System.out.println("Your grade is B");
		} else if (grade <= 79 && grade >= 70) {
			System.out.println("Your grade is C");
		} else if (grade <= 69 && grade >= 60) {
			System.out.println("Your grade is D");
		} else if (grade <= 59 && grade >= 0) {
			System.out.println("Your grade is F");
		} else {
			System.out.println("Incorrect input");
		}
	}

}
