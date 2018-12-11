/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.dao;

import br.com.projetoceetsystemsix.model.Cliente;
import java.util.List;

/**
 *
 * @author user
 */
public class CienteDao {
    public void salvarCliente(Cliente cliente){
        //conectar com o banco de dados aqui
        
    }
    public List<Cliente> BuscarCliente(int idCliente){
        //falta verificar se a chave na tabela eh um int 
        return null;
    }
    public List<Cliente> BuscarAllCliente(){
        return null;
    }
    public void alterarCliente(Cliente cliente){
        //alterar um cliente existente
    }
}
