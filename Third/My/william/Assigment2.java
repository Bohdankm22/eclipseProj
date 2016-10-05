package william;

import javax.swing.JOptionPane;

public class Assigment2 {
	public static void main(String[] args){
		char abc[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    char code[]={'d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c'};
	    String text="", encode="";
	    text = JOptionPane.showInputDialog("Provide a word");
	    int i=0,j=0;
	    for(i=0;i<text.length();i++){
            for(j=0;j<abc.length;j++){
                if(text.charAt(i)!=abc[j]){
                    
                }else{
                    encode=encode+code[j];
                }
            }
        }
	    System.out.println("Encoded:"+encode);
	}
}
