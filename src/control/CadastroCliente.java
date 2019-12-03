package control;

import model.Cliente;
import java.sql.*;
import factory.ConnectionFactory;

/**
 *
 * @author 38563180894
 */
public class CadastroCliente {
    private Connection connection;
    
    public CadastroCliente() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    //adiciona um cliente novo no banco de dados.
    public void adicionar(Cliente cli) throws SQLException {
        String sql = "insert into pessoa(nome,cpf,telefone,endereco) values(?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getCpf());
            stmt.setString(3, cli.getTelefone());
            stmt.setString(4, cli.getEndereco());
            stmt.execute();
            stmt.close();
            connection.close();
        }
        // JOptionPane.showMessageDialog(this, "Cliente Cadastrado com Sucesso!");
        // this.dispose();
        //JOptionPane.showMessageDialog(this e);
    }
    
    //atualiza o cadastro do banco de dados
    public void atualizar(Cliente cli) throws SQLException {
        String sql = "update pessoa set nome=?,cpf=?,telefone=?,endereco=? where cpf=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getCpf());
            stmt.setString(3, cli.getTelefone());
            stmt.setString(4, cli.getEndereco());
            stmt.setString(5, cli.getCpf());
            stmt.execute();
            stmt.close();
            connection.close();
        }
    }
    //Função de buscar e excluir foram implementadas na view por conta de dificuldades de serem implementadas no controle.
}