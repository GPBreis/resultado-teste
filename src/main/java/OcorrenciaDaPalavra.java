import java.util.Arrays;

public class OcorrenciaDaPalavra {
    public static int ContaOcorrencia(String frase, String ocorrencia){

        int resultado = 0;
        String[] array = frase.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(ocorrencia)){
                resultado++;
            }
        }

        System.out.println("Palavras/frase: " + frase);
        System.out.println("Ocorrência: " + ocorrencia);
        System.out.println("Resultado: " + resultado);

        return resultado;

    }

}
