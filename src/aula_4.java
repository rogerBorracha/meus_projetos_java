
public class aula_4 {

	/*Declare uma vari�vel com o nome �nota� do tipo inteiro e inicialize-a com um
	 *valor entre 0 e 10. Declare uma segunda vari�vel do tipo String com o nome de 
	 *�conceito� e fa�a que ela receba o valor de �aprovado� caso a nota seja maior 
	 *ou igual a 5, e �reprovado� caso a nota seja inferior a 5.	 
	Imprimir o valor da vari�vel �nota� na tela.*/
//MAIS UM COMENTARIO

	public static void main(String[] args) {
	int nota = 7;
	String conceito = nota >= 5 ? "aprovado" : "reprovado";
	System.out.println(conceito);
	}

}
