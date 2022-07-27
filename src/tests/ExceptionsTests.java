package tests;

public class ExceptionsTests {

	public static void main(String[] args) {
		String s = "-";

		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				try {
					throw new Exception();
				} catch (Exception ex) {
					s += "ic ";
				}
				throw new Exception();
			} catch (Exception x) {
				s += "mc ";
			} finally {
				s += "mf ";
			}
		} finally {
			s += "of ";
		}
		System.out.println(s);
	}

}
