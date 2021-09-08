package arithmeticop;

import java.util.HashMap;
import java.util.Map;

public class lam7 {

	public static void main(String[] args) {
		HashMap<String,String > hmp = new HashMap<>();

		hmp.put("key1","value1");
		hmp.put("key2","value2");
		hmp.put("key3","value3");
		hmp.put("key4","value4");

        StringBuilder str = new StringBuilder();

        for(Map.Entry<String, String> entry:hmp.entrySet()) {
        	str.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(str);

	}

}
