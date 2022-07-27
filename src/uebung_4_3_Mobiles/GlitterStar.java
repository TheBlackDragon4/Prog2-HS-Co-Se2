package uebung_4_3_Mobiles;

public class GlitterStar extends Star{

	public GlitterStar(double gewicht) {
		super(gewicht);
	}
	
	public double decorate() {
		return this.gewicht += 1;
	}
	
}
