package com.mycompany.projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    
    public Usuario existe(Usuario u) throws Exception {
        var sql = "SELECT * FROM tb_usuario_psc_energiaazul WHERE login = ? AND  senha = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());

        var rs = ps.executeQuery();
        var usuarioExiste = rs.next();
        if(usuarioExiste){
            var tipo = rs.getInt("tipo");
            u.setTipo(tipo);
        }
        else{
            u= null;      
        }
        rs.close();
        ps.close();
        conexao.close();
      
          return u;
    }
    
    public void cadastrar(Usuario u) throws Exception{
      var sql = "INSERT INTO tb_usuario_psc_energiaazul (login, senha, nome, email, cpf, sexo, idade, tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?) ";
        
      try(Connection conexao = new ConnectionFactory().conectar();  
            PreparedStatement ps = conexao.prepareStatement(sql)){
           
         ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        ps.setString(3, u.getNome());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getCpf());
        ps.setString(6, u.getSexo());
        ps.setString(7, u.getIdade());
        ps.setInt(8, 1);
        
        
        ps.execute();
        conexao.close();
        }
   
    }
}
