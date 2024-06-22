package com.soccer.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String nombre;
    private String ciudad;
    private List<Player> lstJugadores;
    private List<Coach> lstEntrenadores;

    public Team() {
        lstEntrenadores = new ArrayList<>();
        lstJugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Player> getLstJugadores() {
        return lstJugadores;
    }

    public void setLstJugadores(Player player) {
        this.lstJugadores.add(player);
    }

    public List<Coach> getLstEntrenadores() {
        return lstEntrenadores;
    }

    public void setLstEntrenadores(Coach coach) {
        this.lstEntrenadores.add(coach);
    }

    @Override
    public String toString() {
        return "Team{nombre='" + nombre + "', ciudad='" + ciudad + "', jugadores=" + lstJugadores + ", entrenadores=" + lstEntrenadores + "}";
    }
}
