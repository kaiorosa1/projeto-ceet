/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.dao;

import br.com.projetoceetsystemsix.connection.DBConnection;
import br.com.projetoceetsystemsix.model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author user
 */
public class ClienteDao {
    public void salvarCliente(Cliente cliente){
        //falta some arrengents
        String sql = "INSERT INTO cliente(nome, endereco, bairro, clienteDesde, telefoneCelular, email) VALUES(?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        //difereciar se eh fisico ou juridico antes de inserir
        try {
            conn = DBConnection.conectarMysql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getEndereco());  
            pstm.setString(3, cliente.getBairro()); 
            pstm.setDate(4, (Date) cliente.getClienteDesde());
            pstm.setInt(5, cliente.getTelefoneCelular());
            pstm.setString(6, cliente.getEmail());
            
            pstm.setString(4, sql);
            pstm.execute();
            
        } catch (Exception e) {
            
            e.getMessage();
        }finally{
            try {
                if(pstm!=null){
                    pstm.close();
                }
            } catch (Exception e) {
            }
        }
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
