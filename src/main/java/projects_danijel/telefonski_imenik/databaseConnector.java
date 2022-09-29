package projects_danijel.telefonski_imenik;
import java.sql.*;

public class databaseConnector {
    class MysqlCon{
        public static void main(String args[]){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/my_local_instance","root","6stranicaknjige");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from contats");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
    }
}
