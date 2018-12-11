/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.dao;

import br.com.projetoceetsystemsix.connection.DBConnection;
import br.com.projetoceetsystemsix.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author user
 */
public class ProdutoDao {
    public void salvarProduto(Produto produto){
        //conectar com o banco de dados aqui
        String sql = "INSERT INTO Poduto(nome,descricao,valorCompra,valorVenda,quantidadeEstoque)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = DBConnection.conectarMysql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setDouble(3, produto.getValorCompra());
            pstm.setDouble(4, produto.getValorVenda());
            pstm.setInt(5, produto.getQuantidadeEstoque());
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
    public List<Produto> BuscarProduto(int idProduto){
        return null;
    }
    public List<Produto> BuscarAllProduto(){
        return null;
    }
    public void alterarProduto(Produto produto){
        //alterar um produto existente
    }
}
