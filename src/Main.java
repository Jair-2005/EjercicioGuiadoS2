//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        dispositivo1.nombre = "Laptop";
        dispositivo1.tipo = "Computadora";
        dispositivo1.activo = true;

        dispositivo2.nombre = "Router";
        dispositivo2.tipo = "Red";
        dispositivo2.activo = false;


        System.out.println("--- Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println("--- Dispositivo 2 ---");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();


        dispositivo1.activo = false;

        System.out.println("\n=== Después de modificar el dispositivo 1 ===");
        System.out.println("--- Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println("--- Dispositivo 2 ---");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();


        System.out.println();
        dispositivo2.activar();
        dispositivo2.mostrarEstado();
    }
}