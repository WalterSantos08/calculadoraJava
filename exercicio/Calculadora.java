/* Escreva um programa que ofereça ao usuário um menu com as opções de soma, subtração, 
 * multiplicação e divisão.
 *  Depois de escolher, o programa deve pedir dois números
 *  e mostrar o resultado da operação.*/

package exercicio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		double a = scanner.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double b = scanner.nextDouble();
		
		System.out.println("Digite a operação (+, -, *, /)");
		String operacao = scanner.next();
		
		if (operacao.equals("+") ) {
			System.out.println("adição: " +  (a + b));	
		}
		else if (operacao.equals("-" )) {
			System.out.println("subtração: " + (a - b));
		}
		else if (operacao.equals("*")) {
			System.out.println("multiplicação: " + (a * b) );
		}
		else if (operacao.equals("/")) {
			if (b != 0) {
			System.out.println("divisão: " + (a / b));
		}else {
			System.out.println("operação invalida.");
		}
		
		
		scanner.close();
		
		}
	}

}
