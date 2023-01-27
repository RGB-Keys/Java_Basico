
public class A_03_Escopo {
	
	// Teste de Escopo:
	
	public static void main(String[] args) {
		int idade = 16;
		int qtdPessoas = 3;
		boolean acompanhado;
		
		if(qtdPessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if(idade >= 18  || acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente, você não pode entrar.");
		}
	}
}

// Esse exercício foi mais para visualizar como o Java
//é rígido com sua sintaxe.

// Se o acompanhado não fosse declarado como true ou false,
//o código nem inicializava ou até mesmo se quisermos usar
//o boolean acompanhado antes a linha em que declaramos seus 
//valores, o código também não irá funcionar.