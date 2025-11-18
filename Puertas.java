public class Puertas {
    private String lugar;

    public Puertas(String lugar) {
        this.lugar = lugar;
    }

    public void abrirPuertas() {
        System.out.println("Puertas del " + lugar + " abiertas");
    }

    public void cerrarPuertas() {
        System.out.println("Puertas del " + lugar + " cerradas");
    }
}
