package kitamurahikaru;

public class Print100 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		for (int i = 2; i <= 100; i = i + 2) {
			System.out.println(i);
		}
		
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
