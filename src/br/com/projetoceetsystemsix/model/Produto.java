/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.model;

/**
 *
 * @author Aluno
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double valorCompra;
    private double valorVenda;
    private int quantidadeEstoque;
    private int quantidadeEstoqueCritico; 
    private String fornecedorProduto; //vamos passar aqui um tipo de id que seja facil recuperar depois
    
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoqueCritico() {
        return quantidadeEstoqueCritico;
    }

    public void setQuantidadeEstoqueCritico(int quantidadeEstoqueCritico) {
        this.quantidadeEstoqueCritico = quantidadeEstoqueCritico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }
     
    
 
}
