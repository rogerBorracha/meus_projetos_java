
public class aula12_1 {

	// Crie um m�todo chamado �gerarNumeroAlet�rio� que deve gerar um numero
	// aleat�rio
	// par. E crie outro m�todo chamado olaMundo que imprime a mensagem �Ol� Mundo�

	public static void main(String[] args) {
		gerarNumeroAlet�rio();
		olamundo();
	}

	public static void gerarNumeroAlet�rio() {
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
