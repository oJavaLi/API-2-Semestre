package com.fullmadagilists.api2semestre.comum;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConexaoBancoDeDados {
    
    public static Connection conector(){

       // Credenciais de acesso banco de dados
        String databaseName = "";
        String databaseUser = "admin";
        String databasepassword = "";
        String url = "";

        // caminho do driver
        String driver = "com.mysql.cj.jdbc.Driver";

        // estabelecendo a conexão com o BD

        java.sql.Connection conexao = null;

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, databaseUser, databasepassword);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;

        }        
    }
    
    public static List<Usuario> usuarios(){
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String usuariosquery = "select * from login_usuarios";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(usuariosquery);
            
            while (resultado.next()){
                Usuario usuario = new Usuario();
                usuario.setMatricula(resultado.getInt("matricula"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setCategoria(resultado.getString("categoria"));
                
                listaUsuarios.add(usuario);
            }
        } catch(Exception e){
            e.printStackTrace();
        } 
        
        return listaUsuarios;
    }
}
        
        
       
