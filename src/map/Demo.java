package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
    public static void main(String[] args) {
	Map<Integer, String> m = new HashMap<Integer, String>();
	m.put(1, "aaa");
	m.put(2, "bbb");
	m.put(3, "a");
	for(Entry<Integer, String> i:m.entrySet()) {
	    System.out.println(i.getKey() + "---" + i.getValue());
	}
    }
}
