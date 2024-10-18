package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
		
	}
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	String dataEspecial() {
		final String formato = ("A data escolhida é: %d/%d/%d ");
		
		//String dataEscolhida = ("a data escolhida é: "+dia+"/"+mes+"/"+ano);
		//return dataEscolhida;
		return String.format(formato, dia, mes, ano);
		
	}
	void imprimirDataFormatada() {
		System.out.println(this.dataEspecial());
	}
}
