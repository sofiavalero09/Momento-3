public class ControlElevador {
    private Elevador elevador;
    private Puertas puertas;
    private BotonElevador[] botones;
    private int pisoActual;
    private int pisoDestino;

    public ControlElevador(Elevador elevador, Puertas puertas, BotonElevador[] botones) {
        this.elevador = elevador;
        this.puertas = puertas;
        this.botones = botones;
        this.pisoActual = elevador.getPisoActual();
    }

    public void moverElevador(int pisoDestino) {
        this.pisoActual = elevador.getPisoActual();
        System.out.println("Moviendo el elevador al piso " + pisoDestino);

        if (pisoDestino > pisoActual) {
            elevador.moverArriba();
            System.out.println("El elevador sube al piso " + pisoDestino);
        } else if (pisoDestino < pisoActual) {
            elevador.moverAbajo();
            System.out.println("El elevador baja al piso " + pisoDestino);
        } else {
            System.out.println("El elevador ya está en el piso solicitado");
            elevador.parar();
        }
        elevador.setPisoActual(pisoDestino);
    }

    public void pararElevador() {
        elevador.parar();
    }

    public void abrirPuerta() {
        puertas.abrirPuertas();
    }

    public void cerrarPuerta() {
        puertas.cerrarPuertas();
    }
}
