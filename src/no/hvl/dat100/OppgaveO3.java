package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		//Innhenter heltall fra bruker
	int heltall = Integer.parseInt(showInputDialog(null, "Hvilket heltall ønsker du å beregne fakulteten til?"));
	
        //For-løkken regner ut fakulteten av "heltall" 
	if (heltall>0) {
		long fakultet = 1;
		
		
		for (int n=heltall; n>= 1; n--) {
			fakultet *=n;
		}
		showMessageDialog(null, "Fakulteten av " + heltall + " er " + fakultet);
	}
       //Dersom tallet er under eller lik 0, får bruker en tilbakemelding på at dette ikke funker
	else if (heltall<=0) {
		showMessageDialog(null, "Heltallet må være høyere enn 0 for å kunne regnes fakulteten av.");
	}

	}

}
