/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.dao;

import br.com.projetoceetsystemsix.model.Produto;
import java.util.List;

/**
 *
 * @author user
 */
public class ProdutoDao {
    public void salvarProduto(Produto produto){
        //conectar com o banco de dados aqui
        
        /*
        INSERT INTO Poduto(nome,descricao,valorCompra,valorVenda,quantidadeEstoque)
        */
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
