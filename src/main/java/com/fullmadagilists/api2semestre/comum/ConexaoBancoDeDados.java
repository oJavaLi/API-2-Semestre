package com.fullmadagilists.api2semestre.comum;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConexaoBancoDeDados {
    
    public static Connection conector(){

        // Credenciais de acesso banco de dados
        String databaseName = "";
        String databaseUser = "";
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
public static List<Apontamentos> apontamentos(){
        List<Apontamentos> listaApontamentos = new ArrayList<Apontamentos>();
        
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String apontamentosquery = "select * from apontamentos";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(apontamentosquery);
            
            while (resultado.next()){
                Apontamentos apontamento = new Apontamentos();
                apontamento.setIdapontamentos(resultado.getInt("idapontamentos"));
                apontamento.setCategoria(resultado.getString("categoria"));
                apontamento.setData_hora_inicio(resultado.getString("data_hora_inicio"));
                apontamento.setData_hora_fim(resultado.getString("data_hora_fim"));
                apontamento.setJustificativa(resultado.getString("justificativa"));
                apontamento.setCliente(resultado.getString("cliente"));
                apontamento.setProjeto(resultado.getString("projeto"));
                apontamento.setSolicitante(resultado.getString("solicitante"));
                apontamento.setCr(resultado.getString("cr"));
                
                listaApontamentos.add(apontamento);
            }
        } catch(Exception e){
            e.printStackTrace();
        } 
        
        return listaApontamentos;
    }

public static void cadastrarApontamentos(){  
    Apontamentos apontamento = new Apontamentos();
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "insert into database_api.apontamentos(idapontamentos, categoria, data_hora_inicio, \n" +
                                            "data_hora_fim, justificativa, cliente, projeto, solicitante, cr) values(?,?,?,?,?,?,?,?,?) ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);
            
            
            stmt1.setInt(1,apontamento.getIdapontamentos());
            stmt1.setString(2,apontamento.getCategoria());
            stmt1.setString(3,apontamento.getData_hora_inicio());
            stmt1.setString(4,apontamento.getData_hora_fim());
            stmt1.setString(5,apontamento.getJustificativa());
            stmt1.setString(6,apontamento.getCliente());
            stmt1.setString(7,apontamento.getProjeto());
            stmt1.setString(8,apontamento.getSolicitante());
            stmt1.setString(9,apontamento.getCr());
            
            stmt1.execute();
            
        } catch(Exception e){
            e.printStackTrace();
        } 

    }


}
       
        
       