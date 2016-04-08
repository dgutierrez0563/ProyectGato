/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroJugadores;
/**
 * @author w.sullivan-DAVID GUTIERREZ SOLANO
 * @version Gato 1.8v
 * @create 2016-03-02
 */
public class RegistroJugadoresNodo {
//Atributos de la Clse RegistroJugadores
    public int id;
    public String nombre;  //Registro para el jugador
    public int ganes;   //Registro de los ganes del jugador
    public int perdidas;//Registro de las perdidas del jugador
    public int empates; //Registro de los empates del jugador
    public RegistroJugadoresNodo siguiente; //Puntero para el siguiente nodo
    /**
     * Constructor para la clase RegistroJugadoresNodo
     * @param numeroA   recibe el numero de campo
     * @param jugadorA registra el nombre dle jugador a insertar
     * @param ganesA registra losganes del jugador
     * @param perdidasA registra las perdidas del jugador
     * @param empatesA  registra los empates del jugador
     */
    public RegistroJugadoresNodo(int numeroA,String jugadorA,int ganesA, int perdidasA, int empatesA){
        this.id=numeroA;
        this.nombre=jugadorA; 
        this.ganes=ganesA;
        this.perdidas=perdidasA;
        this.empates=empatesA;
        this.siguiente=null;
    }
    /**
     * Constructor que recibe los datos si ya hay existentes
     * @param numero recibe el indice del jugador
     * @param nombreJugador recibe el nombre del jugador
     * @param ganes recibe los ganes del jugador
     * @param perdidas recibe las perdidas del jugador
     * @param empates recibe los empates del jugador
     * @param nodo recibe el nodo siguiente
     */
    public RegistroJugadoresNodo(int numero, String nombreJugador, int ganes, int perdidas, int empates, RegistroJugadoresNodo nodo) {
        this.id = numero;
        this.nombre = nombreJugador;
        this.ganes = ganes;
        this.perdidas = perdidas;
        this.empates = empates;
        this.siguiente = nodo;  //Enlace siguiente sera el nodo que hay
    }   
}
