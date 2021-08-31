import java.util.LinkedList;

public class RemoverK {
    public static void Remove(LinkedList<Integer> lista, int k){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i) == k){
                lista.remove(i);
            }
        }
    }
}
