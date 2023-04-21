package com.fullmadagilists.api2semestre.tabelas;

import java.util.ArrayList;
import java.util.List;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Usuario;

public class TabelaUsuarios {
    ConexaoBancoDeDados conexao;

    public TabelaUsuarios(ConexaoBancoDeDados conexao) {
        this.conexao = conexao;
    }
    
    public Usuario buscarPorMatricula(int matricula) {
        return new Usuario();
    }
    
    public List<Usuario> buscarPorNome(String nome) {
        return new ArrayList<Usuario>();
    }
}
