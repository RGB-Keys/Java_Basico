
public class A_02_Boolean {
	
	// Refatorando o código anterior com o uso do tipo boolean:
	
	public static void main(String[] args) {
		int idade = 16;
		int qtdPessoas = 3;
		boolean acompanhado = qtdPessoas >= 2;
		
		if(idade >= 18  || acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente, você não pode entrar.");
		}
	}
}