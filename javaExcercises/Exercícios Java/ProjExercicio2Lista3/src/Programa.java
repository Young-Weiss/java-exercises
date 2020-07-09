import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		AvaliacaoImc Aluno = new AvaliacaoImc();
		
		System.out.println("Qual o seu nome? ");
		Aluno.setNomePessoa(scan.next());
		
		System.out.println("Quanto você pesa? ");
		Aluno.setPeso(scan.nextDouble());
		
		System.out.println("Qual sua altura? ");
		Aluno.setAltura(scan.nextDouble());
		
		System.out.println(Aluno.getNomePessoa() + " tem o IMC de " + formatador.format(Aluno.getIMC()));
		
	}
}
	