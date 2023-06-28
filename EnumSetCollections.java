package javaBasic;

import java.util.EnumSet;

public class EnumSetCollections {
enum Size{
	SMALL,MEDIUM,LARGE;
}
public static void main(String[] args) {
	EnumSet<Size> sizes = EnumSet.allOf(Size.class);
	System.out.println("EnumSet : "+sizes);
	EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
	System.out.println("Empty EnumSet : "+sizes1);
}
}
