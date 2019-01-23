import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		// Input
		String Input = JOptionPane.showInputDialog("Enter number... ");

		int fakeInt = Integer.parseInt(Input);

		for (int i = 2; i < fakeInt; i++) {
			if (fakeInt % i == 0) {
				System.out.println(fakeInt + " is not a prime number");
				System.exit(0);
			}
		}
		System.out.println(fakeInt + " is a prime number");
		System.exit(0);
	}
}
