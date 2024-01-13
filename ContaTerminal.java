package contabanco;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("$ Bem vindo ao Banco Nordeste $\n");
		System.out.print("Digite seu nome caro usuário : ");
		String nome = teclado.nextLine();
		System.out.print("Agora digite o numero da Agencia : ");
		String agencia = teclado.nextLine();
		System.out.print("Agora digite o numero da sua Conta : ");
		int conta = teclado.nextInt();
		System.out.print("Por fim, digite a quantidade de seu saldo : ");
		float saldo = teclado.nextFloat();
		System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco.\n \nSua Agencia é %s\n" 
				+ "\nSeu Numero de Conta é %d\n \nSeu saldo é de %.2f R$ e já está disponivel pro saque.\n", nome, agencia, conta, saldo);
		System.out.print("\nVOLTE SEMPRE :)");
	}

}
