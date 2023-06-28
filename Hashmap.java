package Map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
public static void main(String[] args) {
	Map<String,Integer> num = new HashMap();
	num.put("one", 1);
	num.put("two", 2);
	System.out.println("lists : "+num);
	System.out.println("keys : "+num.keySet());
	System.out.println("values : "+num.values());
	System.out.println("Entries : "+num.entrySet());
	int removed = num.remove("two");
	System.out.println("Removed : "+removed);
}
}
