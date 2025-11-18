public class Elevador {
    private int pisoDestino;
    private int pisoActual;
    private Puertas puerta;
    private BotonElevador[] botones;

    public Elevador(int pisoActual, int pisoDestino, Puertas puerta, BotonElevador[] botones) {
        this.pisoActual = pisoActual;
        this.pisoDestino = pisoDestino;
        this.puerta = puerta;
        this.botones = botones;
    }

    public void moverArriba() {
        System.out.println("El elevador sube");
    }

    public void moverAbajo() {
        System.out.println("El elevador baja");
    }

    public void abrirPuerta() {
        puerta.abrirPuertas();
    }

    public void cerrarPuerta() {
        puerta.cerrarPuertas();
    }

    public void parar() {
        System.out.println("El elevador se detiene");
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
}
