
public class aula12_1 {

	// Crie um método chamado “gerarNumeroAletório” que deve gerar um numero
	// aleatório
	// par. E crie outro método chamado olaMundo que imprime a mensagem “Olá Mundo”

	public static void main(String[] args) {
		gerarNumeroAletório();
		olamundo();
	}

	public static void gerarNumeroAletório() {
		int num;
		do {
			num = (int) (Math.random() * 1000);
		} while (num % 2 != 0);
		System.out.println(num);
	}

	public static void olamundo() {
		System.out.println("Ola Mundo");

	}

}
