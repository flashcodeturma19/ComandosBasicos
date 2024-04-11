package SwitCase;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo a compahia area flash de turismo");
		System.out.println("Aqui seu sonho vira realidade");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Atendemos os Seguintes destinos");
		System.out.println("Londres, munique, las vegas, toronto, new york, manaus.");
		System.out.println("");
		System.out.println("Digite seu destino");
		String destino = scanner.next();
		System.out.println("otima escolha " + destino + " è um lugar lindo");
		System.out.println("");
		System.out.println("Qual a data que deseja Viajar:");
		String  data = scanner.next();
		System.out.println(data +" Otima sugestão de data");
		int valornacional = 1500;
		int valorinternacional = 4000;
		
		
		
		
		switch (destino) {
		case "londres":
			System.out.println("voce escolher um otimo destino os ingleses sao boas pessoas");
			System.out.println("O valor da passagem para esse destino é de 4.000 reais ");
			System.out.println("aceitamos pagamento somente em cartao de credito, avista ou com parcelamento em até  10x sem juros");
			System.out.println("Como desejar pagar  avista ou parcelado?");
			String formapagamento= scanner.next();
			switch (formapagamento) {
			case "avista":
				System.out.println("Voce selecionou a opção" + formapagamento);
				System.out.println("o valor da sua passagem é de 4000 mil reais");
				System.out.println("Recebemos o pagamento " + formapagamento + " parabens");
				System.out.println("Espero que aproveite seu destino ");
				System.out.println("Todos os nosso voos saem do aeroporto de galeao no rio de janeiro");
				break;
			case"parcelado":
				System.out.println("Voce selecionou a opção" + formapagamento);
				System.out.println("");
				System.out.println("Realizamos o parcelamento em até 10x deseja em quantas parcelas ? ");
				System.out.println("Digite o numero de parcelas");
				int numeroparcela = scanner.nextInt();
				int valordaparcela = valorinternacional/numeroparcela;
				System.out.println("O valor da sua parcela fica em " + valordaparcela + ",00");
				System.out.println("Otima escolha obrigado por vooa com a flash ");
				System.out.println("todos os nosso voos saem do aeroporto de galeao no rio de janeiro");
				
			default:
				System.out.println("Voce digitou um valor errado");
				break;
			}
			break;
		case "manaus":
			System.out.println("voce escolheu uma otima opção a floresta amazonica e linda e cheio de diversidades naturais");
			System.out.println("O valor da passagem para esse destino é de 1.500 reais ");
			System.out.println("aceitamos pagamento somente em cartao de credito, avista ou com parcelamento em até  10x sem juros");
			System.out.println("Como desejar pagar  avista ou ou parcelado?");
			String formapagamento1= scanner.next();
			switch (formapagamento1) {
			case "avista":
				System.out.println("Voce selecionou a opção" + formapagamento1);
				System.out.println("");
				System.out.println("o valor da sua passagem é de 1.500 mil reais");
				System.out.println("Recebemos o pagamento " + formapagamento1 + " parabens");
				System.out.println("Espero que aproveite seu destino ");
				System.out.println("Todos os nosso voos saem do aeroporto de galeao no rio de janeiro");
				break;
			case"parcelado":
				System.out.println("Voce selecionou a opção" + formapagamento1);
				System.out.println("");
				System.out.println("Realizamos o parcelamento em até 10x deseja em quantas parcelas ? ");
				System.out.println("Digite o numero de parcelas");
				int numeroparcela = scanner.nextInt();
				int valordaparcela = valornacional/numeroparcela;
				System.out.println("O valor da sua parcela fica em " + valordaparcela + ",00");
				System.out.println("Otima escolha obrigado por vooa com a flash ");
				System.out.println("todos os nosso voos saem do aeroporto de galeao no rio de janeiro");
				break;
			default:
				System.out.println("Voce digitou um valor errado");
				break;
			}
			break;
		default:
			System.out.println("todas as opçoes sao invalidas");
			break;
		}
		
		
	}

}
