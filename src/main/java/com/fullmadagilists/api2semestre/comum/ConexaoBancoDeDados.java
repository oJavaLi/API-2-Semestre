package com.fullmadagilists.api2semestre.comum;
import com.fullmadagilists.api2semestre.entidades.CentroResultado;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Cliente;
import com.fullmadagilists.api2semestre.entidades.Parametro;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class ConexaoBancoDeDados {
    private static Connection conexao = null;

    public static Connection conector(){
        if (conexao != null) {
            return conexao;
        }

        // Credenciais de acesso banco de dados
        String dbName = "api2Semestre";
        String dbUser = "api2semestre";
        String dbPassword = "api2semestre";
        String url = "jdbc:mysql://localhost:3306/api2semestre";

        // caminho do driver
        String driver = "com.mysql.cj.jdbc.Driver";

        // estabelecendo a conexão com o BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, dbUser, dbPassword);
            System.out.println(conexao);
        } catch (Exception e) {
            System.out.println(e);

        }

        return conexao;
    }

    public static Usuario getUsuarioPorMatricula(int matricula){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String usuariosquery = "select * from login_usuarios where matricula = " + matricula;
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(usuariosquery);
            if (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setMatricula(resultado.getInt("matricula"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setCategoria(resultado.getString("categoria"));

                return usuario;
            } else {
                return null;
            }
        } catch(Exception e){
            e.printStackTrace();
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
    
    public static List<Usuario> buscarUsuarioLista(String busca){
        List<Usuario> listaUsuarios = new ArrayList<>();

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
            String cadApontamentosquery = "insert into login_usuarios(matricula, nome, \n" +
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

    public static void editarUsuario(Usuario usuario){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadUsuarioquery = "update login_usuarios set nome=?,senha=?,categoria=? where matricula=? ;";
            PreparedStatement stmt2 = conexao.prepareStatement(cadUsuarioquery);
            stmt2.setString(1,usuario.getNome());
            stmt2.setString(2,usuario.getSenha());
            stmt2.setString(3,usuario.getCategoria());
            stmt2.setInt(4, usuario.getMatricula());

            stmt2.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void deletarUsuario(int matricula){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "delete from login_usuarios where matricula="+matricula;
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
                apontamento.setAdministradorMatricula(resultado.getInt("avaliador_administrador"));
                apontamento.setGestorMatricula(resultado.getInt("avaliador_gestor"));
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
            String cadApontamentosquery = "insert into apontamentos(categoria, data_hora_inicio, \n" +
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

    public static void editarApontamentos(Apontamentos apontamento,Usuario usuario,int id){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "update apontamentos set data_hora_inicio=?, \n"
                    + "data_hora_fim=?,justificativa=?,cliente=?,projeto=?,solicitante=?,cr=? where idapontamentos=? ;";
            PreparedStatement stmt2 = conexao.prepareStatement(cadApontamentosquery);
            stmt2.setString(1,apontamento.getData_hora_inicio());
            stmt2.setString(2,apontamento.getData_hora_fim());
            stmt2.setString(3,apontamento.getJustificativa());
            stmt2.setString(4,apontamento.getCliente());
            stmt2.setString(5,apontamento.getProjeto());
            stmt2.setString(6,apontamento.getSolicitante());
            stmt2.setString(7,apontamento.getCr());
            stmt2.setInt(8, id);

            stmt2.execute();

            stmt2.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void deletarApontamentos(int id){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "delete from apontamentos where idapontamentos="+id;
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
            String cadClientesquery = "insert into cliente(razao_social, cnpj)" +
                                            "values(?,?) ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadClientesquery);

            stmt1.setString(1,cliente.getRazaoSocial());
            stmt1.setString(2,cliente.getCnpj());

            stmt1.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void editarCliente(Cliente cliente){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadUsuarioquery = "update cliente set razao_social=?  where cnpj=?;";
            PreparedStatement stmt2 = conexao.prepareStatement(cadUsuarioquery);
            stmt2.setString(1,cliente.getRazaoSocial());
            stmt2.setString(2,cliente.getCnpj());

            stmt2.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
        public static void deletarCliente(String cnpj){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String query = "delete from cliente where cnpj=?";
            PreparedStatement stmt1 = conexao.prepareStatement(query);
            stmt1.setString(1, cnpj);

            stmt1.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static List<Cliente> buscarCliente(String busca){
        List<Cliente> listaCliente = new ArrayList<>();

        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String clienteQuery = "select * from cliente where cnpj like "+"'"+busca+"%'";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(clienteQuery);

            while (resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setRazaoSocial(resultado.getString("razao_social"));
                cliente.setCnpj(resultado.getString("cnpj"));

                listaCliente.add(cliente);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        return listaCliente;
    }


        public static void cadastrarCentroResultado(CentroResultado centroresultado){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadCentroResultadoquery = "insert into centroresultado(codigoCR, nomeCR, siglaCR) values(?,?,?) ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadCentroResultadoquery);

            stmt1.setString(1,centroresultado.getCodigocr());
            stmt1.setString(2,centroresultado.getNomecr());
            stmt1.setString(3,centroresultado.getSiglacr());


            stmt1.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

        public static void editarCR(CentroResultado centroresultado){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadCentroResultadoquery = "update centroresultado set nomeCR=?,siglaCR=? where codigoCR=?; ";
            PreparedStatement stmt1 = conexao.prepareStatement(cadCentroResultadoquery);

            stmt1.setString(1,centroresultado.getNomecr());
            stmt1.setString(2,centroresultado.getSiglacr());
            stmt1.setString(3,centroresultado.getCodigocr());




            stmt1.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

        public static void deletarCR(String codigoCR){
        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String cadApontamentosquery = "delete from centroresultado where codigoCR="+codigoCR;
            PreparedStatement stmt1 = conexao.prepareStatement(cadApontamentosquery);

            stmt1.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

        public static List<CentroResultado> buscarCR(String busca){
        List<CentroResultado> listaCR = new ArrayList<>();

        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String crQuery = "select * from centroresultado where codigoCR like "+"'"+busca+"%'";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(crQuery);

            while (resultado.next()){
                CentroResultado cr = new CentroResultado();
                cr.setNomecr(resultado.getString("nomeCR"));
                cr.setSiglacr(resultado.getString("siglaCR"));
                cr.setCodigocr(resultado.getString("codigoCR"));

                listaCR.add(cr);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        return listaCR;
    }

    public static List<Parametro> buscarParametro(String busca){
        List<Parametro> listaParametro = new ArrayList<>();

        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String parametrizacaoQuery = "select * from parametrizacao where verba like "+"'"+busca+"%'";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(parametrizacaoQuery);

            while (resultado.next()){
                Parametro parametro = new Parametro();
                parametro.setDescricao(resultado.getString("descricao"));
                parametro.setHoras(resultado.getString("horas"));
                parametro.setPorcentagem(resultado.getString("porcentagem"));
                parametro.setVerba(resultado.getString("verba"));


                listaParametro.add(parametro);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        return listaParametro;
    }
    
        public static List<Parametro> parametro(){
        List<Parametro> listaParametro = new ArrayList<>();

        try{
            Connection conexao = ConexaoBancoDeDados.conector();
            String parametrizacaoQuery = "select * from parametrizacao";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(parametrizacaoQuery);

            while (resultado.next()){
                Parametro parametro = new Parametro();
                parametro.setDescricao(resultado.getString("descricao"));
                parametro.setHoras(resultado.getString("horas"));
                parametro.setPorcentagem(resultado.getString("porcentagem"));
                parametro.setVerba(resultado.getString("verba"));


                listaParametro.add(parametro);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        return listaParametro;
    }
    
    public static void atualizarParametro(Parametro parametro) {
        try {
            String query = "UPDATE parametrizacao SET horas = ?, porcentagem = ?, descricao = ? where verba = ?";
            PreparedStatement stmt = conexao.prepareStatement(query);

            stmt.setString(1, parametro.getHoras());
            stmt.setString(2, parametro.getPorcentagem());
            stmt.setString(3, parametro.getDescricao());
            stmt.setString(4, parametro.getVerba());

            stmt.execute();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void atualizarAvaliacaoApontamento(Apontamentos apontamento) {
        try {
            String query = "UPDATE apontamentos SET avaliador_administrador = ?, avaliador_gestor = ?, avaliacao_status = ?, avaliacao_justificativa = ? where idapontamentos = ?";
            PreparedStatement stmt = conexao.prepareStatement(query);

            if (apontamento.getAdministradorMatricula() != 0) {
                stmt.setInt(1, apontamento.getAdministradorMatricula());
            } else {
                stmt.setNull(1, Types.INTEGER);
            }

            if (apontamento.getGestorMatricula() != 0) {
                stmt.setInt(2, apontamento.getGestorMatricula());
            } else {
                stmt.setNull(2, Types.INTEGER);
            }
            stmt.setString(3, apontamento.getAvaliacaoStatus());
            stmt.setString(4, apontamento.getAvaliacaoJustificativa());
            stmt.setInt(5, apontamento.getId());

            stmt.execute();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
