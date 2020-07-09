package ProjExercicio2Lista6;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AlunoAcademia Aluno = new AlunoAcademia();
		
		System.out.println("Digite seu nome: ");
		Aluno.setNomeCompleto(scan.next());
		
		System.out.println("Digite sua altura: ");
		Aluno.setAltura(scan.nextInt());
		
		System.out.println("Digite seu gênero: [1] para masculino [2] para feminino");
		Aluno.setGenero(scan.nextInt());
		
		System.out.println("O peso ideal do(a) " + Aluno.getNomeCompleto() + " é " + Aluno.obterPesoIdeal());
		
	}
}
