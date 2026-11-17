import java.util.Scanner;
public class taila2 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Escreva dois números: ");
	float num1 = scanner.nextFloat();
	float num2= scanner.nextFloat();
	float soma = num1+num2;
	float sub = num1-num2;
	float div = num1/num2;
	float mult = num1*num2;
	System.out.println("Soma: " + soma + ", Subtração: " + sub + ", Divisão: " + div + ", Multiplicação: " + mult );
 }
}