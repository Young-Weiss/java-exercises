import java.util.Scanner;

public class Exercicios {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		exercicio10();
		
	}
	
	public static void exercicio1() {

	}
	
	public static void exercicio7() {
		
		int[] n = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o n�mero " + (i + 1) + ": ");
			n[i] = scan.nextInt();
		}
		
		int cal = 2 * n[0] + 2 - 1 + (n[1] + n[2]) * 4 / n[3];

		System.out.println("O resultado do calculo foi: " + cal);
	}
	
	public static void exercicio8() {
		
		System.out.println("Digite o valor em bytes: ");
		int valorByte = scan.nextInt();
		
		System.out.println("O valor em  bits �:" + valorByte * 1024);
		System.out.println("O valor em  kilobytes �:" + valorByte / 1024);
		System.out.println("O valor em  megabytes �:" + (valorByte / 1024) / 1024);
		System.out.println("O valor em  gigabyes �:" + ((valorByte / 1024) / 1024) / 1024);
		System.out.println("O valor em  terabytes �:" + (((valorByte / 1024) / 1024) / 1024)/ 1024);
		System.out.println("O valor em  petabytes �:" + ((((valorByte / 1024) / 1024) / 1024)/ 1024)/1024);
		
	}
	
	public static void exercicio9() {
		
		System.out.println("Escreva uma quantidade de horas: ");
		int hora = scan.nextInt();
		
		System.out.println("Em semanas: " + ((hora / 24) / 7));
		System.out.println("Em dias: " + (hora / 24));
		System.out.println("Em minutos:" + (hora * 60));
		System.out.println("Em segundos: " + (hora * 60 * 60));
		System.out.println("Em milissegundos: " + (hora * 60 * 60 * 1000));
	}
	
	public static void exercicio10() {
		System.out.println("Digite seu peso em quilos: ");
		double peso = scan.nextDouble();
		
		System.out.println("Seu peso em gramas: " + peso * 1000);
		System.out.println("Seu peso em gramas caso engorde 5%: " + ((peso * 1000) + (peso * 1000) * 0.05) );
		
	}
	
	public static void exercicio11() {
		
		System.out.println("Qual o sal�rio min�mo: ");
		double salarioMinimo = scan.nextDouble();
		
		System.out.println("Quantidade de quilowatts na resid�ncia: ");
		double quilowattsResidencia = scan.nextDouble();
		
		double valorQuilowatts = salarioMinimo / 5; 
		double valorResidencia = valorQuilowatts * quilowattsResidencia;
		
		System.out.println("O valor do quilowatt: " + valorQuilowatts);
		System.out.println("O valor a ser pago pela resid�ncia: " + valorResidencia);
		System.out.println("O valor a ser pago pela resid�ncia com 15% de desconto: " + (valorResidencia - (valorResidencia * 0.15)));
	}
}
