	package alex;
	import javax.swing.JOptionPane;
	
public class Lab2_4_Quadratic_Equation {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Please enter coefficient a: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Please enter coefficient b: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Please enter coefficient c: "));
		
		double Delta = calculateDelta(a, b, c);
		
		double root1 = ((-b + Math.sqrt(Delta)) / (2*a));
	    double root2 = ((-b - Math.sqrt(Delta)) / (2*a));
	    
	    
	    if ((Delta) > 0) {
            JOptionPane.showMessageDialog(null, "Equation has two roots" +"\n"+" x1 and x2 are : "+  root1+" and " +root2);
        }
	    else if(Delta ==0) {
            JOptionPane.showMessageDialog(null, "Equation has one root"+  "\n"+ " x1 is:  " +root1);
        }
	    else{

            JOptionPane.showMessageDialog(null, "No real roots");
        }
	    
	}
	
	public static double calculateDelta(double a, double b, double c) {
		
		return (Math.pow(b, 2) - 4*a*c);
		
	}
	
	
}
