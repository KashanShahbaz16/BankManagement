
package bank.management;
import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            c = DriverManager.getConnection("jdbc:mysql:///BManagement","root","Kashan123");    
            s = c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

