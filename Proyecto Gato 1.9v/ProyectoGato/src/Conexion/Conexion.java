/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import RegistroJugadores.RegistroJugadoresNodo;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author w.sullivan-DAVID GUTIERREZ SOLANO
 * @version Gato 1.0v
 * @create 2016-03-06
 */
public class Conexion {

    String conexionURL = "jdbc:postgresql://localhost:5432/DBGATO";
    String user = "postgres";
    String pass = "123";
    /**
     * Metodo para la coneccion de la base de datos
     */
    public void conexionDataBase() {
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conexion = DriverManager.getConnection(pass, user, pass)) {
                java.sql.Statement instanciaConexion=conexion.createStatement();
                String tableSql="SELECT ID_JUGADORES,NOMBRE_JUGADORES,VECES_GANADAS";
                ResultSet resultado=instanciaConexion.executeQuery(tableSql);
                while(resultado.next()){
                    String id_Jugadores=resultado.getString("ID_JUGADORES");
                    String nombre_Jugadores=resultado.getString("NOMBRE_JUGADORES");
                    String veces_Ganadas=resultado.getString("VECES_GANADAS");
                    JOptionPane.showMessageDialog(null,"Informacion de Jugadores\n"+"\nN°: "+id_Jugadores+"\nNombre Jugador: "+nombre_Jugadores+"\nGanes: "+veces_Ganadas+"\n","Consulta de Datos",JOptionPane.INFORMATION_MESSAGE);
                    
                }
                resultado.close();
                instanciaConexion.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ha Ocurrido Un problema con la Conexion\n"+e.getMessage(),"Error de Conexcion",JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Metodo que realiza el registro de los datos
     * @param id Indetificador
     * @param nombre Nombre ugadores
     * @param ganes Veces ganadas
     * @return
     */
    public RegistroJugadoresNodo jugadores(int id,String nombre,int ganes){
        RegistroJugadoresNodo informacion=new RegistroJugadoresNodo(id,nombre,ganes);
        informacion.id_Jugadores=id;
        informacion.nombre_Jugadores=nombre;
        informacion.veces_Ganadas=ganes;
        registroJugadores(informacion);
        return informacion;
    }
    /**
     * Metodo que inserta los datos o informacione en la base de datos
     * @param informacion
     */
    public void registroJugadores(RegistroJugadoresNodo informacion){
        try{
            Connection conexion=(Connection) DriverManager.getConnection(conexionURL, user, pass);
            Statement query=(Statement) conexion.createStatement();
            query.executeUpdate("insert into Schemas.Jugadores(ID_JUGADORES,NOMBRE_JUGADORES,VECES_GANADAS)"+"values('"+informacion.id_Jugadores+","+informacion.nombre_Jugadores+","+informacion.veces_Ganadas+")");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha Ocurrido Un problema con la Conexion\n"+e.getMessage(),"Error de Conexcion",JOptionPane.ERROR_MESSAGE);
        }
    }

   
    
}
