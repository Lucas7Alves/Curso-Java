package TrabalhandoComString;

public class MetodoSplit {

	public static void main(String[] args) {
		
		String nome = "Lucas Alves da Silva";
		
		String[] vetor = nome.split(" ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Nome: " + vetor[i]);
		}
		
		

	}

}
