package Repetição2;import java.util.Scanner;

public

 class Ex2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		while (numero % 2!=0) {
		System.out.println("o numero digitado nao é par.Digite novamente: ");
		numero=ler.nextInt();
		}
		System.out.println("o numero " + numero + " é par!");
		ler.close();

	}

}
