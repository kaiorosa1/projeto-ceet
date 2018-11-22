/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoceetsystemsix;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Venda {
    private int id;
    private Date dataVenda;
    private double valorSugerido;
    private double desconto;
    private double totalVenda;
    private double parcela;
    private int jurosMensal; 
    private Pedido pedidoVenda; // acertar essas ligacoes no diagrama de classe
    
    //Fazer as ligacoes entre as classes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorSugerido() {
        return valorSugerido;
    }

    public void setValorSugerido(double valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getParcela() {
        return parcela;
    }

    public void setParcela(double parcela) {
        this.parcela = parcela;
    }

    public int getJurosMensal() {
        return jurosMensal;
    }

    public void setJurosMensal(int jurosMensal) {
        this.jurosMensal = jurosMensal;
    }
     
    
    
    
}
