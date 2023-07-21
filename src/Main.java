import java.util.List;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// Prova-CodingTank-AdaBTG
		String[][] dadosPessoas = new String[][]{ 
		    {"Ana", "Paulo", "Márcia", "Pedro",  "Beatriz"},
		    {"1.70", "1.72", "1.62", "1.90", "1.53" },
		    {"80", "90", "61", "84", "49"}
		};
		
		System.out.printf("A média aritmética das alturas é: %.2fm", mediaAltura(dadosPessoas));
		System.out.println("\n");
		System.out.printf("A média aritmética dos pesos é: %.2fKg", mediaPeso(dadosPessoas));
		System.out.println("\n");
		System.out.println("Chamando a função que mostra nome e IMC:");
		mostraNomeIMC(dadosPessoas);
		System.out.println("\n");
		System.out.println("Chamando a função que mostra a pessoa mais alta e sua altura: ");
		maiorPessoa(dadosPessoas);
		System.out.println("\n");
		System.out.println("Chamando a função que mostra a pessoa mais baixa e sua altura: ");
		menorPessoa(dadosPessoas);
		System.out.println("\n");
		System.out.println("Chamando a função que mostra a pessoa mais pesada e o seu peso: ");
		maisPesada(dadosPessoas);
		System.out.println("\n");
		System.out.println("Chamando a função que mostra a pessoa mais leve e o seu peso: ");
		maisLeve(dadosPessoas);
		System.out.println("\n");
		System.out.println("Chamando a função que mostra a pessoa com maior IMC e o seu IMC: ");
		pessoaMaiorIMC(dadosPessoas);
		System.out.println("\n");
		System.out.println("Chamando a função que mostra a pessoa com menor IMC e o seu IMC: ");
		pessoaMenorIMC(dadosPessoas);
		

	}
	
	public static Double mediaAltura(String [][] matriz) {
		double somaAlturas = 0;
		for(int i=0; i<matriz[1].length; i++) {
			double altura = Double.valueOf(matriz[1][i]);
			somaAlturas += altura; 
		}
		double media = somaAlturas/matriz[1].length;
		return media;
	}
	
	public static Double mediaPeso(String [][] matriz) {
		double somaPesos = 0;
		for(int i=0; i<matriz[1].length; i++) {
			double peso = Double.valueOf(matriz[2][i]);
			somaPesos += peso; 
		}
		double media = somaPesos/matriz[1].length;
		return media;
	}
	
	public static Double calculaIMC(Double altura, Double peso) {
		return (altura * altura)/peso;
	}
	
	public static List<String> calculaPessoaEIMC(String [][] matriz){
		List<String> pessoasIMC = new ArrayList<>();
		for(int i = 0; i<matriz[0].length; i++) {
			String nome = matriz[0][i];
			double altura = Double.valueOf(matriz[1][i]);
			double peso = Double.valueOf(matriz[2][i]);
			double imc = calculaIMC(altura, peso);
			
			pessoasIMC.add(nome);
			pessoasIMC.add(String.valueOf(imc));
		}
		return pessoasIMC;
		
	}
	
	public static void mostraNomeIMC(String [][] matriz) {
		List<String> lista = calculaPessoaEIMC(matriz);
		for(int i=0; i <lista.size(); i++) {
			String nome = lista.get(i);
			double imc = Double.valueOf(lista.get(i+1));
			System.out.printf(nome + " tem o IMC: %.4f \n", imc);
			i++;
		}
	

	}
	
	public static void maiorPessoa(String [][] matriz) {
		double maior = 0.0;
		String nomeMaior = "";
		for(int i = 0; i<matriz[0].length; i++) {
			String nome = matriz[0][i];
			double altura = Double.valueOf(matriz[1][i]);
			if(altura >= maior) {
				maior = altura;
				nomeMaior = nome;
			}
		}
		System.out.printf("A maior pessoa é: " + nomeMaior + " com a altura de %.2fm.",maior);
	}
	
	public static void menorPessoa(String [][] matriz) {
		double menor = 10.0;
		String nomeMenor = "";
		for(int i = 0; i<matriz[0].length; i++) {
			String nome = matriz[0][i];
			double altura = Double.valueOf(matriz[1][i]);
			if(altura <= menor) {
				menor = altura;
				nomeMenor = nome;
			}
		}
		System.out.printf("A menor pessoa é: " + nomeMenor + " com a altura de %.2fm.",menor);
	}
	
	public static void maisPesada(String [][] matriz) {
		double maior = 0.0;
		String nomeMaior = "";
		for(int i = 0; i<matriz[0].length; i++) {
			String nome = matriz[0][i];
			double peso = Double.valueOf(matriz[2][i]);
			if(peso >= maior) {
				maior = peso;
				nomeMaior = nome;
			}
		}
		System.out.printf("A pessoa mais pesada é: " + nomeMaior + " com o peso de %.2fKg.",maior);
	}
	
	public static void maisLeve(String [][] matriz) {
		double menor = 10000.0;
		String nomeMenor = "";
		for(int i = 0; i<matriz[0].length; i++) {
			String nome = matriz[0][i];
			double peso = Double.valueOf(matriz[2][i]);
			if(peso <= menor) {
				menor = peso;
				nomeMenor = nome;
			}
		}
		System.out.printf("A pessoa mais leve é: " + nomeMenor + " com o peso de %.2fKg.",menor);
	}
	
	public static void pessoaMaiorIMC(String [][] matriz) {
		List<String> lista = calculaPessoaEIMC(matriz);
		double maior = 0.0;
		String nomeMaior ="";
		for(int i=0; i <lista.size(); i++) {
			String nome = lista.get(i);
			double imc = Double.valueOf(lista.get(i+1));
			if(imc >= maior) {
				maior = imc;
				nomeMaior = nome;
			}
			i++;
		}
		System.out.printf("A pessoa com o maior IMC é: " + nomeMaior + " com IMC de %.4f.",maior);
	}
	
	public static void pessoaMenorIMC(String [][] matriz) {
		List<String> lista = calculaPessoaEIMC(matriz);
		double menor = 10.0;
		String nomeMenor ="";
		for(int i=0; i <lista.size(); i++) {
			String nome = lista.get(i);
			double imc = Double.valueOf(lista.get(i+1));
			if(imc <= menor) {
				menor = imc;
				nomeMenor = nome;
			}
			i++;
		}
		System.out.printf("A pessoa com o menor IMC é: " + nomeMenor + " com IMC de %.4f.",menor);
	}

}
