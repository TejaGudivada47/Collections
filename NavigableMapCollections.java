package javaBasic;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapCollections {
public static void main(String[] args) {
	NavigableMap<String,Integer> numbers = new TreeMap();
	numbers.put("one",1);
	numbers.put("Two",2);
	numbers.put("three",3);
	System.out.println("navigableMap : "+numbers);
	System.out.println("first key : "+numbers.firstKey());
	System.out.println("last key : "+numbers.lastKey());
	System.out.println("removed first entry : "+numbers.pollFirstEntry());
	System.out.println("removed last entry : "+numbers.pollLastEntry());   
}
}
