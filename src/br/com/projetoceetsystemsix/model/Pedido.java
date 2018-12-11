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
public class Pedido {
    private int id;
    private int quantidade;
    private double valorTotal; 
    private String produtoPedido; // deveria ser uma lista de produtos 

    public String getProdutoPedido() {
        return produtoPedido;
    }

    public void setProdutoPedido(String produtoPedido) {
        this.produtoPedido = produtoPedido;
    }

    public String getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(String clientePedido) {
        this.clientePedido = clientePedido;
    }
    private String clientePedido; 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
     
    
}
