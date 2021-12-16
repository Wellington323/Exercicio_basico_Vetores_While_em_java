import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		//ESTRUTURA REPETITIVAS
		// while Enquanto 
	
		Scanner sc = new Scanner(System.in); // FAZ A LEITURA DOS DADOS
		
		 Integer x = sc.nextInt(); // Primeiro Valor Para fazer a leitura
		           int soma = 0;
		          while (x !=0) {
		        	  soma = soma + x;
		        	  x = sc.nextInt(); // Vai repetir o que voce declarou no primeiro
		          }
                        System.out.println(soma);
           sc.close();
	}

}
