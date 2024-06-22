package com.soccer.view;

import com.soccer.model.entity.Player;

public class viewPlayer {
       Player jugador = new Player();
       public void start() {

              while (true) {
                     System.out.println("1. Agregar jugador");
            System.out.println("2. Informacion del jugador");
            System.out.println("3. Actualizar informacion del jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Listar todos los jugadores");
            System.out.println("6. Salir\n\n========================================================="); 
              }
       }
}
