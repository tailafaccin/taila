import java.util.Scanner;
public class tailamaisa6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int turno;
		int disciplina;
		System.out.println("Digite um valor inteiro para selecionar um turno: ");
		turno = entrada.nextInt();
		System.out.println("Digite um valor inteiro para selecionar uma disciplina: ");
		disciplina = entrada.nextInt();
		switch(turno) {
			case 1:
				switch(disciplina) {
					case 1:
						System.out.println("Matemática");
					break;
					case 2:
						System.out.println("Português");
					break;
					default:
						System.out.println("Disciplina não disponível no período da manhã.");
				}
				break;
			case 2:
				switch(disciplina) {
					case 1:
						System.out.println("História");
					break;
					default:
						System.out.println("Disciplina não disponível no período da tarde.");
				}
			break;
			default:
				System.out.println("Turno inválido");
		}
	}
}