package com.soccer.model.entity;

public class Player extends Person {
    private int dorsal;
    private String posicion;
    private int setEdad;
    public Player() {
        super();
    }
    public int getSetEdad() {
		return setEdad;
		
	}
	public void setSetEdad(int setEdad) {
		this.setEdad = setEdad;
		
	}
	public Player(int dorsal, String posicion) {
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    public Player(int id, String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Player [dorsal=" + dorsal + ", posicion=" + posicion + "]";
    }
    
}
