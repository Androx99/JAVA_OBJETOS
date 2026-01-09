package Data;

import beans.Magdalena;

public class AlmacenMagdalenas {
    // 1º) ATRIBUTOS
    private static final int SIZE = 5;
    private Magdalena [] lstMagdalenas = new Magdalena[SIZE];
    private static int contMagdalenas = 0;
    // 2º) CONSTRUCTOR
    public AlmacenMagdalenas(Magdalena magdalena){   //Añadir un objeto Magdalena a una lista de objetos
        this.lstMagdalenas[contMagdalenas] = magdalena;
        contMagdalenas ++;
    }
    public void addMagdalena(Magdalena miMagdalena){
        if (contMagdalenas <=4) {
            this.lstMagdalenas[contMagdalenas] = miMagdalena;
            contMagdalenas++;
        } else {
            System.out.println("La lista ya contiene 5 magdalenas");
        }
    }
}
