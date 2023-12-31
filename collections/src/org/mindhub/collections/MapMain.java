package org.mindhub.collections;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("kye", "value");
		map.put("key2", "value2");
		map.put("key3", "value2");
		
		System.out.println(map.containsKey("key"));
		System.out.println(map.containsValue("value"));
		
		Set<String> keySet = map.keySet();
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.print(entry.getKey() + ":");
			System.out.println(entry.getValue());
		}
		
		map.remove("key2");
		map.put("key3", "value3");
		Collection<String> allValiesInTheMap = map.values();
		
		
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
	}
}
