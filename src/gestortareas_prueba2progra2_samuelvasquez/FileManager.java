/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestortareas_prueba2progra2_samuelvasquez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author unwir
 */
public class FileManager {
    private File file = null;
    
    
    public void empezarTareas() throws IOException{
            file = new File("tareas.txt");
        if(!file.exists()){
         file.createNewFile();
        }
    }
    
    public void crearTarea(String name) throws IOException{
        if(file != null){
            FileWriter fW = new FileWriter(file, true);
            fW.write("[ ] " + name + "\n");
            fW.close();
        }
    }
    
    public String mostrarTareas() throws IOException {
        if(file != null){
            int cont = 1;
            BufferedReader fR = new BufferedReader(new FileReader(file));
            String line;
            String txt = "";
            while((line = fR.readLine())!= null){
                txt += (cont++) + "." + line + "\n";
            }
            fR.close();
            return txt;
        }
        return "No hay tareas";
    }
    
    public void completarTarea(String nameTarea) throws IOException{
            BufferedReader fR = new BufferedReader(new FileReader(file));
            boolean exists = false;
            String line;
            String txt = "";
            while((line = fR.readLine())!= null){
                if(line.equalsIgnoreCase("[ ] " + nameTarea)){
                    line = "[✓]" + nameTarea;
                    exists = true;
                }
                txt += line + "\n";
            }
            fR.close();
            
            FileWriter fW = new FileWriter(file, false);
            fW.write(txt);
            fW.close();
            
            
            System.out.println((exists) ? "----Tarea Completada----" : "----Tarea No Existe----");
        }
        
        
    
    }
    
    
    
    
   
    
    
    

