/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.dao;

import br.com.projetoceetsystemsix.connection.DBConnection;
import br.com.projetoceetsystemsix.model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author user
 */
public class FornecedorDao {
    public void salvarFornecedor(Fornecedor fornecedor){
        //conectar com o banco de dados aqui
        String sql = "INSERT INTO fornecedor(razaoSocial, CNPJ, logradouro, complemento, bairro, cidade, UF, telefoneComercial, telefoneCelular, email, Cep) VALUES(?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
         
        try {
            conn = DBConnection.conectarMysql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, fornecedor.getRazaoSocial());
            pstm.setInt(2, fornecedor.getCNPJ());  
            pstm.setString(3, fornecedor.getLogradouro()); 
            pstm.setString(4, fornecedor.getComplemento());
            pstm.setString(5, fornecedor.getBairro());
            pstm.setString(6, fornecedor.getCidade());
            pstm.setString(7, fornecedor.getUF());
            pstm.setInt(8, fornecedor.getTelefoneComercial());
            pstm.setInt(9, fornecedor.getTelefoneCelular()); 
            pstm.setString(10, fornecedor.getEmail());
            pstm.setInt(11, fornecedor.getCep());
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
    public List<Fornecedor> BuscarFornecedore(int idFornecedor){
        //falta verificar se a chave na tabela eh um int 
        return null;
    }
    public List<Fornecedor> BuscarAllFornecedor(){
        return null;
    }
    public void alterarFornecedor(Fornecedor fornecedor){
        //alterar um fornecedor existente existente
    }
}
