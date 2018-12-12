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
       
        String sql = "INSERT INTO produto(id,nome,descricao,valorCompra,valorVenda,quantidadeEstoque,quantidadeEstoqueCritico) VALUES(?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = DBConnection.conectarMysql();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, produto.getId());
            pstm.setString(2, produto.getNome());
            pstm.setString(3, produto.getDescricao());
            pstm.setDouble(4, produto.getValorCompra());
            pstm.setDouble(5, produto.getValorVenda());
            pstm.setInt(6, produto.getQuantidadeEstoque());
            pstm.setInt(7, produto.getQuantidadeEstoqueCritico());
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
