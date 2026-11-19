import java.util.Scanner;
public class tailamaisa5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o código do produto e a quantidade: ");
		int codigo = entrada.nextInt();
		int quantidade = entrada.nextInt();
		double total = 0;
		switch (codigo) {
			case 1:
				System.out.println("Produto: boné, valor do produto: R$ 50,00");
				total = 50*quantidade;
			break;
			case 2:
				System.out.println("Produto: calça, valor do produto: R$ 80,00");
				total = 80*quantidade;
			break;
			case 3:
				System.out.println("Produto: tênis, valor do produto: R$ 150,00");
				total = 150*quantidade;
			break;
			default:
				System.out.println("Produto não encontrado");
		}
		System.out.println("Valor final da compra:" + total);
	}
}