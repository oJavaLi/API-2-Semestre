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
    private static Connection conexao = null;
    
    public static Connection conector(){
        // Credenciais de acesso banco de dados
        String databaseName = "";
        String databaseUser = "";
        String databasepassword = "";
        String url = "";

        // caminho do driver
        String driver = "com.mysql.cj.jdbc.Driver";

        // estabelecendo a conexão com o BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, databaseUser, databasepassword);
            System.out.println(conexao);
        } catch (Exception e) {
            System.out.println(e);
            
        }
       
        return conexao;
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
    public static void cadastrarUsuario(Usuario usuario){  
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "insert into database_api.apontamentos(matricula, nome, \n" +
                                            "senha, categoria) values(?,?,?,?) ";
            PreparedStatement stmt2 = conexao.prepareStatement(cadApontamentosquery);
            
            stmt2.setInt(1,usuario.getMatricula());
            stmt2.setString(2,usuario.getNome());
            stmt2.setString(3,usuario.getSenha());
            stmt2.setString(4,usuario.getCategoria());
            
            
            stmt2.execute();
            
        } catch(Exception e){
            e.printStackTrace();
        }
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
                apontamento.setId(resultado.getInt("idapontamentos"));
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

    public static void cadastrarApontamentos(Apontamentos apontamento){  
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "insert into database_api.apontamentos(categoria, data_hora_inicio, \n" +
                                            "data_hora_fim, justificativa, cliente, projeto, solicitante, cr) values(?,?,?,?,?,?,?,?) ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);
            
            stmt1.setString(1,apontamento.getCategoria());
            stmt1.setString(2,apontamento.getData_hora_inicio());
            stmt1.setString(3,apontamento.getData_hora_fim());
            stmt1.setString(4,apontamento.getJustificativa());
            stmt1.setString(5,apontamento.getCliente());
            stmt1.setString(6,apontamento.getProjeto());
            stmt1.setString(7,apontamento.getSolicitante());
            stmt1.setString(8,apontamento.getCr());
            
            stmt1.execute();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
       
        
       