package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi_db {
    
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null){
            try{
                String url="jdbc:mysql://localhost:3306/db_4sia";
                String user="root";
                String password="";
                DriverManager.registerDriver(
                 new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password);
                }catch (SQLException t){
                    System.out.println("ERROR MEMBUAT KONEKSI");
            }
        }
        return koneksi;
    }
    
}
