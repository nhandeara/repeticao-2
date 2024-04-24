package Repetição2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
	Scanner ler= new Scanner(System.in);
    int nf, i=0;
    
    System.out.println("informe o o numero final"); 
    nf =ler.nextInt();
   
        while(i<=5) {
        i++;
        if (i%2 != 0) {
        	System.out.println(i + " È impar ");
        }
        else {
        	
        }
		    ler.close();
	}   
   }
    
}
