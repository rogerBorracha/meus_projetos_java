
public class aula13_1 {

	//Crie um m�todo geraAleat�rios que gera um n�mero inteiro aleat�rio entre 0 e 1000
	//e imprime esse valor na tela. OBS.: O m�todo n�o deve receber nenhum par�metro.

	public static void main(String[] args) {
		geraAleatorios();
	}
	public static void geraAleatorios() {
		int num = (int)(Math.random()*1000);
		System.out.println(num);
	}
}
