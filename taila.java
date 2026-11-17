import java.util.Scanner;
public class gurt {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Escreva um número: ");
	int num = scanner.nextInt();
	int ant = num-1;
	int suc = num+1;
	System.out.println("Antecessor: " + ant + ", Sucessor: " + suc);
 }
}