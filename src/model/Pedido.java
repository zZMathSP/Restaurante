/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;



/**
 *
 * @author 38563180894
 */
public class Pedido {
    private Cliente cliente;
    private String data;
    private Funcionario funcionario;
    private int numPedido;
    private Produto produto;

    public Pedido() {
    }

    public Pedido(Cliente cliente, String data, Funcionario funcionario, int numPedido, Produto produto) {
        this.cliente = cliente;
        this.data = data;
        this.funcionario = funcionario;
        this.numPedido = numPedido;
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}