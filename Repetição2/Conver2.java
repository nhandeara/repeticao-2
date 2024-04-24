package Repetição2;

import java.util.Scanner;

public class Conver2 {

 public static void main(String[] args) {
 Scanner ler= new Scanner(System.in);
 double numero,soma=0,media,i=0;
		
   while (i<=4) {
	i++;
	System.out.println ("informe um numero: ");
    numero=ler.nextDouble();
	soma = soma+numero;
	
     media=soma/4;
     System.out.println("a soma é:" + soma + "e a media é:" + media);
   }
     ler.close();
	}

}
