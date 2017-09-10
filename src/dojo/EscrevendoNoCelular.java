package dojo;

public class EscrevendoNoCelular {
	public static String numeroParaLertra(String palavra) {
		String resposta = new String();
		char teclaAtual, teclaAtras='/';
		int cont=1;
		
		for(int i=0; i<palavra.length(); i++) {
			// receber o valor dos dois ultimos caracteres
			teclaAtual = palavra.charAt(i);
			
			if(i>0) {
				teclaAtras 	= palavra.charAt(i-1);
			}
			
			// se os dois últimos caracteres forem iguais,
			// soma a quantidade de vezes que a tecla foi pressionada
			if(teclaAtual == teclaAtras) {
				cont++;
			}
			// se forem diferentes, imprime o valor da tecla de acordo com a quantidade
			// de veses que foi pressionada
			if(i==palavra.length()-1 || (i>0 && teclaAtual != teclaAtras)) {
				resposta += converteEmCaracter(teclaAtual, cont);
			}
		}
		return resposta;
	}
	
	public static char converteEmCaracter(char teclaAtual, int cont) {
		char caracter = '*';
		if(teclaAtual == '2') {
			if(cont == 1) {
				caracter = 'A';
			}else if(cont == 2) {
				caracter = 'B';
			}
		}
		return caracter;
		
	}
}
