import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TDDTests {

    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @AfterEach
    public void tearDown() {
        calc = null; 
    }

    @Test
    public void testSumarDosNumeros() {
        int resultado = calc.Restar(2, 3);
        assertEquals(-1, resultado);
    }
}
