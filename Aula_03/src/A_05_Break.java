
public class A_05_Break {

// Uso do Break:	
	
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0;  coluna < 10;  coluna++) {
				if(coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////////");
		System.out.println();
		
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0;  coluna <= linha;  coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// O Break é usado para fazermos algo parar.

// É bem simples, mas neste exemplo poderíamos refatorar o código
//sem o uso do break.

// Farei um exemplo abaixo para melhor entendimento.