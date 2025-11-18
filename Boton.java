public class Boton {
    private boolean iluminado;

    public Boton() {
        iluminado = false;
    }

    public void oprimir() {
        System.out.println("Botón oprimido");
    }

    public void iluminar() {
        iluminado = true;
        System.out.println("Botón encendido");
    }

    public void apagarLuz() {
        iluminado = false;
        System.out.println("Botón apagado");
    }
}
