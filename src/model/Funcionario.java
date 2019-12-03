/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 38563180894
 */
public class Funcionario extends Pessoa{
    private int numCarteira;
    private int numTrabalhos;
    private boolean disponivel;


    public Funcionario(int numCarteira, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.numCarteira = numCarteira;
    }

    public int getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(int numCarteira) {
        this.numCarteira = numCarteira;
    }

    public int getNumTrabalhos() {
        return numTrabalhos;
    }

    public void setNumTrabalhos(int numTrabalhos) {
        this.numTrabalhos = numTrabalhos;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void comecarTrabalho() {
        setDisponivel(true);
    }
    
    public void encerrarTrabalho() {
        setDisponivel(false);
        this.numTrabalhos++;
    }
    
    @Override
    public String getCpf() {
        return this.cpf;
    }
    
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + super.getNome() + ",numCarteira=" + numCarteira + ", numTrabalhos=" + numTrabalhos + ", disponivel=" + disponivel + '}';
    }
}
