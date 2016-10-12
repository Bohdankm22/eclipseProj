package alex;
import javax.swing.JOptionPane;

public class Substitution {
	
	public static char alphabet[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };
	
	public static char code[]  = { 't', 'm', 'e', 's', 'f', 'k', 'j', 'a', 'x',
            'n', 'o', 'v', 'l', 'u', 'c', 'h', 'z', 'g', 'y', 'b', 'w', 'p',
            'd', 'z', 'i', 'q' };
	
	public static String encrypt(String s)
    {
        char c[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (alphabet[j] == s.charAt(i))
                {
                    c[i] = code[j];
                    break;
                }
            }
        }
        return (new String(c));
    }
	
	public static String decrypt(String s)
    {
        char alpha[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (code[j] == s.charAt(i))
                {
                    alpha[i] = alphabet[j];
                    break;
                }
            }
        }
        return (new String(alpha));
    }
	
	
	public static void main(String[] args) {
		
		String input_str, encrypted_str;
		input_str = JOptionPane.showInputDialog("Please enter word to encrypt: ");
		encrypted_str  = encrypt(input_str.toLowerCase());
//        System.out.println("Encrypted message: " + encrypted_str);
		JOptionPane.showMessageDialog(null, "Encrypted word: " + encrypted_str);
		JOptionPane.showMessageDialog(null, "Decrypted word: " + decrypt(encrypted_str));
//        System.out.println("Decrypted message: " + doDecryption(en));

	}

}
