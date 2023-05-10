package com.fullmadagilists.api2semestre.comum;
import com.fullmadagilists.api2semestre.entidades.CentroResultado;
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
        String databaseName = "fmanaocommitaa";
        String databaseUser = "admin";
        String databasepassword = "adegadoneguinfds";
        String url = "jdbc:mysql://fmanaocommitaa.cx8qvm3ytmi7.us-east-2.rds.amazonaws.com:3306/database_api";

        // caminho do driver
        String driver = "com.mysql.cj.jdbc.Driver";

        // estabelecendo a conexão com o BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, databaseUser, databasepassword);
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
    
    public static List<CentroResultado> centroresultado(){
        List<CentroResultado> listaCentroResultado = new ArrayList<CentroResultado>();
        
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String centroresultadoquery = "select * from centroresultado";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(centroresultadoquery);
            
            while (resultado.next()){
                CentroResultado centroresultado = new CentroResultado();
                centroresultado.setCodigocr(resultado.getString("codigoCR"));
                centroresultado.setNomecr(resultado.getString("nomeCR"));
                centroresultado.setSiglacr(resultado.getString("siglaCR"));
                                
                listaCentroResultado.add(centroresultado);
            }
        } catch(Exception e){
            e.printStackTrace();
        } 
        
        return listaCentroResultado;
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
    
        public static void cadastrarCentroResultado(CentroResultado centroresultado){  
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadCentroResultadoquery = "insert into database_api.centroresultado(codigoCR, nomeCR, siglaCR) values(?,?,?) ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadCentroResultadoquery);
            
            stmt1.setString(1,centroresultado.getCodigocr());
            stmt1.setString(2,centroresultado.getNomecr());
            stmt1.setString(3,centroresultado.getSiglacr());
           
            
            stmt1.execute();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
       
        
       