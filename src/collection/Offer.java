package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Offer {
    public static void main(String[] args) {
	PriorityQueue<String> q1 = new PriorityQueue<String>();
	q1.add("ccc");
	q1.add("bbb");
	q1.add("aaa");
	q1.add("KKK");
	q1.add("CCC");
	q1.add("ZZZ");
	System.out.println(q1);
	Iterator<String> i1 = q1.iterator();
	while(i1.hasNext())
	    System.out.println(i1.next());
    }
}
