package If;

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

		System.out.println("Bem vindo ao Banco Champions");
		
		int boleto = 1100;
		int saldo = 1000;
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
