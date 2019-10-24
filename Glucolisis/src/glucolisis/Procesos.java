/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glucolisis;

/**
 *
 * @author 18PROGB0115
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Procesos {

    public void cargarArchivo() {
        abrir();
    }

    private void abrir() {
        //ruta del archivo en el pc
        String fileLocal = "src/manuales/manual.pdf";

        try {
            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);

        } catch (IOException e) {
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
}