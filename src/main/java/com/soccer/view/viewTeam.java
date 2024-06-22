package com.soccer.view;


import java.util.Scanner;
import com.soccer.Controller;
import com.soccer.model.entity.Team;


public class viewTeam {
    public static Controller controlador;
    public void start() {
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar todos Equipos");
            System.out.println("6. Salir\n\n=========================================================");
            

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
            scanner.nextLine();
            
            Team equipo = new Team();
            switch (choice) {
                
                case 1:
                        
                        String codigoEquipo = null;
                        System.out.println("Ingrese el codigo del equipo :");
                        codigoEquipo = scanner.nextLine();
                        System.out.println("Ingrese Nombre del equipo :");
                        equipo.setNombre(scanner.nextLine());
                        System.out.println("Ingrese la ciudad :");
                        equipo.setCiudad(scanner.nextLine());
                        controlador.equipos.put(codigoEquipo, equipo);
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
                System.out.println("Lista de todos los equipos:");
                   System.out.println("Listado de todos los Equipos:");
                    for (String key : controlador.equipos.keySet()) {
                    Team equipos = controlador.equipos.get(key);
                    System.out.println("Código: " + key + " Nombre: " + equipos.getNombre() + " ciudad :"+ equipos.getCiudad());
                    }
                    break;

                case 6:
                    System.out.println("Ten buen dia!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
               
                    System.out.println("Opcion invalida, intentelo de nuevo.\n\n");
              
                    
            }
        }else {
           
            scanner.nextLine(); 
            System.out.println(" Por favor ingresa un número.\n\n");
        }
    }
}
}