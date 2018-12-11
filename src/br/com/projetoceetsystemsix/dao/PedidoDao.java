/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.dao;

import br.com.projetoceetsystemsix.model.Pedido;
import java.util.List;

/**
 *
 * @author user
 */
public class PedidoDao {
    public void salvarPedido(Pedido pedido){
        //conectar com o banco de dados aqui
        
    }
    public List<Pedido> BuscarPedido(int idPedido){
        //falta verificar se a chave na tabela eh um int 
        return null;
    }
    public List<Pedido> BuscarAllPedido(){
        return null;
    }
    public void alterarPedido(Pedido pedido){
        //alterar um pedido existente
    }
}
