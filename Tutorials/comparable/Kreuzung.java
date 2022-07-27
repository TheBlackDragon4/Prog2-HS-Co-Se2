package comparable;

public class Kreuzung implements Comparable<Kreuzung>{
	
	private Ampel[] ampeln;
	
	/**
	 * 
	 * Anzahl der Ampeln der Kreuzung 
	 */
	public Kreuzung (int n) {
		
		ampeln = new Ampel[n];
		for (int i = 0; i < n; i++)
			ampeln[i] = new Ampel(i);
	}
	
	public int compareTo(Kreuzung k) {
		
		if (this.ampeln.length == k.ampeln.length) 
			return 0;
		if (this.ampeln.length < k.ampeln.length) 
			return -1;
		if (this.ampeln.length > k.ampeln.length) 
			return 1;
		
		return 0;
		
	}
	
	public String toString() {
		return "" + this.ampeln.length; 
	}
	
	
	public void steuereKreuzung() {
		// Ampeln nacheinander schalten mit Verzögerung von 1000 msec
		do {
			try {
				for (int i = 0; i < ampeln.length; i++) {
					ampeln[i].schalten();
					System.out.println(ampeln[i].toString());
					Thread.sleep(1000);
				}

				
			} catch (Exception e) {
				System.out.println("INTERNAL ERROR");
			}

		} while (true);

	}
}
