public class Dispositivo {


    public String nombre;      // public
    String tipo;               // acceso por defecto (sin modificador)
    public boolean activo;     // public

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }


    void mostrarEstado() {
        if (activo) {
            System.out.println(nombre + " está activo");
        } else {
            System.out.println(nombre + " está inactivo");
        }
    }

    public void activar() {
        activo = true;
        System.out.println(nombre + " fue activado");
    }
}