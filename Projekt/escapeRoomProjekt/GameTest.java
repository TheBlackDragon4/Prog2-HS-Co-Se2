package escapeRoomProjekt;

public class GameTest {

	public static void main(String[] args) {

		Game game = new Game(20);
		
		game.Spielelogik();
		
		System.out.println(game.getRooms());
		
		System.out.println(game.toString());
	}

}
