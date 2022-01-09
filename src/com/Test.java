package com;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		HashSet hasSet = new HashSet();
		
		hasSet.add("d");
		hasSet.add("c");
		hasSet.add("m");
		hasSet.add("p");
		hasSet.add(null);
		hasSet.add("A");
		hasSet.add("a");
		
		System.out.println(hasSet);
		
		System.out.println(hasSet.add("A"));
		

	}

}
