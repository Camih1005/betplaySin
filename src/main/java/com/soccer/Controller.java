package com.soccer;


import java.util.Hashtable;

import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class Controller {
    
    public Hashtable <String,Team> equipos = new Hashtable<>();
    public Hashtable <String,Coach> coach = new Hashtable<>();
    public Hashtable<String,Player> player = new Hashtable<>();
    public Hashtable<String, Team> getEquipos() {
        return equipos;
    }
    public void setEquipos(Hashtable<String, Team> equipos) {
        this.equipos = equipos;
    }
    public Hashtable<String, Coach> getCoach() {
        return coach;
    }
    public void setCoach(Hashtable<String, Coach> coach) {
        this.coach = coach;
    }
    public Hashtable<String, Player> getPlayer() {
        return player;
    }
    public void setPlayer(Hashtable<String, Player> player) {
        this.player = player;
    }
   
   

   
}
