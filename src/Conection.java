/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SENA
 */
import java.sql.Connection; // Importa la clase Connection de java.sql
//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Conection {
    
//    Conection con; 123456789
    public Connection con; // Cambia el tipo de con a Connection
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/bddeportes";
    
    public void conectar(){
        con = null;
        try{
            Class.forName(Driver); 
            con = DriverManager.getConnection(url, user, pass);
            if(con != null){
                System.out.println("Connection complete");
                JOptionPane.showMessageDialog(null, "Completo conect");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e);
        }
    }
    
    
}