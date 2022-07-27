package escapeRoomProjekt;

public class EscapeRoomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EscapeRoom escapeRoom = new EscapeRoom();
		EscapeRoom escapeRoom = new EscapeRoom(3);
		
		escapeRoom.raetselAufruf();
		
		System.out.println(escapeRoom.toString());		
		
		System.out.println(escapeRoom.getAnzahlRaetsel());
		System.out.println(escapeRoom.getFinalPW());
		
	}

}
