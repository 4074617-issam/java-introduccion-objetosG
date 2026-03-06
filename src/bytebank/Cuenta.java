package bytebank;

public class Cuenta {

     private double saldo;
     private int agencia = 1;
     private int numero;
     private DAAA titular = new DAAA();

    private static int total;

    public Cuenta(double saldo, int agencia, int numero, DAAA titular) {
        this.setSaldo(saldo);
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setTitular(titular);
    }

    public static void setTotal(int total) {
        Cuenta.total = total;
    }

    private void extADADAD() {
        System.out.println("Estoy creando una cuenta " + this.getNumero());
    }

    public void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public boolean saca(double valor) {
        if(this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public DAAA getTitular() {
        return titular;
    }

    public void setTitular(DAAA titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
