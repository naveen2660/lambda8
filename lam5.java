package arithmeticop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lam5 {
	public static void main(String[] args) {
		StringBuilder myName = new StringBuilder();
        List<String> words = new ArrayList<>();
        words.add("Nice");
        words.add("America");
        words.add("Vampire");
        words.add("Excellent");
        words.add("Enjoy");
        words.add("Numbers");
        
        Consumer<List<String>> firstLetters = (start) -> start.forEach(x->myName.append(x.charAt(0)));
        firstLetters.accept(words);

        System.out.println(myName);
	}

}
