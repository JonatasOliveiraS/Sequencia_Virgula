package com.br.sequencia.virgula;

import java.util.Scanner;

public class SequenciaVirgula {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número d sequência : ");
		int primeiroNumero = scanner.nextInt();
		System.out.println("Digite o último número da sequência : ");
		int ultimoNumero = scanner.nextInt();
		
		for(int i= primeiroNumero;i <= ultimoNumero; i++) {
			if (i == ultimoNumero) {
				System.out.println(i);
			} else {
				System.out.println(i + ",");
			}
		}
	}

}
