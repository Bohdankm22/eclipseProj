package william;


import javax.swing.JOptionPane;

public class Siren {

public static void main(String[] args) {
int numBeeps, numSilence, numIter;
String sirenSound = "";
numBeeps = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of beeps"));
numSilence = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of silences to be there after every beep pattern "));
numIter = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of iterations"));
SirenClass sirenObj = new SirenClass();
sirenObj.setNumBeeps(numBeeps);
sirenObj.setNumSilence(numSilence);
sirenObj.setNumIter(numIter);
sirenObj.fireSiren();
sirenSound = sirenObj.activateSiren();
JOptionPane.showMessageDialog(null, "The siren sound created is: \n" + sirenSound);
}

static class SirenClass{
private String sirenCode = "";
private int numBeeps;
private int numSilence;
private int numIter;
public void setNumBeeps(int nb){
numBeeps = nb;
}
public void setNumSilence(int ns){
numSilence = ns;
}
public void setNumIter(int ni){
numIter = ni;
}
public void fireSiren(){
String sirenCd = ""; 
for(int i=0; i<numIter;i++){
for(int j=0;j<numBeeps;j++){
sirenCd+="Beep";
}
for(int k=0; k<numSilence; k++){
sirenCd += " ";
}
}
sirenCode = sirenCd; 
}
public String activateSiren(){
return sirenCode;
}
}
}

