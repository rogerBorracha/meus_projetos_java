
public class aula_4 {

	/*Declare uma variável com o nome “nota” do tipo inteiro e inicialize-a com um
	 *valor entre 0 e 10. Declare uma segunda variável do tipo String com o nome de 
	 *“conceito” e faça que ela receba o valor de “aprovado” caso a nota seja maior 
	 *ou igual a 5, e “reprovado” caso a nota seja inferior a 5.	 
	Imprimir o valor da variável “nota” na tela.*/


	public static void main(String[] args) {
	int nota = 7;
	String conceito = nota >= 5 ? "aprovado" : "reprovado";
	System.out.println(conceito);
	}

}
