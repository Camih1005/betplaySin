package com.soccer;

import java.util.Scanner;
import com.soccer.view.viewCoach;
import com.soccer.view.viewPlayer;
import com.soccer.view.viewTeam;

public class Main {
    public static Controller controlador;
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        viewTeam viewTeam = new viewTeam();
        viewCoach viewCoach = new viewCoach();
        viewPlayer viewPlayer = new viewPlayer();
        controlador = new Controller();



        while (true) {
            System.out.println("1. Coach");
            System.out.println("2. Team");
            System.out.println("3. Player");
            System.out.println("4. Salir");
            System.out.println("\nIngrese una opción:\n");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Seleccionaste Coach");
                        viewCoach.start(controlador);
                        break;
                    case 2:
                        System.out.println("Seleccionaste Team");
                        viewTeam.start(controlador);
                        break;
                    case 3:
                        System.out.println("Seleccionaste Player\n");
                        viewPlayer.start();
                        break;
                    case 4:
                        System.out.println("¡Nos vemos!");
                        scanner.close(); // Cerrar el scanner antes de salir
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción inválida, intenta de nuevo.");
                        break;
                }
            } else {
                scanner.nextLine(); // Consumir la entrada inválida
                System.out.println("Por favor ingresa un número válido.");
            }
        }
    }
}
