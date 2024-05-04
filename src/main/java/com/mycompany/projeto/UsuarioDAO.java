package com.mycompany.projeto;

public class UsuarioDAO {
    
    boolean existe(Usuario u) throws Exception {
        var sql = "SELECT * FROM tb_usuario_psc_energiaazul WHERE login = ? AND  senha = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());

        var rs = ps.executeQuery();
        var usuarioExiste = rs.next();
        rs.close();
        ps.close();
        conexao.close();
          return usuarioExiste;
    }
    
    void cadastrar(Usuario u) throws Exception{
      var sql = "INSERT INTO tb_usuario_psc_energiaazul (login, senha) VALUES(?, ?) ";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());

            ps.execute();
            conexao.close();
    }
}
