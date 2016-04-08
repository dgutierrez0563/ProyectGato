/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import VentanaInicio.VentanaInicio; //Se importa el paquete de VentanaInicio
/**
 * @author w.sullivan-DAVID GUTIERREZ SOLANO
 * @version Gato 1.0v
 * @create 2016-03-06
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    //Clase Main
        // TODO code application logic here
        VentanaInicio instanciaWindowStar=new VentanaInicio();    //Creacion del Object instanciaWindowStar para WindowsStar
        instanciaWindowStar.setVisible(true);   //instanciaWindowStar vuelve true la visibilidad del Frame Principal
    }
}
