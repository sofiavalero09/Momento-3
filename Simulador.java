import java.util.Scanner;
public class Simulador {
    public static void main(String[] args) {
        
        Piso p1 = new Piso(1);
        Piso p2 = new Piso(2);
        Piso p3 = new Piso(3);
        Piso p4 = new Piso(4);
        Piso p5 = new Piso(5);

        
        Puertas puertas = new Puertas("elevador");

        
        BotonElevador[] botones = new BotonElevador[5];
        for (int i = 0; i < 5; i++) {
            botones[i] = new BotonElevador(i + 1);
        }

        
        Elevador elevador = new Elevador(2, 1, puertas, botones);

        
        ControlElevador controlElevador = new ControlElevador(elevador, puertas, botones);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el piso: ");
        int piso = sc.nextInt();

        botones[piso - 1].oprimir();

        
        controlElevador.moverElevador(piso);

        
        controlElevador.abrirPuerta();

        
        controlElevador.cerrarPuerta();

        
        botones[piso - 1].apagarLuz();
    }
}
