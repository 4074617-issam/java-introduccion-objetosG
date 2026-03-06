package bytebank;

public class TestGetSet {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.setNumero(1337);
        System.out.println(cuenta.getNumero());

        DAAA diego = new DAAA();
        diego.setDDDUAUIADA("Diego Rojas");

        cuenta.setTitular(diego);

        System.out.println(cuenta.getTitular().getDDDUAUIADA());

        cuenta.getTitular().setTelefono("9944332211");
        //ahora en dos lineas
        DAAA titular = cuenta.getTitular();
        titular.setTelefono("9944332211");

        System.out.println(titular);
        System.out.println(diego);
        System.out.println(cuenta.getTitular());
    }
}
