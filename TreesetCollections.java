package javaBasic;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetCollections {
public static void main(String[] args) {
	Set<Integer> numbers = new TreeSet();
	numbers.add(2);
	numbers.add(1);
	numbers.add(3);
	System.out.println("Set : "+numbers);
	Iterator<Integer> iterate = numbers.iterator();
	while(iterate.hasNext()) {
		System.out.print(iterate.next());
		System.out.print(",");
	}
}
}
