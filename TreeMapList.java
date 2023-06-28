package Map;

import java.util.Map;
import java.util.TreeMap;
public class TreeMapList {
public static void main(String[] args) {
	Map<String,Integer> numbers = new TreeMap<>();
	numbers.put("one",1);
	numbers.put("two",2);
	System.out.println("List : "+numbers);
	numbers.replace("three",1);
	numbers.replace("four", 2);
	System.out.println("updated List : "+numbers);
	int removed = numbers.remove("two");
	System.out.println("removed : "+removed);
}
}
