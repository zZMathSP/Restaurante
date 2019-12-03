/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Produto;
import java.sql.*;
import factory.ConnectionFactory;

/**
 *
 * @author 38563180894
 */
public class CadastroProdutos {
    private Connection connection;
    
    public CadastroProdutos() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionar(Produto prod) {
        String sql = "INSERT INTO Produto(nome,categoria) VALUES(?,?)";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, prod.getNome());
            stmt.setString(2, prod.getCategoria());
            stmt.execute();
            stmt.close();
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
     //atualiza o cadastro do banco de dados
    public void atualizar(Produto prod) throws SQLException {
        String sql = "update produto set nome=?,categoria=? where nome=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, prod.getNome());
            stmt.setString(2, prod.getCategoria());
            stmt.setString(3, prod.getNome());
            stmt.execute();
            stmt.close();
            connection.close();
        }
    }
    //Função de buscar e excluir foram implementadas na view por conta de dificuldades de serem implementadas no controle.
    
    
}
