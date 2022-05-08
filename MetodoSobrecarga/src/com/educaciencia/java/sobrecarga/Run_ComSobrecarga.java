package com.educaciencia.java.sobrecarga;

/**
 * EducaCiência FastCode
 * Cenário: 
 * - Realizar Soma,Subtração,Divisão e multiplicação entre dois atributos, 
 * - Realizar Soma,Subtração,Divisão e multiplicação entre três atributos, 
 * - Realizar Soma,Subtração,Divisão e multiplicação entre quatro atributos,
 * - Realizar Soma,Subtração,Divisão e multiplicação entre cinco atributos.
 * 
 * Nós utilizaremos de Método de Sobrecarga.
 * 
 */

public class Run_ComSobrecarga {

	public static void main(String[] args) {

		int n1 = 100;
		int n2 = 20;
		int n3 = 2;
		int n4 = 1;
		int n5 = 2;
		calculo(n1, n2);
		calculo(n1, n2, n3);
		calculo(n1, n2, n3, n4);
		calculo(n1, n2, n3, n4, n5);
	}
	
	/** Nesse metodo, iremos realizar calculos aritimeticos de dois atributos que receberemos externamente*/
	public static void calculo(int n1, int n2) {
		
		int soma = n1 + n2;
		int subtracao = n1 - n2;
		int divisao = n1 / n2;
		int multiplicacao = n1 * n2;
		System.out.println("*********** Dois atributos de Entrada ***********");
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A subtração dos numeros é: " + subtracao);
		System.out.println("A divisao dos numeros é: " + divisao);
		System.out.println("A multiplicacao dos numeros é: " + multiplicacao);
		System.out.println("*************************************************");
	}
	
	/** Nesse metodo, iremos realizar calculos aritimeticos de tres atributos que receberemos externamente*/
	public static void calculo(int n1, int n2, int n3) {
		
		int soma = n1 + n2 + n3;
		int subtracao = n1 - n2 - n3;
		int divisao = n1 / n2 / n3;
		int multiplicacao = n1 * n2 * n3;
		System.out.println("*********** Tres atributos de Entrada ***********");
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A subtração dos numeros é: " + subtracao);
		System.out.println("A divisao dos numeros é: " + divisao);
		System.out.println("A multiplicacao dos numeros é: " + multiplicacao);
		System.out.println("*************************************************");
	}

	/** Nesse metodo, iremos realizar calculos aritimeticos de quatro atributos que receberemos externamente*/
	public static void calculo(int n1, int n2, int n3, int n4) {
		
		int soma = n1 + n2 + n3 + n4;
		int subtracao = n1 - n2 - n3 - n4;
		int divisao = n1 / n2 / n3 / n4;
		int multiplicacao = n1 * n2 * n3 * n4;
		System.out.println("*********** Quatro atributos de Entrada ***********");
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A subtração dos numeros é: " + subtracao);
		System.out.println("A divisao dos numeros é: " + divisao);
		System.out.println("A multiplicacao dos numeros é: " + multiplicacao);
		System.out.println("*************************************************");
	}

	/** Nesse metodo, iremos realizar calculos aritimeticos de cinco atributos que receberemos externamente*/
	public static void calculo(int n1, int n2, int n3, int n4, int n5) {
		
		int soma = n1 + n2 + n3 + n4 + n5;
		int subtracao = n1 - n2 - n3 - n4 - n5;
		int divisao = n1 / n2 / n3 / n4 / n5;
		int multiplicacao = n1 * n2 * n3 * n4 * n5;
		System.out.println("*********** Cinco atributos de Entrada ***********");
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A subtração dos numeros é: " + subtracao);
		System.out.println("A divisao dos numeros é: " + divisao);
		System.out.println("A multiplicacao dos numeros é: " + multiplicacao);
		System.out.println("*************************************************");
	}

}















