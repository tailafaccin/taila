import java.util.Scanner;
public class tailamaisa2 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua nota e seu percentual de frequência: ");
		double nota = entrada.nextDouble();
		double frequencia = entrada.nextDouble();
		if ( nota >= 7 && frequencia >= 75 ) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		} 
	}
}