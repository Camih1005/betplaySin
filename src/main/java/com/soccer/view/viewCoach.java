package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Team;


public class viewCoach {
public static Controller controlador = new Controller();
public void start(){
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("1. Crear Coach");
            System.out.println("2. Actualizar Coach");
            System.out.println("3. Buscar Coach");
            System.out.println("4. Eliminar Coach");
            System.out.println("5. Listar todos los Coach");
            System.out.println("6. Salir\n\n=========================================================");

            int choice = scanner.nextInt();
            Coach coach = new Coach();
            scanner.nextLine();
            switch (choice) {
                case 1:
                String codigoCoach = null;
                System.out.println("Ingrese el codigo del coach :");
                codigoCoach = scanner.nextLine();
                System.out.println("Ingrese Nombre del coach :");
                coach.setNombre(scanner.nextLine());
                System.out.println("Ingrese Apellido del coach :");
                coach.setApellido(scanner.nextLine());
                System.out.println("Ingrese edad del coach :");
                coach.setEdad(scanner.nextInt());
                System.out.println("Ingrese idFederacion del coach :");
                coach.setIdFederacion(scanner.nextInt());
                controlador.coach.put(codigoCoach, coach);

                    break;

                    case 2:
                    System.out.println("Ingrese el codigo del coach a actualizar:");
                    codigoCoach= scanner.nextLine();
                    coach = controlador.coach.get(codigoCoach);
                    if (coach != null) {
                        System.out.println("Ingrese nuevo Nombre del coach:");
                        coach.setNombre(scanner.nextLine());
                        System.out.println("Ingrese nueva Apellido:");
                        coach.setApellido(scanner.nextLine());
                        System.out.println("Ingresa edad: ");
                        coach.setEdad(scanner.nextInt());
                        System.out.println("Ingresa idFederacion: ");
                        coach.setIdFederacion(scanner.nextInt());
                        controlador.coach.put(codigoCoach, coach);
                        System.out.println("coach actualizado: " + coach);
                    } else {
                        System.out.println("Equipo no encontrado.");
                    }
                    break;
                    case 3:
                    System.out.println("Ingrese el codigo del coach: ");
                    codigoCoach = scanner.nextLine();
                    coach = controlador.coach.get(codigoCoach);
                    if(coach != null) {
                        System.out.println("coach: " + coach);
                        }else{
                            System.out.println("\n\ncoach no existe XXXXX\n****************************");
                        }
                        continue;

                      case 4:

                      System.out.println("Ingrese el codigo del coach: ");
                      codigoCoach = scanner.nextLine();
                      coach = controlador.coach.get(codigoCoach);
                          if(controlador.coach.contains(coach)){
                              controlador.coach.remove(codigoCoach);
                              System.out.println("Coach  eliminado: " + coach);
                          }
                          else{
                              System.out.println("\n\nequipo no existe\n");
                          }
                          break;

                          case 5:
                          System.out.println("Lista de todos los coach:");
                    for (String key : controlador.coach.keySet()) {
                    coach = controlador.coach.get(key);
                    System.out.println("Código: " + key + " Nombre: " + coach.getNombre() + " Apellido :"+ coach.getApellido());
                    }
                    break;

                default:
                    System.out.println("pailas");
                    break;
            }
   
        }



}


}
