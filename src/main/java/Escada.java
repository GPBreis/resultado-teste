import java.util.Arrays;

public class Escada {

    public static void GeraEscada(int altura){
        String[][] escada = new String[altura][altura];

        for (int i = 0; i < escada.length; i++) {
            for (int j = 0; j < escada[i].length; j++) {
                escada[i][j] = "#";
                System.out.print(Arrays.toString(escada[j]));
            }
            escada[i][i] = "";
            System.out.println();
        }
    }
}
