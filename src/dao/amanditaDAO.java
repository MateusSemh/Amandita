/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Usuarios;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class amanditaDAO {

    private final Conexao conexao;
    Connection conn;

    public ResultSet autenticacaoUsuario(Usuarios objusuarioBeans) {
        conn = new Conexao().getConexao();

        try {
            //criando select no banco para verificar se usuário existe
            String sql = "select * from usuarios where nome = ? and senha = ?";
            // preparando conexão com o banco
            PreparedStatement pstm = conn.prepareStatement(sql);
            // setando nos 2 parametros do select qual get usar da Usuarios
            pstm.setString(1,objusuarioBeans.getNome());
            pstm.setString(2, objusuarioBeans.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "amanditaDAO" + erro);
            return null;
        }
    }

//Construtor da Classe, executado automaticamente sempre que um novo obj é criado.
    public amanditaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Usuarios usuarios) {
        String sql = "INSERT INTO Usuarios(telefone,nome,senha) VALUES (?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, usuarios.getTelefone());
            stmt.setString(2, usuarios.getNome());
            stmt.setString(3, usuarios.getSenha());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar usuario: " + e.getMessage());
        }
    }
}
