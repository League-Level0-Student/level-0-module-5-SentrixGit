public class ForloopGaunlet {
	public static void main(String[] args) {
		// Loop 1
		for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n"); // Make a new line for the next loop on the output

		// Loop 2
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		// Loop 3
		for (int i = 2; i < 101; i++) {
			if ((i % 2) == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n");

		// Loop 4
		for (int i = 1; i < 100; i++) {
			if ((i % 3) == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n");

		// Loop 5
		for (int i = 1; i < 501; i++) {
			if ((i % 2) == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}

		System.out.println("\n");

		// Loop 6
		for (int i = 0; i < 778; i++) {
			if ((i % 7 == 0)) {
				System.out.println(i);
			}
		}

		System.out.println("\n");

		// Loop 7
		int yearBorn = 2007;
		int currentYear = 2019;

		for (int i = yearBorn; i < currentYear; i++) {
			System.out.println("In " + i + " I was " + (i - yearBorn) + " years old.");
		}

		System.out.println("\n");

		// Loop 8
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}

		System.out.println("\n");

		// Loop 9
		for (int j = 1; j < 10; j += 3) {
			for (int i = 0; i < 3; i++) {
				System.out.print(j + i);
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		// Loop 10
		for (int j = 0; j < 100; j += 10) {
			for (int i = 1; i < 11; i++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		//Loop 11
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
