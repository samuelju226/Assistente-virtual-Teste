package sa.com;

import java.util.Scanner;

public class StartApp {
    
	 public static void main (String [] args) {
		 Scanner leitura= new Scanner (System.in);
		 int menu = 0;
		 int in = 100;
		 do {
			 
			 System.out.println("Digite a opção desejada");
			 System.out.println(" 1 - segunda via de conta");
			 System.out.println(" 2 - Para saber sua recarga de internet");
			 System.out.println(" 3 - Para falar com um atendente");
			 System.out.println(" 4 - Sair");
			 menu = leitura.nextInt(); 
			
		 
		   if(menu == 1) {
			   System.out.println("Digite seu CPF");
			   int CPF = leitura.nextInt();
			   System.out.println("Vamos conferir sua conta atraves do CPF:" + CPF);
		       System.out.println("Digite seu whatsapp:");
		       int whatsapp = leitura.nextInt();
		       System.out.println("vamos enviar sua conta no whatsapp: " + whatsapp);
		   }   
		   else if (menu == 2) {
			   System.out.println("Você ainda tem " + in + "GB de internet");
			}   
		   else if (menu == 3) {
		       System.out.println("Digite seu numero");
		       int numero = leitura.nextInt();
		       System.out.println("Aguarde ate que um de nossos atendente entre em contato pelo numero: " + numero);
		    }  
		   else if (menu == 4) {
			   System.out.println("Agradeço pela visita");
		   }
		 } while(menu != 4);
		  leitura.close();
	 }
}
