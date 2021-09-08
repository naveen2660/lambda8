package arithmeticop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class lam3 {

	public static void main(String[] args) {
		Consumer<List<String>> printConsumer = t -> System.out.println(t);
	    List<String> list = Arrays.asList("Sydney", "Dhaka", "New York", "London");
	    printConsumer.accept(list);
	    
	    Supplier<Double> doubleSupplier1 = () -> Math.random();
	    DoubleSupplier doubleSupplier2 = Math::random;

	    System.out.println(doubleSupplier1.get());
	    System.out.println(doubleSupplier2.getAsDouble());
	    
	    List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
	    Predicate<String> nameStartsWithS = str -> str.startsWith("S");
	    names.stream().filter(nameStartsWithS).forEach(System.out::println);
	    
	    Function<String, Integer> nameMappingFunction = String::length;
	    List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
	    System.out.println(nameLength);

	}

}
