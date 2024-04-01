package fundamentos;

public class temperatura {

	public static void main(String[] args) {
		//Convertendo temperatura em celcius
		final double ajuste = 32.00;
	    final double  fator = 5.00;
	    final double fatorDois = 9.00;
	    double f = 86.00;
	    
	    double c = (f - ajuste) * fator/fatorDois;
	    
	    System.out.println(c);
	    
	  
	}
	 
}
