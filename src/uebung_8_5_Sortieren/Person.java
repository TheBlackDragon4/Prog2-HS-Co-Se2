package uebung_8_5_Sortieren;

public class Person {

	final String firstName;
	private String lastName;
	private final int age;

	public Person(String f, String l, int a) {
		firstName = f;
		lastName = l;
		age = a;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public static String getFirstNameStatic(Person person) {
		return person.firstName;
	}

	public static int comparatorFirstName(Person lhs, Person rhs) {
		return lhs.firstName.compareTo(rhs.firstName);
	}
	
	public int comparatorFirstName1(Person rhs) {
		return this.firstName.compareTo(rhs.firstName);
	}

	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
