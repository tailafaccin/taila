import java.util.Scanner;
public class tailamaisa4 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota final de um aluno e a sua frequência: ");
		double nota = entrada.nextDouble();
		double frequencia = entrada.nextDouble();
		if ( nota >= 6 && frequencia >= 75) {
			if ( nota >= 9 && frequencia >= 90 ){
				System.out.println("Aluno destacado!");
			} else {
				System.out.println("Aluno aprovado!");
			}
		} else {
			if ( frequencia >= 75 ){
				System.out.println("Aluno em reavaliação!");
			} else { 
				System.out.println("Aluno reprovado por frequência!");
			}
		}
		System.out.println("Nota: " + nota + ", frequência: " + frequencia );
	}
}