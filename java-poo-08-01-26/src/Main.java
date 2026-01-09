import beans.Magdalena;
import Data.AlmacenMagdalenas;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Magdalena miMagdalena1 = new Magdalena("Chocolate Sexy!");
        Magdalena miMagdalena2 = new Magdalena("Pistacho Boom");
        System.out.println(miMagdalena1.getNombre());
        AlmacenMagdalenas miAlmacenMagdalenas1 = new AlmacenMagdalenas(miMagdalena1);
        miAlmacenMagdalenas1.addMagdalena(miMagdalena2);
    }
}