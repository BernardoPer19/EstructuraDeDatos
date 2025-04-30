
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTests{
    private CuentaBancaria cuenta;

    @Test
    public void nuevoSaldoEsCero() {
        double saldo = cuenta.getSaldo();
        assertEquals(0, saldo);
    }

    @Test 
    public void verDueñoDeLaCuenta(){
        String dueño = cuenta.getDueño();
        assertEquals("Mateo" , dueño);
    }

    @Test
    public void depositarDiner(){
        int nuevoSaldo = cuenta.depositar(300);
        assertEquals(300, nuevoSaldo);
    }

    @Test
    public void retirarDineroCorrectamente() {
        cuenta.depositar(500);  
        int nuevoSaldo = cuenta.retirar(200);  
        assertEquals(300, nuevoSaldo);  
    }

    @BeforeEach
    public void setUp(){
        cuenta = new CuentaBancaria("Mateo");
    }

    @AfterEach
    public void tearDown(){
        cuenta = null;
    }
}
