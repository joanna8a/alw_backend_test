import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilters {
	public void example1() {
		// Stream from Array, sort, filter and print
		System.out.println("Example 1: ");
		System.out.println("Stream from Array, sort, filter and print");
		String[] names = { "Abraham", "Anne", "Brent", "Brent", "Bort", "elvira", "Hans", "David", "Sarah", "Felicia" };
		System.out.println(
				"Select elements that start with S from list [Abraham, Anne, Brent, Brent, Bort, elvira, Hans, David, Sarah, Felicia]");
		Arrays.stream(names) // same as Stream.of(names)
				.filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);
	}

	public void example2() {
		// Stream.of, sorted and findFirst
		System.out.println("Example 2: ");
		System.out.println("Stream.of, sorted and findFirst");
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

	}

	public void example3() {
		// Stream from List, filter and print
		System.out.println("Example 3: ");
		System.out.println("Stream from List, filter and print");
		List<String> people = Arrays.asList("Abraham", "Anne", "Brent", "Brent", "Bort", "elvira", "Hans", "David",
				"Sarah", "Felicia");
		System.out.println("Select elements that end with a from list "
				+ "[Abraham, Anne, Brent, Brent, Bort, elvira, Hans, David, Sarah, Felicia]");
		people.stream().map(String::toLowerCase).filter(x -> x.endsWith("a")).forEach(System.out::println);

	}

	public void example4() {
		// Stream rows from text file, sort, filter, and print
		System.out.println("Example 4: ");
		System.out.println("Stream rows from text file, sort, filter, and print");
		Stream<String> bands;
		try {
			bands = Files.lines(Paths.get("rock_bands.txt"));
			bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
			bands.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void example5() {
		// Stream rows from text file and save to List
		System.out.println("Example 5: ");
		System.out.println("Stream rows from text file and save to List");
		List<String> bands2;
		try {
			bands2 = Files.lines(Paths.get("rock_bands.txt")).filter(x -> x.contains("el"))
					.collect(Collectors.toList());
			bands2.forEach(x -> System.out.println(x));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
