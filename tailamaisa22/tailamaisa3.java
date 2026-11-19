import java.util.Scanner;
public class tailamaisa3 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		double idade = entrada.nextDouble();
		if ( idade <= 12 ) {
			System.out.println("Atendimento infantil! ");
		} else if ( idade >= 13 && idade <= 59 ) {
			System.out.println("Atendimento adulto!");
		} else {
			System.out.println("Atendimento preferencial!");
		}
	}
}