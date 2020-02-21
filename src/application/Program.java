package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite 1 para saudação ou outra tecla para sair: ");
		int n = sc.nextInt();
		if(n == 1) {
		System.out.println("Olá mundo!");
		} else {
		}
		
		sc.close();
	}

}
