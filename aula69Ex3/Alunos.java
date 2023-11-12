package aula69Ex3;

public class Alunos {
	String nome;
	float notaPrimeiroTrimestre;
	float notaSegundoTrimestre;
	float notaTerceiroTrimestre;
	float notaFinal;
	
	public void calcularNotaFinal() {
		this.notaFinal = notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
	}
	
	public boolean aprovarAluno() {
		if (this.notaFinal < 60) {
			return false;
		} else {
			return true;
		}
	}
	
	public float calculaNotaFaltante(float notaFinal) {
		if (!aprovarAluno()) {			
			return 60 - notaFinal;
		} else {
			return 0;
		}
	}
}
