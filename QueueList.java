package javabasic;

import java.util.Queue;
import java.util.LinkedList;
public class QueueList {
public static void main(String[] args) {
	Queue<Integer> num = new  LinkedList();
	num.offer(1);
	num.offer(2);
	num.offer(3);
	System.out.println("List is : "+num);
	int accessedNumber = num.peek();
	System.out.println("accessedNumber : "+accessedNumber);
	int removedNumber = num.poll();
	System.out.println("removedNumber : "+removedNumber);
	System.out.println("updated queue : "+num);
}
}
