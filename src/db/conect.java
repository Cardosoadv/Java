package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class conect {
    public Connection getConect(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java?serverTimeZone=UTC", "root", "");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar"+e.getMessage());
            return null;
        }

    }
}
