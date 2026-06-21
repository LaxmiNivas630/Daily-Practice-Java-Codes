package com.collections;

//Queue : FIFO : Fisrt IN First Out
import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDem01 {

	public static void main(String[] args) {
		System.out.println("Main method Started !");

		Queue<Integer> q = new LinkedList<>();
		q.add(15);//IllegalStateException - if the element cannot at this time due to capacity restriction 
		q.add(10);
		q.add(12);
		q.add(11);
		q.add(14);

		System.out.println(q.remove());//NoSuchElementException
		System.out.println(q.element());//NoSuchElementException

		System.out.println(q);

		System.out.println("**************************");
		Queue<Integer> q1 = new LinkedList<>();
		q1.offer(18);//  True if the element was added to this queue,else false
		q1.offer(16);
		q1.offer(19);
		q1.offer(20);
		q1.offer(17);
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		System.out.println(q1);

	}

}
