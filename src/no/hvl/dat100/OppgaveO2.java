package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO2 {

    public static void main(String[] args) {
        
        // Innhenter opplysning fra bruker
        int årsinntekt = Integer.parseInt(JOptionPane.showInputDialog("Hva er din brutto årsinntekt?"));
        
        // Dersom bruker oppgir ugyldig inntektssum får den en tilbakemelding på dette
        if (årsinntekt < 0) {
            JOptionPane.showMessageDialog(null, "Ugyldig inntektssum");
        } 
        // Betaler ingen trinnskatt dersom beløpet er under 208 050kr
        else if (årsinntekt < 208050) {
            JOptionPane.showMessageDialog(null, "Du skal ikke betale noe trinnskatt");
        } 
        // Beregner prosentvis trinnskatt som skal betales og gir en tilbakemelding til bruker
        else if (årsinntekt <= 292850) {
            JOptionPane.showMessageDialog(null, "Du skal betale " + årsinntekt * 0.017 + " kroner i trinnskatt.");
        }
        else if (årsinntekt <= 670000) {
            JOptionPane.showMessageDialog(null, "Du skal betale " + årsinntekt * 0.04 + " kroner i trinnskatt.");
        }
        else if (årsinntekt <= 937900) {
            JOptionPane.showMessageDialog(null, "Du skal betale " + årsinntekt * 0.136 + " kroner i trinnskatt.");
        }
        else if (årsinntekt <= 1350000) {
            JOptionPane.showMessageDialog(null, "Du skal betale " + årsinntekt * 0.166 + " kroner i trinnskatt.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Du skal betale " + årsinntekt * 0.176 + " kroner i trinnskatt.");
        }
    }
}
