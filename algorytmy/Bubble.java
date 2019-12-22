import java.util.Random;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tablica[];
		tablica = new int[5];

		Random r = new Random();
		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = r.nextInt() % 90 + 10;
		}

		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + ", ");
		}

		for (int j = 0; j < tablica.length - 1; j++) {
			for (int i = 0; i < tablica.length - 1 -j; i++) {
				if (tablica[i] > tablica[i + 1]) {
					int rob = tablica[i];
					tablica[i] = tablica[i + 1];
					tablica[i + 1] = rob;
				}
			}
		}

		System.out.println("_____");
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + ", ");
		}

	}

}
