package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;


public class viewCoach {
public static Controller controlador;
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
            
                default:
                    System.out.println("pailas");
                    break;
            }
   
        }



}


}
