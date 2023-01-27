public class A_04_Encadeamento {

// Laços Encadeados:	
	
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.print("Tabuada do " + multiplicador + ": ");
			System.out.println(" ");
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
				System.out.println(" ");
			}
			System.out.println();
		}
	}
}


// Nesta aula é mostrado que podemos juntar um laço com outro
//para chegarmos a um determinado objetivo.

// Aqui temos um exemplo de uma tabuada. Onde o primeiro For
//está determinado por qual tabuada irá começar que no caso seria
//a do 1. E o segundo For está para os valores com que o número
//da tabuada irá multiplicar.

// É importante perceber que alguns sysout do for não possuem o ln
//no final. O ln no final faz com que durante o print no console
//ele pule uma linha.