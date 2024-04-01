package classes;

public class data {

	int dia;
	int mes;
	int ano;
	
	data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	data(int diaI, int mesI, int anoI){
		dia = diaI;
		mes = mesI;
		ano = anoI;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
