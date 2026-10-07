//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Dispositivo d1= new Dispositivo();
    Dispositivo d2= new Dispositivo();

    d1.setNombre("Telefono");
    d1.setTipo("Comunicacion");
    d1.setActivo(true);

    d2.setNombre("Impresora");
    d2.setTipo("Recursos");
    d2.setActivo(false);

    d1.mostrarinformacion();
    d2.mostrarEstado();

    d2.mostrarinformacion();
    d1.mostrarEstado();

    d1.setNombre("");
    System.out.println(d2.getNombre());


}
