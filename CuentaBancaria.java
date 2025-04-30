
public class CuentaBancaria{
    private String dueño;
    private int saldo;

    public CuentaBancaria(String dueño){
        this.dueño = dueño;
        this.saldo = saldo;
    }

    public int depositar(int nuevoSaldo) {
        if (nuevoSaldo < 0) {
            throw new IllegalArgumentException("Error: no puedes depositar un saldo negativo.");
        }
        saldo += nuevoSaldo;
        return saldo;
    }

    public int retirar(int saldoRetirado){
        if(saldoRetirado < 0 || saldoRetirado > saldo){
            throw new IllegalArgumentException("Error: no puedes realiar esta accion");
        }
        saldo -= saldoRetirado;
        return saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public String getDueño(){
        return dueño;
    }
}
