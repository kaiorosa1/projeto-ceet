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
public class ClienteJuridico extends Cliente{
    private String razaoSocial;
    private int CNPJ;
    private int telefoneComercial; 

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(int telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }
     
    
    
    
}
