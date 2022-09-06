package innlevering_uke36;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B5 {

	public static void main(String[] args) {

		String melding = "Hva ble din poengsum? ";
		String melding2 = "Du har tastet en ugyldig poengsum!";

		for (int i = 1; i <= 10; i++) {
			int brukerInn = Integer.parseInt(showInputDialog(melding + "Bruker. " + i));

			String A = "Karakter A";
			String B = "Karakter B";
			String C = "Karakter C";
			String D = "Karakter D";
			String E = "Karakter E";
			String F = "Karakter F";

			if (brukerInn >= 0 && brukerInn <= 39) {
				showMessageDialog(null, F);
			} else if (brukerInn >= 40 && brukerInn <= 49) {
				showMessageDialog(null, E);
			} else if (brukerInn >= 50 && brukerInn <= 59) {
				showMessageDialog(null, D);
			} else if (brukerInn >= 60 && brukerInn <= 79) {
				showMessageDialog(null, C);
			} else if (brukerInn >= 80 && brukerInn <= 89) {
				showMessageDialog(null, B);
			} else if (brukerInn >= 90 && brukerInn <= 100) {
				showMessageDialog(null, A);
			} else {
				showMessageDialog(null, melding2);
				i--;

			}
		}

	}

}
