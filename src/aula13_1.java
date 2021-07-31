
public class aula13_1 {

	//Crie um método geraAleatórios que gera um número inteiro aleatório entre 0 e 1000
	//e imprime esse valor na tela. OBS.: O método não deve receber nenhum parâmetro.

	public static void main(String[] args) {
		geraAleatorios();
	}
	public static void geraAleatorios() {
		int num = (int)(Math.random()*1000);
		System.out.println(num);
	}
}
