package streams;

import java.util.Arrays;
import java.util.List;

public class desafioMap {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        // Arrays para armazenar as representações binárias normais e invertidas
        String[] normalBinaryArray = new String[nums.size()];
        String[] invertedBinaryArray = new String[nums.size()];
        int[] normalIntegers = new int[nums.size()];
        int[] invertedIntegers = new int[nums.size()];
        
        // Usando stream e map para converter cada número em sua representação binária
        for (int i = 0; i < nums.size(); i++) {
            String normal = Integer.toBinaryString(nums.get(i));
            String inverted = new StringBuilder(normal).reverse().toString();
            normalBinaryArray[i] = normal;
            invertedBinaryArray[i] = inverted;
            normalIntegers[i] = Integer.parseInt(normal, 2);
            invertedIntegers[i] = Integer.parseInt(inverted, 2);
        }
        
        // Imprime as representações binárias normais
        System.out.println("Representações binárias normais:");
        System.out.println(Arrays.toString(normalBinaryArray));
        System.out.println(Arrays.toString(normalIntegers));
        
        // Imprime as representações binárias invertidas
        System.out.println("\nRepresentações binárias invertidas:");
        System.out.println(Arrays.toString(invertedBinaryArray));
        System.out.println(Arrays.toString(invertedIntegers));
    }

}
