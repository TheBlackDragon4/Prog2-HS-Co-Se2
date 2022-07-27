package aufgabe_6_7_8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class ElementUtils {

	// Aufgabe 6
//	public static List<String> allMatches(List<String> candidates, Predicate<String> matchFunction) {
//
//		List<String> results = new ArrayList<String>();
//
//		for (String s : candidates) {
//			// Funktion für Prüfung ob das Predicat erfüllt ist oder nicht
//			if (matchFunction.test(s)) {
//				results.add(s); // Fügt ein candidates in die Liste results ein
//			}
//		}
//
//		return results;
//
//		// Variante 2
////		return candidates.stream().filter(matchFunction).collect(Collectors.toList());
//
//	}

	// Aufgabe 7
	// T nimmt einen Beliebigen Wert an und die Methode ist allgemeingültig für
	// beliebige
	// Predicaten
	public static <T> List<T> allMatches(List<T> candidates, Predicate<T> matchFunction) {

		List<T> results = new ArrayList<T>();

		for (T s : candidates) {
			// Funktion für Prüfung ob das Predicat erfüllt ist oder nicht
			if (matchFunction.test(s)) {
				results.add(s); // Fügt ein candidates in die Liste results ein
			}
		
		}

		return results;

		// Variante 2
//		return candidates.stream().filter(matchFunction).collect(Collectors.toList());

	}

	// Aufgabe 8
//	public static List<String> transformedList(List<String> list, Function<String, String> function){
//		
//		List<String> results = new ArrayList<String>();
//		
//		for (String s : list) {
//			// Funktion für Prüfung ob das Predicat erfüllt ist oder nicht
//			results.add(function.apply(s));
//		}
//		
//		return results;
//		
//		// Variante2
////		return candidates.steams().map(function).collect(Collectors.toList());
//		
//		
//	}

	// Aufgabe 9
	public static <T, R> List<R> transformedList(List<T> list, Function<T, R> function) {

		List<R> results = new ArrayList<R>();

		for (T s : list) {
			// Funktion für Prüfung ob das Predicat erfüllt ist oder nicht
			results.add(function.apply(s));
		}

		return results;

		// Variante2
//		return candidates.steams().map(function).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "C###", "Skala", "woman");
		// Erstellung des ListenArrays
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		// Aufruf der Methode
		List<Integer> bigNums = ElementUtils.allMatches(nums, n -> n > 500);
		List<Integer> wordLengths = ElementUtils.transformedList(words, String::length);
	}

}
