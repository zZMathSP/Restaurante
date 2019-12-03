/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.*;
import java.sql.*;
import factory.ConnectionFactory;

/**
 *
 * @author 38563180894
 */
public class CadastroPedido {
    private Connection connection;
        
    public CadastroPedido() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionar(Pedido pedido) {
        String sql = "INSERT INTO Pedido() VALUES()";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pedido.getData());
            stmt.setObject(2, pedido.getFuncionario());
            stmt.execute();
            stmt.close();
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
