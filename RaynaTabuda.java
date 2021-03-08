/*Rayná Araújo Reveles - Matrícula: 0050013521*/

import java.util.Scanner;
public class RaynaTabuada {
   
    public static void main (String[] args){

    Scanner ler = new Scanner(System.in);
    int n;
           System.out.printf("Olá Rayná, entre com o numero: ");
           n = ler.nextInt(); 

            System.out.printf("Tabuada de somar do %d\n", n);
			        for (int i=0; i<=10; i++){
              System.out.printf("%d + %d = %d\n", n, i, (n+i));

		        	}
		    }
}
