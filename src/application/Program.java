package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá mundo! Olá pra você!");
		System.out.printf("Entre com um número: ");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("Olá novamente! Rs");
		} else {
			for (int i = 2; i <= n; i++) {
				System.out.println("Olá " + i + " vezes");
			}
		}
		sc.close();
	}

}
