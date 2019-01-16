
public class Fibo {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		for (int i = 1; i < 12; i++) {
			System.out.println(b);
			int temp = a;
			a = b;
			b = b + temp;
		}
	}
}