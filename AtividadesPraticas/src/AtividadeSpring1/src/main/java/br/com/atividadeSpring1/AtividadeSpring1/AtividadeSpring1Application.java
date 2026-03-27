package br.com.atividadeSpring1.AtividadeSpring1;

import br.com.atividadeSpring1.AtividadeSpring1.Servicos.AvaliarServico;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AtividadeSpring1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);
		AvaliarServico avaliacao = new AvaliarServico();

		var nomeServico = "";
		double notaServico = 0.0;
		String comentarioServico = null;

		int opcao = 0;
		System.out.println("""
				Qual o serciço prestado:
				
				(1) Venda de produtos
				(2) Serviços de instalação
				(3) Assinatura de alguns itens
				""");
		opcao = scan.nextInt();

		switch (opcao){
			case 1:
				nomeServico = "Vende de produtos";
				break;
			case 2:
				nomeServico = "Serviços de instalação";
				break;
			case 3:
				nomeServico = "Assinatura de alguns itens";
				break;
		}

		System.out.println("Qual a nota de avaliação? (0 a 10)");
		notaServico = scan.nextDouble();
		scan.nextLine();

		System.out.println("Escreva um comentário para esse serviço: ");
		comentarioServico = scan.nextLine();

		avaliacao.avaliarServico(nomeServico, notaServico, comentarioServico );
		System.out.println(avaliacao.toString());
	}
}
