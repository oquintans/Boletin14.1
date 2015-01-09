package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class ConversorTemperaturas {

    private final float TEMP = 80;

    public float centigradosAFharenheit() throws TemperaturaErradaExcepcion {

        float fhar, cent;
        cent = Float.parseFloat(JOptionPane.showInputDialog("Introducir Temperatura ºC"));
        fhar = 9.0f / 5.0f * cent + 32.4f;
        if (cent < 80) {
            throw new TemperaturaErradaExcepcion();
        }
        return fhar;
    }

    public float centígradosAReamur() {

        float cent, ream = 0;
        try {
            cent = Float.parseFloat(JOptionPane.showInputDialog("Introducir Temperatura ºC"));
            if (cent < 80) {
                throw new TemperaturaErradaExcepcion();
            }
            ream = 4.0f / 5.0f * cent;

        } catch (TemperaturaErradaExcepcion ex) {
            JOptionPane.showMessageDialog(null, "Temperatura debe ser mayor de 80ºC");
        }
        return ream;

    }

}
