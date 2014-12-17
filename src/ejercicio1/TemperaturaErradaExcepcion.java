


package ejercicio1;

/**
 *
 * @author oquintansocampo
 */
public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion(){
        super("Temperatura debe ser mayor de 80ºC");
    }
    
    public TemperaturaErradaExcepcion(String mensaje){
        super(mensaje);
    }
     
}
