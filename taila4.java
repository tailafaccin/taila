import java.util.Scanner;
public class taila4 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite uma medida em metros: ");
	float metros = scanner.nextFloat();
	float convert = metros*100;
	System.out.println("Conversão das medidas: " + convert );
 }
}