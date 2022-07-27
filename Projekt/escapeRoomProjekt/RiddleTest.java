package escapeRoomProjekt;

import java.util.Arrays;

public class RiddleTest {

	public static void main(String[] args) {

		Riddle riddle = new Riddle(3);
		
		System.out.println(riddle.getAnzahlRaetsel());
		System.out.println(Arrays.toString(riddle.getRaetsel()));
		
		System.out.println(riddle.raetselOne(1));
		System.out.println(Arrays.toString(riddle.getRaetsel()));
		
		System.out.println(riddle.raetselTwo(0));
		System.out.println(Arrays.toString(riddle.getRaetsel()));
		
		System.out.println(riddle.raetselThree(2));
		System.out.println(Arrays.toString(riddle.getRaetsel()));
		
		riddle.raetselThree(2);
		
		System.out.println(riddle.toString());
		
		System.out.println(riddle.getAnzahlRaetsel());
		
	}
	
}
