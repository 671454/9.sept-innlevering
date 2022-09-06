package innlevering_uke36;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B4 {

	public static void main(String[] args) {

		String T0meld = ("Trinn 0 skatt, med 0.0% sats"), T1meld = ("Trinn 1 skatt, med 0.93% sats"),
				T2meld = ("Trinn 2 skatt, med 2.41% sats"), T3meld = ("Trinn 3 skatt, med 11.52% sats"),
				T4meld = ("Trinn 4 skatt, med 14.52% sats");

		String brutto = showInputDialog("Skriv inn din bruttointekt(heltall) for å se din trinnskatt");
		int brukerInn = Integer.parseInt(brutto);

		if (brukerInn >= 0 && brukerInn <= 164100) {
			showMessageDialog(null, T0meld);
		} else if (brukerInn >= 164101 && brukerInn <= 230950) {
			showMessageDialog(null, T1meld);
		} else if (brukerInn >= 230951 && brukerInn <= 580650) {
			showMessageDialog(null, T2meld);
		} else if (brukerInn >= 580651 && brukerInn <= 934050) {
			showMessageDialog(null, T3meld);
		} else if (brukerInn >= 934051) {
			showMessageDialog(null, T4meld);
		} else {
			showMessageDialog(null, "Du har tastet inn en ugyldig inntekt");
		}

	}

}
