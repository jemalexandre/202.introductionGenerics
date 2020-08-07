package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("how many values? ");
		int N = sc.nextInt();

		PrintService<String> ps = new PrintService<>();

		for (int i = 0; i < N; i++) {
			ps.addValue(sc.next());
		}

		ps.print();
		
		System.out.println();
		System.out.println("First: " + ps.first());

		sc.close();

	}
}
