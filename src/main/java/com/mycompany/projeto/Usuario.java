/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author Grupo07
 */
public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private int tipo;
    private String nome;
    private String email;
    private String cpf;
    private String sexo;
    private String idade;
    
    //construtor padrão
    Usuario(){}
    
    Usuario(String login, String senha, String nome, String email, String cpf, String sexo, String idade){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        
    } 

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }    
    
    public String getCpf(){
        return cpf;
    }    
    
    public String getSexo(){
        return sexo;
    }    
        
    public String getIdade(){
        return idade;
    }    
        
    public int getTipo(){
        return tipo;
    }
    public void setTipo (int tipo){
        this.tipo = tipo;
    }
}

    

