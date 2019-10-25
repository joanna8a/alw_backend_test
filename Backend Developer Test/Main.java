
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		char quit = 'n';
		String input;
		int choice = 0;

		Scanner in = new Scanner(System.in);
		while (quit != 'y') {
			System.out.println("Choose from these choices");
			System.out.println("-------------------------\n");
			System.out.println("1 - Streams filtering examples");
			System.out.println("2 - Function that counts distinct case-insensitive alphabetic\r\n"
					+ "characters and numeric digits occurring more than once in an input string.");
			System.out.println("3 - Concessionaire SQL sentences");
			System.out.println("4 - API REST for accessing the resources in the Concessionaire database");
			System.out.println("5 - Quit");
			choice = in.nextInt();

			switch (choice) {
			case 1:
				StreamFilters sf = new StreamFilters();
				sf.example1();
				sf.example2();
				sf.example3();
				sf.example4();
				sf.example5();

				break;
			case 2:

				CountRepeatedChars countRepeated = new CountRepeatedChars();
				Scanner inputScannerPt2 = new Scanner(System.in);
				System.out.println("Input the character to process: ");
				String inputString = inputScannerPt2.next();
				System.out.println("Result: ");
				System.out.println(countRepeated.reducedAnswer(inputString));

				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
			System.out.println("Would you like to quit? (y/n): ");
			input = in.next().toLowerCase();
			quit = input.charAt(0);
		}
		if (quit == 'y') {
			in.close();
		}

	}
}