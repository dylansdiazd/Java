package classes;

public class jantar {

	public static void main(String[] args) {
		comida c1 = new comida("arroz", 0.223);
		comida c2 = new comida("feijao", 0.300);
		comida c3 = new comida("bife", 0.900);

		pessoa p = new pessoa("Dylan", 66);

		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
		p.comer(c3);

	}

}
