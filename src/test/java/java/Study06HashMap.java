package java;

import java.util.HashMap;
import java.util.Map;

public class Study06HashMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "Suzuki");
		map.put("Power", "220");
		map.put("Type", "2-wheeler");
		map.put("Price", "850000");
		System.out.println(map);
		map.remove("Name");
		System.out.println(map);
		
		
		System.out.println(map.containsValue("22"));
		System.out.println(map.containsKey("Type"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.isEmpty());
	}
}