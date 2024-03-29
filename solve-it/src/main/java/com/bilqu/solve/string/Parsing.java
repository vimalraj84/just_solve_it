package com.bilqu.solve.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Parsing {

	public static void main(String[] args) {
		String input = "Alexa";
		List<Integer> out = new ArrayList<Integer>();
		input.toUpperCase().chars().sorted().forEach(i ->  {
			if(!out.contains(i)) 
			{ 
				out.add(i);
			}else {
				out.remove(i);
			}
			System.out.println(out);
		});
		Stream.of(out).forEach(i -> System.out.println(i));
		System.out.println((char)out.get(0).intValue());
		
	}
}
