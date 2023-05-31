/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author patri
 */
public class Conexao {
    
    public Connection getConexao()
    {
        try {
        //tentar estabelecer conexão
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/amandita?serverTimezone=UTC", //linha da conexão 
                "root", // usuario do mysql
                "" //senha do mysql
        );
        return conn;
        }  catch (SQLException e){
        //caso não estabeleça cai nesse catch
            System.out.println(e.getMessage() + "Erro ao conectar ao banco");
            return null;
        }
     }
}