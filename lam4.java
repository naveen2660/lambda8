package arithmeticop;

import java.util.ArrayList;
import java.util.List;

public class lam4 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

        list1.add("hello");
        list1.add("hello world");
        list1.add("hello guys");
        list1.add("hello fellows");
        list1.add("hello team");
        list1.add("hello people");
        list1.add("hello students");
        list1.removeIf(s->s.length()%2!=0);
        for(int i=0;i<list1.size();i++) {
        	System.out.println(list1.get(i));
        }
	}

}
