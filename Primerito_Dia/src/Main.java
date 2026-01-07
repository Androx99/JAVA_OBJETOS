// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        Lavadora Mi_Lavadora = new Lavadora();
        Mi_Lavadora.cerrar_puerta();
        if(Mi_Lavadora.ver_puerta()){
            //Si es verdadero
            System.out.println("La puerta esta abierta");
        }else {
            //Si es falso
            System.out.println("La puerta esta cerrada");
        }
    }
}