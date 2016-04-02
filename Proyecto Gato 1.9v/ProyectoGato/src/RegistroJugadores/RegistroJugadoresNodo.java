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
    public int id_Jugadores;
    public String nombre_Jugadores;  //Registro para el jugador
    public String apellido_Jugadores;  //Registro para el jugador
    public int veces_Ganadas;
    public RegistroJugadoresNodo siguiente; //Puntero para el siguiente enlace
    /**
     * Constructor para la clase RegistroJugadoresNodo
     * @param id_Jugadores  recibe el serial
     * @param nombre_Jugadores  recibe el nombre
     * @param veces_Ganadas recibe las veces ganasdas
     */
    public RegistroJugadoresNodo(int id_Jugadores,String nombre_Jugadores, int veces_Ganadas){
        this.id_Jugadores=id_Jugadores;
        this.nombre_Jugadores=nombre_Jugadores;
        this.veces_Ganadas=veces_Ganadas;   
        this.siguiente=null;
    }
     /**
     * Constructor para la clase RegistroJugadoresNodo
     * @param id_Jugadores  recibe el serial
     * @param nombre_Jugadores  recibe el nombre
     * @param veces_Ganadas recibe las veces ganasdas
     */
    public RegistroJugadoresNodo(int id_Jugadores,String nombre_Jugadores,int veces_Ganadas,RegistroJugadoresNodo nodo){
        this.id_Jugadores=id_Jugadores;
        this.nombre_Jugadores=nombre_Jugadores;
        this.veces_Ganadas=veces_Ganadas;   
        this.siguiente=nodo;
    }

//    public RegistroJugadoresNodo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
