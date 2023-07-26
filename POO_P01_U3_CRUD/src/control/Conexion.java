/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Conexion {
    private static final String drive="com.mysql.jdbc.Drive";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql;//localhost:3306/estudante";
    
    Connection conectar =null;
    public Connection conexion(){
        try {
            Class.forName(drive);
            conectar =(Connection)DriverManager.getConnection(url,user,pass);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null ,"Error de conexion" +e.getMessage() );
        }
        return conectar;
    }
       
}


