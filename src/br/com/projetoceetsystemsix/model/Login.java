/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoceetsystemsix.model;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Aluno
 */
public class Login {
    private int id;
    private String username = "admin";
    private String senha = "admin"; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 
     
    
     
    
}
