/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroJugadores;

import javax.swing.JOptionPane; //Importar la libreria del objeto JOptionPane

/**
 * @author w.sullivan-DAVID GUTIERREZ SOLANO
 * @version Calculator 1.2v
 * @create 2016-03-02
 */
public class ListaJugadores {
    //Atributos de la clase ListaJugadores
    protected RegistroJugadoresNodo primero;    //Puntero primero
    protected RegistroJugadoresNodo ultimo;     //Puntero ultimo
    /**
     * Constructor que inicializa los atributos de la clase
     */
    public ListaJugadores() {
        this.primero = null;
        this.ultimo = null;
    }
    /**
     * Metodod para validar la lista
     * @return si solo si esta vacia
     */
    public boolean esVacia(){return primero==null;}
    /**
     * Metodod para insertar los jugadores
     * @param nombre    recibe el nombre del jugador
     */
//    public void insertar(int numero,String nombre){
//        if(!esVacia()){ //Validacion
//            ultimo.siguiente=new RegistroJugadoresNodo(numero,nombre); //creacion del nodo 
//            ultimo=ultimo.siguiente;    //Enlace del nodo siguiente
//        }else{  
//            primero=ultimo=new RegistroJugadoresNodo(numero,nombre);   //Creacion del nodo
//        }
//    }
//    /**
//     * Metodo para mostrar informacion de los registros de jugadores
//     */
//    public void mostrarLista() {
//        RegistroJugadoresNodo auxiliar = primero;  //Se crea auxiliar para recorrer la lista
//        String mensaje="";  //Variable para capturar las impresiones
//        if (!esVacia()) {   //Validacion de la lista
//            while (auxiliar != null) {
//                mensaje=mensaje+"N° "+auxiliar.numero+" Nombre: "+auxiliar.nombreJugador +"\n";   //Concatenacino de la informacion en lista
//                auxiliar = auxiliar.siguiente;  //Enlace del nodo siguiente
//            }
//            JOptionPane.showMessageDialog(null, "Lista de Jugadores Registrados\n\n"+mensaje,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE); //Impresion en pantalla de la informacion de la lista
//        } else {
//            JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje si no hay datos
//        }
//    }
//    /**
//     * Metodo que elimina el nodo buscado
//     * @param nombre    recibe el nombre a buscar y eliminar
//     */
//    public void eliminaNodoBuscado(String nombre){
//        if(esVacia()){  //Validacion
//            JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje de si no hay datos
//        }else{
//            if(!esVacia()){ //Validacion de la lista
//                if(primero==ultimo && (nombre.equals(primero.nombreJugador))){  //Comprobacion 1
//                    primero=ultimo=null;    //Eliminacion si solo hay un dato
//                }else if(nombre.equals(primero.nombreJugador)){ //Comprobacion 2
//                    primero=primero.siguiente;  //Eliminacion del primer nodo si es este
//                }else{
//                    RegistroJugadoresNodo auxiliar,anterior;    //Declaracion
//                    auxiliar=primero.siguiente; //Asignacion de enlace
//                    anterior=primero;   //Asignacion de nodo
//                    while(auxiliar!=null&&(!auxiliar.nombreJugador.equals(nombre))){ //Comprobacion 3
//                        anterior=anterior.siguiente;    //Enlace deñ puntero
//                        auxiliar=auxiliar.siguiente;    //Enlace del puntero
//                    }
//                    if(auxiliar!=null){ //Comprobacion 4
//                        anterior.siguiente=auxiliar.siguiente;  //Asignacion
//                        if(auxiliar==ultimo){   //Validacion
//                            ultimo=anterior;    //Eliminacion del nodo
//                        }
//                    }
//                }
//            }else{
//                JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje si no hay datos en la lista
//            }
//        }
//    }
    
}
