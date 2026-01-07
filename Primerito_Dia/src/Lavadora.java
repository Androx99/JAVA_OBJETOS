public class Lavadora {
    String marca;
    int kilos_max;
    boolean puerta_abierta;
    String estado;
    boolean jabon_cargado;

    void abrir_puerta(){
        // Llamaria a la funcion para abrir la puerta
        puerta_abierta = true;
    }
    void cerrar_puerta(){
        // Llamaria a la funcion para cerrar la puerta
        puerta_abierta = false;
    }
    boolean ver_puerta(){
        return puerta_abierta;
    }
}
