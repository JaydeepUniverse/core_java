package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
	PriorityQueue<String> q1 = new PriorityQueue<String>();
	q1.add("aaa");
	q1.add("ccc");
	q1.add("bbb");
	q1.add("KKK");
	q1.add("CCC");
	Iterator<String> i1 = q1.iterator();
	while(i1.hasNext())
	    System.out.println(i1.next());
	System.out.println("After Remove Method");
	q1.remove(); // Remove method remove first element and do sorting also
	Iterator<String> i2 = q1.iterator();
	while(i2.hasNext())
	    System.out.println(i2.next());
	System.out.println("After Poll Method");
	q1.poll(); // Poll method remove first element but don't do sorting and maintain insertion order
	Iterator<String> i3 = q1.iterator();
	while(i3.hasNext())
	    System.out.println(i3.next());
	PriorityQueue<String> q2 = new PriorityQueue<String>();
	q2.poll();
	System.out.println(q2); // poll method return null value
	//q2.remove();
	//System.out.println(q2); // remove method does not return, so throw exception
	System.out.println("After Element Method");
	System.out.println(q1.element());
	//System.out.println(q2.element()); // throw exception if null list same as remove
	System.out.println("After Peek Method");
	System.out.println(q1.peek());
	System.out.println(q2.peek()); // does not throw exception, return null
	q1.offer("a");
	System.out.println(q1);
	q1.add("b");
	System.out.println(q1);
    }
}
