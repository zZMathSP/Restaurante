/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Funcionario;
import java.sql.*;
import factory.ConnectionFactory;

/**
 *
 * @author 38563180894
 */
public class CadastroFuncionarios {
    private Connection connection;
    
    public CadastroFuncionarios() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionar(Funcionario func) {
        String sql = "INSERT INTO pessoa(nome,cpf,telefone,numCarteira,numTrabalhos) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, func.getNome());
            stmt.setString(2, func.getCpf());
            stmt.setString(3, func.getTelefone());
            stmt.setInt(4, func.getNumCarteira());
            stmt.setInt(5, func.getNumTrabalhos());
            stmt.execute();
            stmt.close();
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    //atualiza o cadastro do banco de dados
    public void atualizar(Funcionario func) throws SQLException {
        String sql = "update pessoa set nome=?,cpf=?,telefone=?,numCarteira=?,numTrabalhos=? where cpf=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, func.getNome());
            stmt.setString(2, func.getCpf());
            stmt.setString(3, func.getTelefone());
            stmt.setInt(4, func.getNumCarteira());
            stmt.setInt(5, func.getNumTrabalhos());
            stmt.setString(6, func.getCpf());
            stmt.execute();
            stmt.close();
            connection.close();
        }
    }
    //Função de buscar e excluir foram implementadas na view por conta de dificuldades de serem implementadas no controle.

}
