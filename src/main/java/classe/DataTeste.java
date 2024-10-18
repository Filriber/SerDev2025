package classe;

public class DataTeste {

	public static void main(String[] args)  {
		
		var data1 = new Data();
		
		var data2 = new Data(31, 12, 2023);
		
		//Sem utilizar metodo
		//System.out.printf("A primeira data sera %d/%d/%d \n", data1.dia, data1.mes, data1.ano);
		//System.out.printf("A segunda data sera %d/%d/%d \n", data2.dia, data2.mes, data2.ano);
		
		//utilizando metodo
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}

}
