
public class A_01_IfElse {
	
	// Uso do Condicional If...Else:
	
	public static void main(String[] args) {
		int idade = 16;
		int qtdPessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Você já é maior de idade!");
		} else if(qtdPessoas >= 2) {
			System.out.println("Você ainda é menor de idade,"
					+ " mas está acompanhado.");
		} else {
			System.out.println("Infelizmente, você não pode entrar.");
		}
	}
}

// Usar muitos if...else, pode deixar o código gigantesco e sujo.

// No exercício a seguir, pegaremos o mesmo código mas iremos
//refatorá-lo para deixá-lo mais limpo.