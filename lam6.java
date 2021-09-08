package arithmeticop;

import java.util.ArrayList;
import java.util.List;

public class lam6 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("word1");
		words.add("word2");
		words.add("words3");
		words.add("words4");
		words.add("words5");

		words.replaceAll(word->word.toUpperCase());
		
        for(int i=0;i<words.size();i++) {
        	System.out.println(words.get(i));
        }

	}

}
