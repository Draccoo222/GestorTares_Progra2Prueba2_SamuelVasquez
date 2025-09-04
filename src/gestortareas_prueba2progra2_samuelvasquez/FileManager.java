/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestortareas_prueba2progra2_samuelvasquez;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author unwir
 */
public class FileManager {
    private File file = null;
    
    
    public void empezarTareas() throws IOException{
        if(file == null){
            file = new File("tareas");
            file.createNewFile();
        }
    }
    
   
    
    
    
}
