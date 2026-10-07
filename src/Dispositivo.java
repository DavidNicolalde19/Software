public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;


    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty())
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty())
        this.tipo = tipo;

    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }

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
