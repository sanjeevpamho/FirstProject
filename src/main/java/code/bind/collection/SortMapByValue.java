package code.bind.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Maths", 98);hm.put("DS", 85);hm.put("DB", 91);hm.put("Java", 95);hm.put("OS", 79);hm.put("NS", 80);
		
		Map<String,Integer> map=sortByValue(hm);
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
	    List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, (e1,e2)-> e1.getValue().compareTo(e2.getValue()));
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry : list) {
			lhm.put(entry.getKey(), entry.getValue());
		}
		return lhm;
	}

}
