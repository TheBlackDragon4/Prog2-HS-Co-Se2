package sonstigeTests;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		String[] txt = { "This", "is", "a", "stream", "demo" };
		System.out.println(Arrays.stream(txt).filter(s -> s.length() > 3).sorted().collect(Collectors.toList()));

	}

}
