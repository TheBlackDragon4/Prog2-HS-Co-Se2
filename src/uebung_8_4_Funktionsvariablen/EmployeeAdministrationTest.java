package uebung_8_4_Funktionsvariablen;

import java.util.Arrays;
import java.util.function.Predicate;

public class EmployeeAdministrationTest {

	public static Predicate<Employee> isAgeMoreThan(Integer age) {
		return p -> p.getAge() > age;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
		Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
		Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
		Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
		Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
		Employee e6 = new Employee(6, 15, "M", "David", "Feezor");
		Employee e7 = new Employee(7, 68, "F", "Melissa", "Roy");
		Employee e8 = new Employee(8, 79, "M", "Alex", "Gussin");
		Employee e9 = new Employee(9, 15, "F", "Neetu", "Singh");
		Employee e10 = new Employee(10, 45, "M", "Naveen", "Jain");

		EmployeeAdministration employees = new EmployeeAdministration(
				Arrays.asList(new Employee[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 }));

		// The predicates
		// Besonderheiten -> Prädikat beschreibt ein Objekt das mit true oder false
		// beschrieben wird
		Predicate<Employee> isAgeMoreThan18 = isAgeMoreThan(18);
		Predicate<Employee> isAgeMoreThan18a = p -> p.getAge() > 18;

		isAgeMoreThan18 = isAgeMoreThan(18);

		Predicate<Employee> isMale = p -> p.getGender().equalsIgnoreCase("M") || p.getGender().equalsIgnoreCase("m");
		Predicate<Employee> isFemale = p -> p.getGender().toLowerCase().contains("f");
		Predicate<Employee> isAdultMale = isMale.and(isAgeMoreThan18);
		// oder so:
		Predicate<Employee> isAdultMale2 = isAgeMoreThan18.and(isMale);
		// Ende
		Predicate<Employee> firstNameDavid = p -> p.getFirstName().equals("David");

		// The out filter output
		System.out.println("---- all employees > age 21 --- \n" + employees.filter(isAgeMoreThan18));
		System.out.println("---- all employees > age 21 --- \n" + employees.filter(isAgeMoreThan18a));
		System.out.println("\n---- all employees male ---- \n" + employees.filter(isMale));
		// Ausgabe aller Weiblichen Personen durch die negation
		// 2. Möglichkeiten
		System.out.println("\n---- all employees female ---- \n" + employees.filter(isMale.negate()));
		// oder
		System.out.println("\n---- all employees female ---- \n" + employees.filter(isFemale));
		// Ende

		// 2 Möglichkeiten :
		System.out.println("\n---- all employees AdultMale ---- \n" + employees.filter(isAdultMale));
		System.out.println("\n---- all employees AdultMale ---- \n" + employees.filter(isAdultMale2));
		// oder so :
		System.out.println("\n---- all employees AdultMale ---- \n" + employees.filter(isAgeMoreThan18.and(isMale)));

		System.out.println("\n---- all employees David firstName ---- \n" + employees.filter(firstNameDavid));
		System.out.println("\n---- all employees <= 35 ---- \n" + employees.filter(isAgeMoreThan(35)));
		// negation mit or Verkettung
		System.out.println("\n---- all employees AdultMale of female ----\n"
				+ employees.filter(isAdultMale.negate().or(isAgeMoreThan18)));

	}
}
