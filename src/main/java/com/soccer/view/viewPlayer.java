package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class viewPlayer {
    public static Controller controlador;
    Player jugador = new Player();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String codigoJugador = null;

        while (true) {
            System.out.println("1. Agregar jugador");
            System.out.println("2. Informacion del jugador");
            System.out.println("3. Actualizar informacion del jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Listar todos los jugadores");
            System.out.println("6. Salir\n\n=========================================================");
            System.out.println("Opcion:");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.println("Ingrese el codigo del jugador:");
                        codigoJugador = scanner.nextLine();

                        if (controlador.player.containsKey(codigoJugador)) {
                            System.out.println("El código de jugador ya está en uso. Intente con otro código.");
                            return;
                        }

                        try {
                            Player player = new Player();

                            System.out.println("Ingrese Nombre: ");
                            player.setNombre(scanner.nextLine());

                            System.out.println("Ingrese Apellido: ");
                            player.setApellido(scanner.nextLine());

                            System.out.println("Ingrese la edad:");
                            player.setEdad(scanner.nextInt());
                            scanner.nextLine(); 

                            System.out.println("Ingrese Dorsal: ");
                            player.setDorsal(scanner.nextInt());
                            scanner.nextLine(); 

                            System.out.println("Ingrese la posicion: ");
                            player.setPosicion(scanner.nextLine());

                            System.out.println("Ingrese el código del equipo al que pertenece el jugador: ");
                            String codigoEquipo = scanner.nextLine();
                            Team equipo = controlador.equipos.get(codigoEquipo);

                            if (equipo != null) {
                                equipo.setLstJugadores(player);
                                controlador.player.put(codigoJugador, player);
                                System.out.println("Jugador asignado al equipo: " + equipo.getNombre());
                            } else {
                                System.out.println("Equipo no encontrado.");
                            }

                        } catch (Exception e) {
                            System.out.println("Error al ingresar datos: " + e.getMessage());
                        }

                        break;

                    case 2:
                        // Llamar al método actualizar
                        actualizar(scanner);
                        break;

                    case 3:
                        System.out.println("Ingrese el código del jugador para ver información:");
                        codigoJugador = scanner.nextLine();
                        Player jugador = controlador.player.get(codigoJugador);
                        if (jugador != null) {
                            System.out.println("Información del jugador: " + jugador);
                        } else {
                            System.out.println("Jugador no encontrado.");
                        }
                        break;

                    case 4:
                        System.out.println("Ingrese el código del jugador a eliminar:");
                        codigoJugador = scanner.nextLine();
                        if (controlador.player.containsKey(codigoJugador)) {
                            controlador.player.remove(codigoJugador);
                            System.out.println("Jugador eliminado correctamente.");
                        } else {
                            System.out.println("Jugador no encontrado.");
                        }
                        break;

                    case 5:
                        System.out.println("Listado de todos los Jugadores:");
                        for (String key : controlador.player.keySet()) {
                            Player jugadorListado = controlador.player.get(key);
                            System.out.println("Código jugador: " + key + ", Nombre: " + jugadorListado.getNombre() + ", Apellido: " + jugadorListado.getApellido());
                        }
                        break;

                    case 6:
                        System.out.println("¡Ten buen día!");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opción inválida, inténtelo de nuevo.\n\n");
                        break;
                }
            } else {
                System.out.println("Por favor ingresa un número válido.\n\n");
                scanner.nextLine(); // Limpiar la entrada inválida
            }
        }
    }

    public static void actualizar(Scanner scanner) {
        System.out.println("1. Actualizar Nombre");
        System.out.println("2. Actualizar Apellido");
        System.out.println("3. Actualizar Edad");
        System.out.println("4. Actualizar Dorsal");
        System.out.println("5. Actualizar Posicion");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()

        System.out.println("Ingrese el codigo del jugador a actualizar:");
        String codigoJugador = scanner.nextLine();

        if (!controlador.player.containsKey(codigoJugador)) {
            System.out.println("Jugador no existe.");
            return;
        }

        Player jugador = controlador.player.get(codigoJugador);

        switch (choice) {
            case 1:
                System.out.println("Ingrese el nombre a actualizar");
                jugador.setNombre(scanner.nextLine());
                System.out.println("Nombre actualizado");
                break;

            case 2:
                System.out.println("Ingrese el Apellido a actualizar");
                jugador.setApellido(scanner.nextLine());
                System.out.println("Apellido actualizado");
                break;

            case 3:
                System.out.println("Ingrese la edad a actualizar");
                jugador.setEdad(scanner.nextInt());
                scanner.nextLine(); // Consumir la nueva línea después de nextInt()
                System.out.println("Edad actualizada");
                break;

            case 4:
                System.out.println("Ingrese el dorsal a actualizar");
                jugador.setDorsal(scanner.nextInt());
                scanner.nextLine(); // Consumir la nueva línea después de nextInt()
                System.out.println("Dorsal actualizado");
                break;

            case 5:
                System.out.println("Ingrese la posición a actualizar");
                jugador.setPosicion(scanner.nextLine());
                System.out.println("Posición actualizada");
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
