
package car.sales.and.inventories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class databaseconnection {
   
   final static String JDBC_DRIVER=("oracle.jdbc.driver.OracleDriver");
   
  final static String DB_URL =("jdbc:oracle:thin:@//localhost:1521");
   final static String USER="CARSALE";
   final static String PASS="123";
   public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn=DriverManager.getConnection(DB_URL, USER,PASS);
            return conn;
       }catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e );
       }
      return null;
    }
   
}
