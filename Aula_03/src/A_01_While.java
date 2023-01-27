public class A_01_While {

// Uso do Laço de Repetição While:
	
	public static void main(String[] args) {
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println(contador);
	}
}

// Percebe-se que antes de iniciar o While, ele pede um
//condicional.

// O condicional determinado foi chamado de contador e
//foi declarado o valor 0, mas poderia ser um outro número
//tudo depende do que você deseja abordar.

// Desta forma, o While teve condicional o contador <= 10.

// E dentro dele irá se repetir o que foi solicitado até
//a condicional ser efetuada, porém enquanto contador for 0
//ele não sairá do lugar e ficará num loop infinito.

// É sempre importante declarar um fim para esta condicional.
