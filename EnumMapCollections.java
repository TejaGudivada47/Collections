package Map;

import java.util.EnumMap;

public class EnumMapCollections {
	enum Size{
		SMALL,MEDIUM,LARGE,EXTRALARGE;
	}
public static void main(String[] args) {
	EnumMap<Size,Integer> size1 = new EnumMap(Size.class);
	size1.put(Size.SMALL, 28);
	size1.put(Size.MEDIUM, 15);
	size1.put(Size.LARGE,10);
	size1.put(Size.EXTRALARGE,2);
	System.out.println("map : "+size1);
	System.out.println("keyset : "+size1.keySet());
	System.out.println("Enteries : "+size1.entrySet());
	System.out.println("values :"+size1.values());
}
}
