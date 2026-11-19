import java.util.Scanner;
public class tailamaisa {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		if ( idade <= 12 || idade >= 65 ) {
			System.out.println("Entrada gratuita!");
		} 
	}
}

