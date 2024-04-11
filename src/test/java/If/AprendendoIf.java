package If;

import java.util.Scanner;

public class AprendendoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Operadores logicos
		// < menor que
		// > maior que
		// == igual
		// || ou
		// >= maior ou igual
		// <= menor ou igual
		// != diferente
		// & E

		// IF em cadeado multiplas valida
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo ao Banco Champions");
		
		System.out.println("Digite o valor do seu boleto para pagamento:");
		int boleto = scanner.nextInt();
		System.out.println("digite o saldo da sua conta:");
		int saldo = scanner.nextInt();
		System.out.println("Digite seu nome:");
		double nome = scanner.nextDouble();
		int limite = 200;
		int saldoelimite = saldo + limite;
		
		System.out.println("Bem vido ao Sistema de pagamento de boleto");
		if (boleto <= saldoelimite) {
			int saldofinal = saldo-boleto;
			System.out.println(saldofinal);
			System.out.println("Boleto pago com  sucesso");
			System.out.println(saldoelimite-boleto );
			
		} else {
            System.out.println("Saldo insuficiente");
		}

	}

}
