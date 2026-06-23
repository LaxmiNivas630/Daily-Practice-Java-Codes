package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo2 {

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<>();

		m.put("Ap", "Andhrapradesh");
		m.put("TG", "Hyderabad");
		m.put("TG", "Telangana");

		m.put("KA", "Bengaluru");
		m.put("KA", "Karnataka");

		m.put("TN", "Madras");
		m.put("TN", "TamilNaidu");

		m.put("KL", "Thiruvananthapuram");

		System.out.println(m);
		System.out.println(m.containsKey("TN"));
		System.out.println(m.containsValue("Bengaluru"));
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.get("TN"));

		Set<Entry<String, String>> entries = m.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
