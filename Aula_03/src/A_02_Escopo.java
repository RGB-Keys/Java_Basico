
public class A_02_Escopo {

// Teste de Escopo no While:

	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			int total = 0;
			total += contador;

			System.out.println(total);
			contador++;
		}
		System.out.println(" ");
		System.out.println("//////////////////////");
		System.out.println(" ");
		
		int contadorr = 0;
		int totall = 0;
		
		while(contadorr <= 10) {
			totall += contadorr;
			contadorr++;	
		}
		System.out.println(totall);
	}
}

// A ideia do código não é para ele mostrar o 0,1,2...
//como no código anterior.

// O código deveria pegar o valor que contador está acrescentando
//e ir somando com o números que estiverem sendo guardados no total.

// Mas está claro no código um erro de escopo, o variável total
//está dentro do laço While com o valor sendo igual a 0, ou seja,
//toda vez que o laço repete, ele volta a ser 0 e não guarda o valor
//anterior.

// Deixei que o código permanecesse com o erro para ajudar no
//entendimento e logo abaixo fiz o código como deveria ser.