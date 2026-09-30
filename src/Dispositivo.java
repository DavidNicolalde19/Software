public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarinformacion() {
        System.out.println("nombre" + nombre);
        System.out.println("tipo" + tipo);
        System.out.println("activo" + activo);

    }
    void mostrarEstado(){
        String estado=activo?"activo":"inactivo";
        System.out.println("nombre:"+nombre+"\nestado"+estado);
    }
}
