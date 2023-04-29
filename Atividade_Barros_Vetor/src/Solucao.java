import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Solucao {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap(); // criando hashmap pra salvar os valores
        int[] output = new int[2]; // criando a lista de saida dos numeros, com apenas 2 numeros para somar.

        for(int i = 0; i < nums.length; i++){ // verificando o valor do target com os numeros da lista.
            if (map.containsKey(nums[i])){ //verificando se dentro do mapa tem o valor procurado.
                output[0] = map.get(nums[i]); // pegando o primeiro valor que vai ser somado pra dar o resultado
                output[1] = i; // pegando segundo valor
                System.out.println(Arrays.toString(nums)); // convertendo os valores da lista para string e imprimindo.
                System.out.println("Número desejado: " + target);
                System.out.println("O número na posição " + output[0] + " e o número na posição " + output[1] + " é igual ao número desejado: " + target);
            }
            map.put(target - nums[i], i); // Se não encontrar, vai preencher o valor do mapa com o valor da subtração do numero desejado com o numero da lista. Recuperando a posição com o i.
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] resultado = twoSum(nums, target);
    }
}
