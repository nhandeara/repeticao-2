package Repetição2;
import java.util.Scanner;
public class At3 {

	public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	int impar= 0, par = 0, numero ;
	
	for(int i = 1; i<=10 ; i++) {
	System.out.println("informe o " + i + "° numero: ");
	numero = ler.nextInt();
	if (numero % 2==0)
	  par = par + 1 ; //par +=1
	else
		impar = impar +1; // impar +=1
	}
   System.out.println("qtde de par: "+par);
   System.out.println("qtde de impar: "+impar);
   ler.close();
}

	}

}
