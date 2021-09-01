import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoverK {


    public static int[] Remove(int[] lista, int k){
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < lista.length; i++) {
            list.add(lista[i]);
        }

        System.out.println("" + list);

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == k){
                list.remove(i);
            }
        }

        System.out.println("" + list);

        for (int i = 0; i < list.size(); i++) {
            lista[i] = list.get(i);
        }

        return lista;
    }
}
