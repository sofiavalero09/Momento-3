public class BotonElevador extends Boton {
    private int pisoDestino;

    public BotonElevador(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void oprimir() {
        System.out.println("Botón del elevador presionado, piso: " + pisoDestino);
        iluminar();
    }
}
