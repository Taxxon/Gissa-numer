/**
	Här gör jag övning på classroom 
	Av Emil Käck
	2016-10-10
**/

import javax.swing.*;

public class Gissa {
	public static void main(String[] arg){

		double d;
		String giss;
		int stor;
		int litten;
	
		double randNumber = Math.random();
		d = randNumber * 100;
		int randomInt = (int)d;
		giss = JOptionPane.showInputDialog("Gissa numer från 1 till 100");
		int gissning = Integer.parseInt(giss);
		litten = randomInt - gissning;
		stor = gissning - randomInt;
		
		if (gissning == randomInt){
			JOptionPane.showMessageDialog(null, "Rätt!");
		}
		else if (gissning < randomInt){
		JOptionPane.showMessageDialog(null, "Det är för littet" + "\n" + "Du saknar " + litten + " för rätt svar.");
		}
		else 
		JOptionPane.showMessageDialog(null, "Det är för stort" + "\n" + "Du behöver ta bort " + stor + " för rätt svar." );
		
	}
} 