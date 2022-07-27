package enums;

public enum Color {

	BLUE, GREEN, RED, ORANGE;
	
	public String toString() {
		
		if(this == BLUE)
			return "Blau";
		if(this == GREEN)
			return "Green";
		if(this == RED) 
			return "Red";
		if(this == ORANGE)
			return "Orange";
		
		return "color";
	}
	
}
