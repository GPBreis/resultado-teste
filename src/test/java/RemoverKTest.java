import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoverKTest {

    @Test
    @DisplayName("Remover K da lista")
    void remove() {
        int[] array = {3,8,9,4,7,1,6,1};
        assertArrayEquals(new int[]{3,8,9,4,7,1,6,1}, RemoverK.Remove(array,5));


    }
}