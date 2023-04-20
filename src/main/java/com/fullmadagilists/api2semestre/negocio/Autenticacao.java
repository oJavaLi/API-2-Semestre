package com.fullmadagilists.api2semestre.negocio;

import com.fullmadagilists.api2semestre.entidades.Usuario;
import com.fullmadagilists.api2semestre.tabelas.TabelaUsuarios;

public class Autenticacao {
    TabelaUsuarios tabelaUsuarios;
    Usuario usuarioAutenticado;
    
    public Autenticacao(TabelaUsuarios tabelaUsuarios) {
        this.tabelaUsuarios = tabelaUsuarios;
        this.usuarioAutenticado = null; // Ninguém logado
    }
    
    public boolean autenticar(int matricula, String senha) {
        Usuario usuario = this.tabelaUsuarios.buscarPorMatricula(matricula);
        
        if (usuario == null) {
            return false; // Usuário não existe 
        }
        
        if (!senha.equals(usuario.getSenha())) {
           return false; // Senha inválida
        }
        
        this.usuarioAutenticado = usuario;
        return true; // Autenticado com sucesso
    }
    
    public boolean logado() {
        if (this.usuarioAutenticado == null) {
            return true;
        } else {
            return false;
        }
    }
    
}
