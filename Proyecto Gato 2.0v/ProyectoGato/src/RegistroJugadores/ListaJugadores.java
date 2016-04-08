/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroJugadores;

import javax.swing.JOptionPane; //Importar la libreria del objeto JOptionPane
/**
 * @author w.sullivan-DAVID GUTIERREZ SOLANO
 * @version Gato 1.8v
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
     * Metodod para insertar los jugadores en la lista
     * @param numero recibe el numero del jugador en la lista
     * @param nombre recibe el nombre del jugador
     * @param ganes recibe los ganes del jugador
     * @param perdidas recibe las perdidas del jugador
     * @param empates recibe los empates del jugador
     */
    public void insertar(int numero,String nombre, int ganes, int perdidas, int empates){
        if(!esVacia()){ //Validacion de datos en la lista
            ultimo.siguiente=new RegistroJugadoresNodo(numero,nombre,ganes,perdidas,empates); //creacion del nodo 
            ultimo=ultimo.siguiente;    //Enlace del nodo siguiente
        }else{  //Sentencia si ya hay informacion en la lista
            primero=ultimo=new RegistroJugadoresNodo(numero,nombre,ganes,perdidas,empates);   //Creacion del nodo
        }
    }
    /**
     * Metodo para mostrar informacion de los registros de jugadores
     */
    public void verEstadisticas() {
        RegistroJugadoresNodo auxiliar = primero;  //Se crea auxiliar para recorrer la lista
        String mensaje="";  //Variable para capturar las impresiones
        if (!esVacia()) {   //Validacion de la lista
            while (auxiliar != null) {  //Recorre los datos de la  lista
                //Concatenacion de la informacion en variable
                mensaje=mensaje+"N° "+auxiliar.id+" Nombre: "+auxiliar.nombre +" Ganes: "
                        +auxiliar.ganes+" Perdidas: "+auxiliar.perdidas+" Empates: "+auxiliar.empates+"\n";
                auxiliar = auxiliar.siguiente;  //Enlace del nodo siguiente
            }
            //Impresion en pantalla de la informacion obtenida
            JOptionPane.showMessageDialog(null, "Lista de Jugadores Registrados\n\n"+mensaje,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Mensaje si no hay datos en la lista
            JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void verJugadores(){
        RegistroJugadoresNodo auxiliar = primero;  //Se crea auxiliar para recorrer la lista
        String mensaje="";  //Variable para capturar las impresiones
        if (!esVacia()) {   //Validacion de la lista
            while (auxiliar != null) {  //Recorre los datos de la  lista
                //Concatenacion de la informacion en variable
                mensaje=mensaje+"N°: "+auxiliar.id+"  Nombre: "+auxiliar.nombre+"\n";
                auxiliar = auxiliar.siguiente;  //Enlace del nodo siguiente
            }
            //Impresion en pantalla de la informacion obtenida
            JOptionPane.showMessageDialog(null, "Lista de Jugadores Registrados\n\n"+mensaje,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Mensaje si no hay datos en la lista
            JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /**
     * Metodo que elimina el nodo buscado
     * @param nombre    recibe el nombre a buscar y eliminar
     */
    public void eliminaNodoBuscado(String nombre){
        if(esVacia()){  //Validacion
            JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje de si no hay datos
        }else{
            if(!esVacia()){ //Validacion de la lista
                if(primero==ultimo && (nombre.equals(primero.nombre))){  //Comprobacion 1
                    primero=ultimo=null;    //Eliminacion si solo hay un dato
                    JOptionPane.showMessageDialog(null, "Se elimino al Jugador --> "+nombre,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }else if(nombre.equals(primero.nombre)){ //Comprobacion 2
                    primero=primero.siguiente;  //Eliminacion del primer nodo si es este
                    JOptionPane.showMessageDialog(null, "Se elimino al Jugador --> "+nombre,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    RegistroJugadoresNodo auxiliar,anterior;    //Declaracion
                    auxiliar=primero.siguiente; //Asignacion de enlace
                    anterior=primero;   //Asignacion de nodo
                    while(auxiliar!=null&&(!auxiliar.nombre.equals(nombre))){ //Comprobacion 3
                        anterior=anterior.siguiente;    //Enlace deñ puntero
                        auxiliar=auxiliar.siguiente;    //Enlace del puntero
                    }
                    if(auxiliar!=null){ //Comprobacion 4
                        anterior.siguiente=auxiliar.siguiente;  //Asignacion
                        if(auxiliar==ultimo){   //Validacion
                            ultimo=anterior;    //Eliminacion del nodo
                            JOptionPane.showMessageDialog(null, "Se elimino al Jugador --> "+nombre,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje si no hay datos en la lista
            }
        }
    }
    public void actualizaNodoGana(String nombre){
        if(esVacia()){  //Validacion
            JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje de si no hay datos
        }else{
            if(!esVacia()){ //Validacion de la lista
                if(primero==ultimo && (nombre.equals(primero.nombre))){  //Comprobacion 1
                    primero.ganes=ultimo.ganes=primero.ganes+1;
                }else if(nombre.equals(primero.nombre)){ //Comprobacion 2                    
                    primero.ganes++;                  
                }else{
                    RegistroJugadoresNodo auxiliar,anterior;    //Declaracion
                    auxiliar=primero.siguiente; //Asignacion de enlace
                    //anterior=primero;   //Asignacion de nodo
                    while(auxiliar!=null&&(!auxiliar.nombre.equals(nombre))){ //Comprobacion 3
                        //anterior=anterior.siguiente;    //Enlace deñ puntero
                        //auxiliar=auxiliar.siguiente;    //Enlace del puntero
                        primero.ganes++;  
                    }
                    if(auxiliar!=null){ //Comprobacion 4
                        //anterior.siguiente=auxiliar.siguiente;  //Asignacion
                        if(auxiliar==ultimo){   //Validacion
                            primero.ganes++;
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje si no hay datos en la lista
            }
        }
    }
    public void actualizaNodoPierde(String nombre){

        if(esVacia()){  //Validacion
            JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje de si no hay datos
        }else{
            if(!esVacia()){ //Validacion de la lista
                if(primero==ultimo && (nombre.equals(primero.nombre))){  //Comprobacion 1
                    primero.perdidas=ultimo.perdidas=primero.perdidas+1;                 
                }else if(nombre.equals(primero.nombre)){ //Comprobacion 2
                    primero.perdidas++;
                }else{
                    RegistroJugadoresNodo auxiliar,anterior;    //Declaracion
                    auxiliar=primero.siguiente; //Asignacion de enlace
                    //anterior=primero;   //Asignacion de nodo
                    while(auxiliar!=null&&(!auxiliar.nombre.equals(nombre))){ //Comprobacion 3
                        //anterior=anterior.siguiente;    //Enlace deñ puntero
                        //auxiliar=auxiliar.siguiente;    //Enlace del puntero
                        primero.perdidas++;
                    }
                    if(auxiliar!=null){ //Comprobacion 4
                        //anterior.siguiente=auxiliar.siguiente;  //Asignacion
                        if(auxiliar==ultimo){   //Validacion
                            primero.perdidas++;
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay Datos Registrados","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);  //Mensaje si no hay datos en la lista
            }
        }
    }
    
}
