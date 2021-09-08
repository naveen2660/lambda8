package arithmeticop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


class PrintList implements Runnable{
	
	List<Integer> list;
	PrintList(List<Integer> list){
		this.list = list;
	}

	@Override
	public void run() {
		Consumer<List<Integer>> printNumbers = (nums)->nums.forEach(System.out::println);
		printNumbers.accept(list);
	}
	
}

public class lam8 {

	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		numsList.add(100);
		numsList.add(90);
		numsList.add(10);
		numsList.add(40);
		numsList.add(30);
        
        PrintList printTask = new PrintList(numsList);
        Thread thread = new Thread(printTask); 
        thread.start();
	}

}
