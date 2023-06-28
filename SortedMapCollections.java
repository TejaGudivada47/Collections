package javaBasic;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapCollections {
public static void main(String[] args) {
	SortedMap<String,Integer> numbers = new TreeMap();
	numbers.put("one", 1);
	numbers.put("two",2);
	numbers.put("Three", 3);
	System.out.println("SortedMap : "+numbers);
	System.out.println("first key : "+numbers.firstKey());
	System.out.println("last key : "+numbers.lastKey());
	int removed = numbers.remove("one");
	System.out.println("removed : "+removed);
}
}
