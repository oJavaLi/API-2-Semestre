package com.fullmadagilists.api2semestre.comum;
import com.fullmadagilists.api2semestre.entidades.CentroResultado;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Cliente;
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
        if (conexao != null) {
            return conexao;
        }
        
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
            String usuariosquery = "select * from database_api.login_usuarios";
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
    public static List<Usuario> buscarUsuarioLista(String busca){
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();

        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String usuariosquery = "select * from login_usuarios where nome like "+"'"+busca+"%'";
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
            String cadApontamentosquery = "insert into database_api.login_usuarios(matricula, nome, \n" +
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
    
    public static void deletarUsuario(int matricula){  
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "delete from database_api.login_usuarios where matricula="+matricula;
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);
            
            stmt1.execute();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static List<Apontamentos> apontamentos(Usuario usuario){
        List<Apontamentos> listaApontamentos = new ArrayList<Apontamentos>();

        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String apontamentosquery = "select * from apontamentos where id_usuario = ?";
            PreparedStatement stmt = conexao.prepareStatement(apontamentosquery);

            String matr = String.valueOf(usuario.getMatricula());
            stmt.setString(1,matr);
            ResultSet resultado = stmt.executeQuery();


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
                apontamento.setAvaliadorMatricula(resultado.getInt("avaliador_matricula"));
                apontamento.setAvaliacaoStatus(resultado.getString("avaliacao_status"));
                apontamento.setAvaliacaoJustificativa(resultado.getString("avaliacao_justificativa"));

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
    

    public static void cadastrarApontamentos(Apontamentos apontamento, Usuario usuario){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "insert into database_api.apontamentos(categoria, data_hora_inicio, \n" +
                                            "data_hora_fim, justificativa, cliente, projeto, solicitante, cr, id_usuario) values(?,?,?,?,?,?,?,?,?) ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);

            stmt1.setString(1,apontamento.getCategoria());
            stmt1.setString(2,apontamento.getData_hora_inicio());
            stmt1.setString(3,apontamento.getData_hora_fim());
            stmt1.setString(4,apontamento.getJustificativa());
            stmt1.setString(5,apontamento.getCliente());
            stmt1.setString(6,apontamento.getProjeto());
            stmt1.setString(7,apontamento.getSolicitante());
            stmt1.setString(8,apontamento.getCr());
            String matr = String.valueOf(usuario.getMatricula());
            stmt1.setString(9, matr );

            stmt1.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void deletarApontamentos(int id){  
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "delete from database_api.apontamentos where idapontamentos="+id;
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);
            
            stmt1.execute();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }

       public static List<Cliente> clientes(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String clientesquery = "select * from cliente";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(clientesquery);

            while (resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setRazaoSocial(resultado.getString("razao_social"));
                cliente.setCnpj(resultado.getString("cnpj"));

                listaClientes.add(cliente);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        return listaClientes;
    }

    public static void cadastrarClientes(Cliente cliente){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadClientesquery = "insert into database_api.cliente(razao_social, cnpj)" +
                                            "values(?,?) ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadClientesquery);

            stmt1.setString(1,cliente.getRazaoSocial());
            stmt1.setString(2,cliente.getCnpj());

            stmt1.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
        public static void deletarCliente(String razaoSocial){  
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "delete from database_api.cliente where razao_social="+razaoSocial;
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);
            
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
        public static void deletarCR(String codigoCR){  
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "delete from database_api.centroresultado where codigoCR="+codigoCR;
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);
            
            stmt1.execute();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void atualizarAvaliacaoApontamento(Apontamentos apontamento) {
        try {
            Connection conexao = ConexaoBancoDeDados.conector();
            String query = "UPDATE database_api.apontamentos SET avaliador_matricula = ?, avaliacao_status = ?, avaliacao_justificativa = ? where idapontamentos = ?";
            PreparedStatement stmt = conexao.prepareStatement(query);
            
            stmt.setInt(1, apontamento.getAvaliadorMatricula());
            stmt.setString(2, apontamento.getAvaliacaoStatus());
            stmt.setString(3, apontamento.getAvaliacaoJustificativa());
            stmt.setInt(4, apontamento.getId());
            
            stmt.execute();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
