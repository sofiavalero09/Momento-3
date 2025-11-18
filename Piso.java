public class Piso {
    private int numero;
    private BotonPiso boton;

    public Piso(int numero) {
        this.numero = numero;
        this.boton = new BotonPiso(numero);
    }

    public void oprimir() {
        System.out.println("Botón del piso " + numero + " oprimido");
        boton.oprimir();
    }

    public int getNumero() {
        return numero;
    }
}
