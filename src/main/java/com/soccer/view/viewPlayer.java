package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class viewPlayer {
       public Controller controlador;
       Player jugador = new Player();
       public void start() {
              Scanner scanner = new Scanner(System.in);
              while (true) {
                     System.out.println("1. Agregar jugador");
            System.out.println("2. Informacion del jugador");
            System.out.println("3. Actualizar informacion del jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Listar todos los jugadores");
            System.out.println("6. Salir\n\n========================================================="); 
            System.out.println("Opcion:");
              }

              if (scanner.hasNextInt() ) {
                     int choice = scanner.nextInt();
                 scanner.nextLine();
                 
                 Player player = new Player();
                 //por defecto esta este equipo
                 // equipo.setNombre("Atletico");
                 // equipo.setCiudad("Bucaramanga");
                 // controlador.equipos.put("09", equipo);
     
                 switch (choice) {
                     case 1:
                     String codigoJugador = null; 
         System.out.println("Ingrese el codigo del jugador:");
         codigoJugador = scanner.nextLine();
         
         // Verificar si el equipo ya existe
         if (controlador.equipos.containsKey(codigoJugador)) {
             System.out.println("El código de jugador ya está en uso. Intente con otro código.");
             break;
         }
     
     
        
     
         try {
             System.out.println("Ingrese Nombre: ");
             player.setNombre(scanner.nextLine());
             
             System.out.println("Ingrese Apellido: ");
             player.setApellido(scanner.nextLine());
             
             System.out.println("Ingrese la edad:");
             player.setSetEdad(scanner.nextInt());
             
             System.out.println("Ingrese la ciudad:");
             player.setApellido(scanner.nextLine());

             System.out.println("Ingrese Dorsal: ");
             player.setDorsal(scanner.nextInt());

             System.out.println("Ingrese la posicion: ");
             player.setPosicion(scanner.nextLine());

             System.out.println("Ingrese al equipo que pertenece el jugador: ");
             
              Team team = controlador.team.get(codigoEquipo);
             if (coach != null) {
                 jugador.setLstEntrenadores(coach);
                 controlador.equipos.put(codigoCoach, equipo);
                 System.out.println("Entrenador asignado al equipo: " + equipo);
                 
             } else {
                 System.out.println("Entrenador no encontrado.");
             }
             
             
             
         } catch (Exception e) {
             System.out.println("Error al ingresar datos: " + e.getMessage());
         }
         
         break;
     
                     case 2:
     
                         
                         System.out.println("Ingrese el codigo del equipo a actualizar:");
                         codigoEquipo = scanner.nextLine();
                         equipo = controlador.equipos.get(codigoEquipo);
                         if (equipo != null) {
                             System.out.println("Ingrese nuevo Nombre del equipo:");
                             equipo.setNombre(scanner.nextLine());
                             System.out.println("Ingrese nueva ciudad:");
                             equipo.setCiudad(scanner.nextLine());
                             controlador.equipos.put(codigoEquipo, equipo);
                             System.out.println("Equipo actualizado: " + equipo);
                         } else {
                             System.out.println("Equipo no encontrado.");
                         }
                         break;
     
                     case 3:
                     System.out.println("Ingrese el codigo del equipo: ");
                     codigoEquipo = scanner.nextLine();
                     equipo = controlador.equipos.get(codigoEquipo);
                         if(equipo != null) {
                             System.out.println("equipo: " + equipo);
                       
                         }else{
                             System.out.println("\n\nequipo no existe XXXXX\n****************************");
                         }
                        
                         break;
                     case 4:
                     System.out.println("Ingrese el codigo del equipo: ");
                     codigoEquipo = scanner.nextLine();
                     equipo = controlador.equipos.get(codigoEquipo);
                         if(controlador.equipos.contains(equipo)){
                             controlador.equipos.remove(codigoEquipo);
                             System.out.println("Equipo eliminado: " + equipo);
                         }
                         else{
                             System.out.println("\n\nequipo no existe\n");
                         }
                         break;
     
                     case 5:
                        System.out.println("Listado de todos los Equipos:");
                        for (String key : controlador.equipos.keySet()) {
                         Team equipos = controlador.equipos.get(key);
                         System.out.println("Código equipo: " + key + " Nombre: " + equipos.getNombre() + " ciudad :"+ equipos.getCiudad() + " tecnico: " + equipos.getLstEntrenadores());
                         }
                         
                        
                     
                         break;
     
                     case 6:
                         System.out.println("Ten buen dia!");
                         scanner.close();
                         System.exit(0);
                         break;
     
                         case 7:
                         System.out.println("Ingresando al menu principal\n");
                         return;
     
                     default:
                    
                         System.out.println("Opcion invalida, intentelo de nuevo.\n\n");
                   
                         
                 }
             }else {
                
                 scanner.nextLine(); 
                 System.out.println(" Por favor ingresa un número.\n\n");
             }
         }
     }
     
