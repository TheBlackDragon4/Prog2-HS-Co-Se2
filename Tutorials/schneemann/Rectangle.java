package schneemann;

import java.awt.Window;

public class Rectangle extends GraphicalObject {

	private int w;
	private int h;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.w = width;
		this.h = height;
	}

	public void draw(Window w) {

	}

	public String toString() {
		return "";
	}
}
