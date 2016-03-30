/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroJugadores;
/**
 * @author w.sullivan-DAVID GUTIERREZ SOLANO
 * @version Calculator 1.2v
 * @create 2016-03-02
 */
public class RegistroJugadoresNodo {
    //Atributos de la Clse RegistroJugadores
    public int numero;
    public String nombreJugador;  //Registro para el jugador
    public RegistroJugadoresNodo siguiente; //Puntero para el siguiente enlace
    /**
     * Constructor para la clase 
     * @param numeroA   recibe el numero de campo
     * @param jugadorA registra el nombre dle jugador a insertar
     */
    public RegistroJugadoresNodo(int numeroA,String jugadorA){
        this.numero=numeroA;
        this.nombreJugador=jugadorA;    
        this.siguiente=null;
    }
    /**
     * Constructor que recibe los datos si ya los hay
     * @param numeroS Recibe el numero de campo
     * @param jugador recibe el nombre del jugador a insertar si ya existe
     * @param nodo  recibe el nodo existente
     */
    public RegistroJugadoresNodo(int numeroS,String jugador,RegistroJugadoresNodo nodo){
        this.numero=numeroS;
        this.nombreJugador=jugador;
        this.siguiente = nodo; //Enlace siguiente sera el nodo que hay
    }
}
