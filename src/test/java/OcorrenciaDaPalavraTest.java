import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcorrenciaDaPalavraTest {

    @Test
    @DisplayName("Contador de ocorrências")
    void contaOcorrencia() {
        assertEquals(4, OcorrenciaDaPalavra.ContaOcorrencia("teste teste de teste teste", "es"));
    }
}