package appempresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/empresa", 
                    "empresa", 
                    "empresa");
            System.out.println("Conectado!");
            return conexao;
        } catch (SQLException ex) {
            System.out.println("Falha na conexao!" + ex);
        }
        return null;
    }
}
