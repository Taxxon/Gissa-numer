/**
	H�r g�r jag �vning p� classroom 
	Av Emil K�ck
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
		giss = JOptionPane.showInputDialog("Gissa numer fr�n 1 till 100");
		int gissning = Integer.parseInt(giss);
		litten = randomInt - gissning;
		stor = gissning - randomInt;
		
		if (gissning == randomInt){
			JOptionPane.showMessageDialog(null, "R�tt!");
		}
		else if (gissning < randomInt){
		JOptionPane.showMessageDialog(null, "Det �r f�r littet" + "\n" + "Du saknar " + litten + " f�r r�tt svar.");
		}
		else 
		JOptionPane.showMessageDialog(null, "Det �r f�r stort" + "\n" + "Du beh�ver ta bort " + stor + " f�r r�tt svar." );
		
	}
} 