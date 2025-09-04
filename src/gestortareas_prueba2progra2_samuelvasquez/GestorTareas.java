/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestortareas_prueba2progra2_samuelvasquez;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class GestorTareas {
    public static void main(String[] args) {
        FileManager fM = new FileManager();
    
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       
        int opc;
        do{
         
            System.out.println("GESTOR DE TAREAS"); 
            System.out.println("================");
            System.out.println("1.Agregar Tarea");
            System.out.println("2.Mostrar Tarea");
            System.out.println("3.Completar Tarea");
            System.out.println("4.Salir");
            System.out.println("================");
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();
             try{
                  fM.empezarTareas();
                switch(opc){
                    case 1:
                        System.out.println("\n ---- Agregar Tarea ----");
                       
                        System.out.println("Nombre de la tarea: ");
                        fM.crearTarea(sc.next());
                        System.out.println("Tarea Creada Con Exito!");
                        break;
                    case 2:
                        System.out.println("\n---- Tareas Actuales ----");
                        System.out.println(fM.mostrarTareas());
                        System.out.println("---- Fin de tareas ----");
                        break;

                    case 3:

                        break;
                    case 4:
                        System.out.println("Fin Del Programa");
                        break;
                    default:
                        System.out.println("Seleccione solo las opciones mostradas");
                        break;
                    
                }
           }catch(InputMismatchException e){
               System.out.println("Porfavor seleccione una opcion valida");
           }catch(IOException em){
               System.out.println("Error con manejo de archivos");
           }catch(NullPointerException el){
               System.out.println("Error");
           }
           
        }while(opc != 4);
        
        
        
        
       
    }
    
}
