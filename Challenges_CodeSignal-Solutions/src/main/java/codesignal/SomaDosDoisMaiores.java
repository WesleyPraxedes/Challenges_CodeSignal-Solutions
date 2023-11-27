package codesignal;

import java.util.Arrays;

public class SomaDosDoisMaiores {

    public static int somaDosDoisMaiores(int[] array) {
        // Certifique-se de que o array tenha pelo menos dois elementos
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("O array deve ter pelo menos dois elementos");
        }

        // Ordena o array em ordem decrescente
        Arrays.sort(array);

        // Soma os dois maiores elementos
        int soma = array[array.length - 1] + array[array.length - 2];

        return soma;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int[] meuArray = {3, 7, 1, 9, 5, 2, 8};
        int resultado = somaDosDoisMaiores(meuArray);

        System.out.println("A soma dos dois maiores elementos e: " + resultado);
    }

}
