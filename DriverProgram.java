import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author fabi
 *
 */
public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  ██████████████████████████████████████████████");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░¿Deseas prender la radio?░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░Si (1)░░░░░No (2)░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("  █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println(" ████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████");
		System.out.println("█▀████████████████████████████████████████████████");
		System.out.println("█▄▄██▌                                      ███░▐█");
		System.out.println("▀███▀      █▄▄▄▄█    ██▄▄██    █▄▄▄▄█       ▀███▀");
		System.out.println("           ██████     ████     ██████             ");


	
	Scanner in = new Scanner(System.in);
	String opt = in.nextLine();
	
	switch(opt) {
	
	case "1": {
		radio.turnOn(true);
		JOptionPane.showMessageDialog(null, "La radio está encendida");
	} break;
	
	case "2": {
		
	} break;
	
	default:{
		
	} break;
	
	}
	

}

	
}