package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ol� mundo! Ol� pra voc�!");
		System.out.printf("Entre com um n�mero: ");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("Ol� novamente! Rs");
		} else {
			for (int i = 2; i <= n; i++) {
				System.out.println("Ol� " + i + " vezes");
			}
		}
		sc.close();
	}

}
