package dojo;

public class EscrevendoNoCelular {
	public static String numeroParaLertra(String palavra) {
		String resposta = new String();
		char teclaAtual, teclaAtras='/';
		int cont=1;
		
		for(int i=0; i<palavra.length(); i++) {
			// receber o valor dos dois ultimos caracteres
			teclaAtual = palavra.charAt(i);
			
			if(i>0 || resposta.length() != 0) {
				teclaAtras 	= palavra.charAt(i-1);
			}
			
			// se os dois últimos caracteres forem iguais,
			// soma a quantidade de vezes que a tecla foi pressionada
			if(teclaAtual == teclaAtras) {
				cont++;
			}
			
			// se forem diferentes, imprime o valor da tecla de acordo com a quantidade
			// de veses que foi pressionada
			if((i>0 && teclaAtual != teclaAtras)) {
				resposta += converteEmCaracter(teclaAtras, cont);
				resposta += converteEmCaracter(teclaAtual, cont);
			}
			else if(i==palavra.length()-1) {
				resposta += converteEmCaracter(teclaAtual, cont);
			}
			
			// se já tiver clicado o máximo de vezes
			// que dá pra clicar em uma tecla
			else if(
				(cont == 3 && teclaAtual == '2') || (cont == 3 && teclaAtual == '3') ||
				(cont == 3 && teclaAtual == '4') || (cont == 3 && teclaAtual == '5') ||
				(cont == 3 && teclaAtual == '6') || (cont == 4 && teclaAtual == '7') ||
				(cont == 3 && teclaAtual == '8') || (cont == 4 && teclaAtual == '9') ||
				(cont == 1 && teclaAtual == '0')
			  ) {
				resposta += converteEmCaracter(teclaAtual, cont);
				cont = 0;
				teclaAtras = '/';
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
			}else if(cont == 3) {
				caracter = 'C'; 
			}
		}
		else if(teclaAtual == '3') {
			if(cont == 1) {
				caracter = 'D';
			}else if(cont == 2) {
				caracter = 'E';
			}else if(cont == 3) {
				caracter = 'F'; 
			}
		}
		
		return caracter; 
		
	}
}
