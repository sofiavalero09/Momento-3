public class BotonPiso extends Boton {
    private int piso;

    public BotonPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public void oprimir() {
        System.out.println("Botón del piso " + piso + " oprimido");
        iluminar();
    }
}
