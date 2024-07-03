package aula69Ex3;

import java.util.Scanner;

public class AppAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alunos alunos = new Alunos();
		
		System.out.println("Informe o nome do aluno(a): ");
		alunos.nome = sc.nextLine();
		
		System.out.println("Informe a 1º nota do aluno(a): ");
		alunos.notaPrimeiroTrimestre = sc.nextFloat();
		
		System.out.println("Informe a 2º nota do aluno(a): ");
		alunos.notaSegundoTrimestre = sc.nextFloat();

		System.out.println("Informe a 3º nota do aluno(a): ");
		alunos.notaTerceiroTrimestre = sc.nextFloat();
		
		alunos.calcularNotaFinal();
		
		if (alunos.aprovarAluno()) {
			System.out.printf("Nota final: %.2f\n", alunos.notaFinal);
			System.out.println("Aprovado.");
		} else {
			System.out.printf("Nota final: %.2f\n", alunos.notaFinal);
			System.out.println("Reprovado.");
			System.out.printf("Faltou %.2f",  alunos.calculaNotaFaltante(alunos.notaFinal) , "Pontos");
		}
		
		
		

	}

}
