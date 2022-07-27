package schneemann;

import java.awt.Window;

public abstract class GraphicalObject {

	protected int x;
	protected int y;
	
	Polygon p; // besteht aus und Delegiert Werte an Polygon weiter
	
	protected GraphicalObject(int x, int y) { // Durch Protected kann keine Instanz des Objektes gebildet werden
		this.x = x;
		this.y = y;
	}
	
	public void draw(Window w) {
		
	}
	
	public String toString() {
		return " " + x + " " + y ;
	}
	
	
}
