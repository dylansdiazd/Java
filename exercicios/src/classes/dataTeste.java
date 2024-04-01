package classes;

public class dataTeste {

	public static void main(String[] args) {
		data d1 = new data();

		
		data d2 = new data(12, 05, 1998);

		
		System.out.println(d1.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
	}
}
