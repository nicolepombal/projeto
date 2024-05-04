package com.mycompany.projeto;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Grupo07
 */
public class ConnectionFactory {
    String host = "mysql-f5d0f87-greenflow-2024.b.aivencloud.com";
    String port = "19659";
    String user = "avnadmin";
    String password = "AVNS_l-SI38SjvTFIC95lOfI";
    String database = "defaultdb";
    
    Connection conectar() throws Exception{
        
        var stringConexao = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, database
        );
        return DriverManager.getConnection(
            stringConexao, user, password
        );   
    }
}