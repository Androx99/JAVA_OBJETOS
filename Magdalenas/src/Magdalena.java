public class Magdalena {
    //Inicializamos variables
    private String nombre;
    private String ingredientes;
    public Magdalena (String nombre){
        this.nombre = nombre;
    }
    public void setValorIngrediente (String ingredientes){
        this.ingredientes = ingredientes;
    }
    public void atributosMagdalena (){
        System.out.println (nombre + " cuyos ingredientes son " + ingredientes);
    }
}
