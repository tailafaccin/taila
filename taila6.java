import java.util.Scanner;
public class taila6 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite seu nome de usuário, idade e se a conta está ativa (verdadeiro/falso): ");
	String nome = scanner.nextLine();
	int idade = scanner.nextInt();
	boolean ativo = scanner.nextBoolean();
	System.out.println("Usuário: " + nome + ", idade" + idade + ", sua conta está ativa: " + ativo );
 }
}