package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO1 {




	
	public static void main(String[] args) {
		for (int x=1; x<=10; x++) {
		
		//Innhenter poengsum fra bruker
		int poengsum = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange poeng fikk du på sist prøve?"));
		
		//De forskjellige karakterene man kan få basert på poengsum
		if (poengsum >=90 && poengsum <=100) {
			    JOptionPane.showMessageDialog(null,"Du fikk karakteren A!");
		    }
		    else if (poengsum <= 89 && poengsum >= 80) {
			    JOptionPane.showMessageDialog(null, "Du fikk karakteren B!");
		    }
			else if (poengsum <=79  && poengsum >= 60) {
				JOptionPane.showMessageDialog(null, "Du fikk karakteren C!");
			}
			else if (poengsum <= 59 && poengsum >= 50) {
				JOptionPane.showMessageDialog(null, "Du fikk karakteren D!");
			}
			else if (poengsum <= 49 && poengsum >= 40) {
				JOptionPane.showMessageDialog(null, "Du fikk karakteren E!");
			}
			else if (poengsum <= 39 && poengsum >= 0)  {
				JOptionPane.showMessageDialog(null, "Du fikk karakteren F!");
			}
				else {
					//Ugyldig poengsum
					JOptionPane.showMessageDialog(null, "Ugydlig poengsum, prøv på nytt");
					x--;
					//Trekker fra et forsøk på telleren
				}
		}

	}
}

