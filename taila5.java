import java.util.Scanner;
public class taila5 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite sua idade em anos: ");
	float anos = scanner.nextFloat();
	float idade = anos*365;
	System.out.println("Sua idade em dias é: " + idade );
 }
}