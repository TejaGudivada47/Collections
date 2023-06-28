package javabasic;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityList {
public static void main(String[] args) {
	Queue<Integer> num = new PriorityQueue();
	num.offer(45);
	num.offer(67);
	num.offer(23);
	System.out.println("list is : "+num);
	int accessedNumber = num.peek();
	System.out.println("accessedNumber : "+accessedNumber);
	int removedNumber = num.poll();
	int rn1= num.poll();
	int update = num.
	System.out.println("removedNumber : "+removedNumber );
	System.out.println("removedNumber : "+rn1);
	System.out.println("updated Queue is : "+num);
}
}
