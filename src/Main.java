import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final ArrayList<String> day = new ArrayList<String>(Arrays.asList("Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday", "Sunday"));
		ArrayList<Double> temp = new ArrayList<Double>();
		boolean valid = false;
		
		for (int i = 0; i < 7; i++) {
			System.out.printf("Enter the temperature for %-9s: ", day.get(i));
			temp.add(scnr.nextDouble());
		}
		
		System.out.print("\nEnter a day of the week, \"week\", or 'q' (case matters!): ");
		String choice = scnr.next();
		
		while (!choice.equals("q")) {
			
			for (int i = 0; i < 7; i++)
				if (choice.equals(day.get(i))) {
					System.out.println(day.get(i) + ": " + temp.get(i) + "°");
					valid = true;
				}
			
			if (choice.equals("week")) {
				valid = true;
				double total = 0;
				System.out.println("\n---WEEKLY WEATHER REPORT---");
				for (int i = 0; i < 7; i++) {
					System.out.printf("%-9S: ", day.get(i));
					System.out.println(temp.get(i) + "°");
					total += temp.get(i);
				}
				System.out.println("The average weekly temperature is: " + (total/7) + "°");
			}
			
			if (!valid)
				System.out.println("Invalid choice. Please enter again.");
				
			System.out.print("\nEnter a day of the week, \"week\", or 'q' (case matters!): ");
			choice = scnr.next();
		}
			
		System.out.print("Goodbye. ♥");
		scnr.close();
	}
}