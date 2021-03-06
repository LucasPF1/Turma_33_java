package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Produto;

public class TelaPrincipal {
	
	// Telas
	public static TelaFormaDePagamento formTelaFormaDePagamento = new TelaFormaDePagamento();
	public static TelaNotaFiscal formTelaNotaFiscal = new TelaNotaFiscal();
	public static TelaDadosDoCliente formTelaDadosDoCliente = new TelaDadosDoCliente();
		
	
	// global vars
	public static String opsn;
	public static int i;
	public static Scanner leia = new Scanner(System.in);
	
	public static ArrayList<Produto> carrinho;
	public static ArrayList<Produto> produtos;
	
	public static boolean pedindoCodigo 		= true;
	public static boolean comprando 			= true; 
	public static boolean pedindoQuantidade 	= true;
	public static boolean exiContinuarComprando = false;
	public static boolean fecharALoja			= false;
	
	// mÃ©todos Ãºteis
	public static void esperaUmPouco(int ms)
	{
	 	try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static int exibirLista(ArrayList<Produto> l)
	{
		int qtdVisivel = 0;
		if (l.size() >= 1)
		{
			for (int linha = 0; linha < l.size(); linha++)
			{				
				if (l.get(linha).getQtdEstoque() > 0)
				{
					System.out.println (l.get(linha).toString());
					qtdVisivel++;
				}
			}
			return (qtdVisivel);
		}
		return (qtdVisivel);
	}
	public static void mostrarBanner()
	{
     	System.out.println("                           GENELETRON");
     	System.out.println("\tGerando economia e qualidade pro seu dia a dia!");
     	System.out.println("");
	}

	public static String esseCodigoExiste(String c, ArrayList<Produto> l)
	{		
		for (int linha = 0; linha < l.size(); linha++)
			if (l.get(linha).getCodProduto().toLowerCase().equals(c.toLowerCase()) && l.get(linha).getQtdEstoque() > 0)
				return (Integer.toString(linha));
		return (Integer.toString(-1));
	}
	public static boolean eUmNumero(String qtdDigitada)
	{
		for (int i = 0; i < qtdDigitada.length(); i++)
			if (!Character.isDigit(qtdDigitada.charAt(i)))
					return (false);
		return (true);
	}
	public static void exibirContinuarComprando()
	{
		System.out.print("\n\n\n\t\t\n");
		System.out.print("\t\t CONTINUAR COMPRANDO?\n\t\t\t S/N: ");
		
	}
	public static int opContinuarComprandoDigitadaEValida(int turno)
	{
		String op;
		op = leia.next();
		if (!op.toLowerCase().equals("s") && !op.toLowerCase().equals("n"))
		{
			System.out.println("OPÃ‡ÃƒO INVÃ�LIDA!");
			esperaUmPouco(3000);	
			return (-1);
		}
		else if(op.toLowerCase().equals("s"))
		{
			return (1);
		}
		else if (op.toLowerCase().equals("n") && turno == 1 || turno == 3)
		{
			comprando = false;
			pedindoCodigo = false;
			pedindoQuantidade = false;
			
			Limpador.limpa();
			mostrarBanner();
			System.out.println("\n\n        *******************ATÃ‰ BREVE!******************");
		}
		return (2);
	}
	
	
	// coraÃ§Ã£o do programa
	public static void main(String[] args) throws InterruptedException {
		
		// vars -> global
		boolean rodando				= true;
				
		// vars -> controle de fluxo do programa
		boolean pedindoOpValida		= true;
		
		
		
		String	codigoDigitado		= "0";
		
		
		String	quantidadeDigitada	= "0";
		
		boolean pedindoFormaDePagamento = true;
		String	formaDePagamentoInformada = "0";
		boolean pedindoDadosDoCliente	= true;
		
		int i = 0;
		String op = " ";
		String indiceProdutoDigitado = " ";
		
		
		// input -> cadastrando produtos
		carrinho = new ArrayList<Produto>();
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto("G1-1", "Notebook Acer Gamer ", 4700, 10));
		produtos.add(new Produto("G1-2", "Smart TV LG 55Â´	", 2799, 10));
		produtos.add(new Produto("G1-3", "Monitor 4k 32'	", 2500, 10));
		produtos.add(new Produto("G1-4", "Smartphone Motorola", 1799, 10));
		produtos.add(new Produto("G1-5", "Cadeira gamer Thunderx3", 1500, 10));
		produtos.add(new Produto("G1-6", "Drone DGI	", 5300, 10));
		produtos.add(new Produto("G1-7", "Xbox SÃ©ries S	", 2518, 10));
		produtos.add(new Produto("G1-8", "Apple watch series 3", 1500, 10));
		produtos.add(new Produto("G1-9", "Playstation 4	", 2799, 10));
		produtos.add(new Produto("G1-10", "Projetor 4k LG	", 7000, 10));
		
		//TelaFormaDePagamento tfpag1 = new TelaFormaDePagamento();
		
		/* TELA INICIAL */
		do {
			TelaInicial.show();	
			if (opContinuarComprandoDigitadaEValida(1) != -1)
				pedindoOpValida = false;
			Limpador.limpa();
		}while(pedindoOpValida);
		
		
		
		
		/* TELA PRINCIPAL */
		while(comprando)
		{
			System.out.print("\n\n");
			mostrarBanner();
			// 1) Mostrar Produtos
			System.out.println("CÃ“DIGO\tPRODUTO\t\t\t\tPREÃ‡O\t\tESTOQUE");
			System.out.print("â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�\n");
			if (exibirLista(produtos) == 0)					
			{
				System.out.println("\n\n");				
				Limpador.limpa();
				mostrarBanner();
				System.out.println("ATENÃ‡ÃƒO! TODOS OS PRODUTOS FORAM COMPRADOS!");
				esperaUmPouco(3000);
				System.out.println("VOCÃŠ SERÃ� REDIRECIONAD(A/O/E) PARA ESCOLHER A FORMA DE PAGAMENTO!");
				esperaUmPouco(1500);
				Limpador.limpa();
				fecharALoja = true;
				formTelaFormaDePagamento.show();
			}
			
			// 2) Mostrar Carrinho
			if (!fecharALoja)
			{
				System.out.print("â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�â–�\n");
				System.out.println("\nCARRINHO:");
				
				exibirLista(carrinho);		
				System.out.println("\n\n");		
			}
			
			// 3) Perguntando o CÃ³digo do Produto
			boolean jaTaNoCarrinho = false;
			int		indiceJaTaNoCarrinho = 0;
			
			while (pedindoCodigo) {
				System.out.print("DIGITE O CÃ“DIGO DO PRODUTO: ");
				codigoDigitado = leia.next();
				indiceProdutoDigitado = esseCodigoExiste(codigoDigitado, produtos);
				i = Integer.parseInt(indiceProdutoDigitado);
				if (indiceProdutoDigitado.equals("-1"))
				{
					System.out.println("CÃ“DIGO INVÃ�LIDO!\n");
					pedindoCodigo = true;
				}
				else 
				{
					// verificar se o produto jÃ¡ estÃ¡ no carrinho
					if (carrinho.size() > 0)
					{
						for (int linha = 0; linha < carrinho.size(); linha++)
						{
							if (carrinho.get(linha).getCodProduto().toLowerCase().equals(codigoDigitado.toLowerCase())) // se produto jÃ¡ estÃ¡ no carrinho
							{
								jaTaNoCarrinho = true;
								indiceJaTaNoCarrinho = linha;
								pedindoCodigo = false;
								break;
							}
						}
					}
					else
					{
						jaTaNoCarrinho = false;
					}
					
					if (!jaTaNoCarrinho || carrinho.size() == 0)
					{
						// se o carrinho for vazio, ou se o produto que eu to tentando comprar nÃ£o estiver
						Produto newp = new Produto(produtos.get(i).getCodProduto(), produtos.get(i).getNomeProduto(), produtos.get(i).getPreco(), produtos.get(i).getQtdEstoque());
						carrinho.add(newp);
						carrinho.get(carrinho.size() - 1).seteCarrinho(true);
						pedindoCodigo = false;
					}
				}
			}
			
			// 4) Perguntando a Quantidade do Produto
			while (pedindoQuantidade) {
				System.out.print("DIGITE A QUANTIDADE QUE VOCÃŠ DESEJA: ");
				quantidadeDigitada = leia.next();			
				
				if (!eUmNumero(quantidadeDigitada))
					System.out.println("INFORME A QUANTIDADE UTILIZANDO APENAS NÃšMEROS DE 1 A 9!");
				else if (!produtos.get(i).temNoEstoque(Integer.parseInt(quantidadeDigitada)))
					System.out.println("QUANTIDADE INVÃ�LIDA NO ESTOQUE!");
				else
				{
					pedindoQuantidade = false;
					
					// 5) dar baixa no estoque && adicionar a quantidade vendida no carrinho no produto
					produtos.get(i).darBaixar(Integer.parseInt(quantidadeDigitada));
					
					i = Integer.parseInt(esseCodigoExiste(codigoDigitado, carrinho));
					carrinho.get((jaTaNoCarrinho == true ? indiceJaTaNoCarrinho : i)).addCarrinho(Integer.parseInt(quantidadeDigitada));
					
					// 6) exibir mensagem de sucesso, esperar um pouquinho.. 								
					System.out.println("PRODUTO ADICIONADO AO CARRINHO COM SUCESSO!");
					esperaUmPouco(1500);
					
					jaTaNoCarrinho = false;
					indiceJaTaNoCarrinho = 0;
				}
			}		
			
			// 7) atualizar o carrinho, 
			if (exiContinuarComprando)
			{
				// 8) e mostrar o continuar comprando	
				exibirContinuarComprando();
				
				// 9) se N vai para forma de pagamento, se S, recomeÃ§a as compras
				do
				{
					int r = opContinuarComprandoDigitadaEValida(2);
					if (r == 1)
					{
						Limpador.limpa();
						pedindoCodigo = true;
						pedindoQuantidade = true;
						exiContinuarComprando = false;
					}
					else if (r == 2)
					{
						Limpador.limpa();
						formTelaFormaDePagamento.show(); 
					}
				}while(pedindoOpValida);
			}
			else 
				exiContinuarComprando = true;
		}		
		
		// 12) Loja Fechada
	Limpador.limpa();
		mostrarBanner();
		System.out.print("\t\t LOJA FECHADA, VOLTE OUTRO DIA\n"); //
		
	}
}