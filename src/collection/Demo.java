package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	Set<Integer> s1 = new HashSet<Integer>();
	a1.add(2);
	a1.add(4);
	a1.add(1);
	a1.add(8);
	a1.add(10);
	a1.add(22);
	a1.add(2);
	a2.add(2);
	a2.add(6);
	a2.add(1);
	a2.sort(null);
	a1.addAll(a2);
	s1.add(3);
	s1.add(4);
	s1.add(7);
	s1.add(2);
	s1.add(2);
	Iterator<Integer> iter1 = a1.iterator();
	while(iter1.hasNext()) {
	    System.out.println(iter1.next());
	}
	System.out.println();
	Iterator<Integer> iter2 = a2.iterator();
	while(iter2.hasNext()) {
	    System.out.println(iter2.next());
	}
	System.out.println();
	Iterator<Integer> iter3 = s1.iterator();
	while(iter3.hasNext()) {
	    System.out.println(iter3.next());
	}
    }
}
