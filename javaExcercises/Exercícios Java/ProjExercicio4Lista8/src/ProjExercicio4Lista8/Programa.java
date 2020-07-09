package ProjExercicio4Lista8;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		Aluno aluno = new Aluno();
		AcademiaUtil academiaUtil = new AcademiaUtil();
		
		System.out.println("Informe o nome completo:");
		aluno.setNomeCompleto(teclado.leString());
		
		System.out.println("Informe a altura: ( em cent�metros )");
		aluno.setAltura(teclado.leInt());
		
		System.out.println("Informe o gen�ro: ( 1 para masculino e 2 para feminino )");
		aluno.setGenero(teclado.leInt());
		
		System.out.println("O peso ideal do aluno " + aluno.getNomeCompleto() + " �: " + academiaUtil.obterPesoIdeal(aluno));
		
	}
}
