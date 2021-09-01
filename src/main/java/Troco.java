public class Troco {
    public static void CalculaTroco(int valor){
        int[] notas = {100, 50, 20, 10, 5, 2};
        int i = 0;
        int quantidade;

        while(valor != 0){
            quantidade = valor / notas[i];
            if (quantidade != 0) {
                System.out.println(quantidade + " * " + notas[i]);
                valor = valor % notas[i];
            }
            i++;
            if (valor == 1){
                System.out.println("Sem notas para o 1 restante.");
                break;
            }
        }

        /*for (int i = 0; i < notas.length; i++) {
            if (valor % notas[i] == 0){
                System.out.println(valor + "*" + valor/notas[i]);
                valor -= notas[i];
            }
        }*/

        /*if (valor % notas[0] == 0){
            System.out.println(valor + "*" + valor/notas[0]);
        } else if ((atual = (valor-notas[0])) % notas[1] == 0){
            System.out.println(notas[0] + "*" + valor/notas[0]);
            System.out.println((valor-notas[0]) + "*" + valor/notas[1]);
        }*/
    }
}
