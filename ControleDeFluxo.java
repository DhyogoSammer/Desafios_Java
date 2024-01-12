package projeto_processo_seletivo;
import java.util.Scanner ;

public class ProjetoSeletivo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Primeiro Parâmetro : ");
		int parametro1 = teclado.nextInt(); 
		System.out.println("Segundo Parâmetro : ");
		int parametro2 = teclado.nextInt(); 
		int contagem = parametro2 - parametro1;
		if (parametro1 >= parametro2) {
			while (true) {
				System.out.println("\nERROR, O PARAMETRO 2 TEM QUE SER MAIOR QUE O PARAMETRO 1\n");
				System.out.println("Primeiro Parâmetro : ");
				int valor1 = teclado.nextInt(); 
				System.out.println("Segundo Parâmetro : ");
				int valor2 = teclado.nextInt();
				int contagemValores = valor2 - valor1;
				if (valor1 < valor2) {
					for (int cc = 1; cc <= contagemValores; cc ++) {
						System.out.println("Imprimindo o numero = " + cc);
					}
					break;
				}
				
			}
		}
		else {
			for (int cc = 1 ; cc <= contagem ; cc++ ) {
				System.out.println("Imprimindo o numero = " + cc);
				
			}
			
		}
		System.out.println("FIM");
	}

}
