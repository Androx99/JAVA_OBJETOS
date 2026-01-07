public class Alumno {
    // "Variables" que va a tener cada Alumno
    // Visivilidad de las variables:
    //private quita el acceso a los atributos
    //public permite modificar los atributos (se debe hacer de otra forma)
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anyo;
    private String dni;
    private char letraDni;

    //Metodo para poder modificar los valores(en vez de funciones se llaman metodo :/)
    public void setValorNombre(String nombre){
        this.nombre = nombre;
    }

    //Metodo que permite construir el objeto
    //CONSTRUCTORES
    //Para establecer condiciones a la hora de llamar el objeto
    public Alumno (String nombre){
        this.nombre = nombre;
    }

}
