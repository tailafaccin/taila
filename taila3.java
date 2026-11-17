import java.util.Scanner;
public class taila3 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite três notas: ");
	float n1 = scanner.nextFloat();
	float n2 = scanner.nextFloat();
	float n3 = scanner.nextFloat();
	float media = (n1+n2+n3)/3;
	System.out.println("Média das notas: " + media );
 }
}