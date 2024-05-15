package appCalculo.interno;

import java.util.Arrays;

public class operacoesAritmeticas {

	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
	}
}
