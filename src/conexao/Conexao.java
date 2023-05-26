/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author patri
 */
public class Conexao {
    
    public Connection getConexao()
    {
        try {
            //tentar estabelecer a conexao
            Connection conn =  DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Amandita?servetTimezone=UTC", //linha de conexão
                    "root", //user
                    "" //senha
                    );
            return conn;
        } catch (Exception e){
           
            //se der erro, ele vai cair no catch para exibir o erro
            System.out.println("Erro ao conectar" + e.getMessage());
            return null;
        }
    }
    
    
}
