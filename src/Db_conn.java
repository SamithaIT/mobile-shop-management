
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db_conn {
    
    public static Connection c;
    
    static{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3307/mobile_shop";
            String un="root";
            String pw="12345678";
            c=DriverManager.getConnection("jdbc:mysql://localhost:3307/mobile_shop?useSSl=false", "root", "12345678");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void iud(String query) throws Exception{
        Statement s=c.createStatement();
        s.executeUpdate(query);
        
    }
    public static ResultSet search(String query) throws Exception{
        Statement s=c.createStatement();
        ResultSet rs=s.executeQuery(query);
        return rs;
    }
    
}
