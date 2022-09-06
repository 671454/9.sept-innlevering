package innlevering_uke36;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class B6 {

	public static void main(String[] args) {

		String melding = "Vi skal regne ut fakultetet av ditt tall!\n\nSkriv inn et heltall:";
		int n = Integer.parseInt(showInputDialog(melding));
		
		int x = n;
		
		int y = 1;
				
		while (n > 1) {
			y *= n;
			n--;
			
		}
		showMessageDialog(null, x + "! " + "er: " + y);

	}

}
