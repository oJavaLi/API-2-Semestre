package com.fullmadagilists.api2semestre.comum;

import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.util.List;

public class Autenticacao {
    private static List<Usuario> usuarios;
    private static Usuario usuarioAutenticado;
    
    public static void inicializar(List<Usuario> todosOsUsuarios) {
        usuarios = todosOsUsuarios;
        usuarioAutenticado = null; // Ninguém logado
    }
    
    public static boolean autenticar(int matricula, String senha) {
        for (Usuario usuario: usuarios) {
            if(usuario.getMatricula() == matricula && usuario.getSenha().equals(senha)) {
                usuarioAutenticado = usuario;
                return true;
            }
        }
        
        usuarioAutenticado = null;
        return false;
    }
    
    public static boolean logado() {
        return usuarioAutenticado != null;
    }
    
    public static Usuario getUsuarioLogado() {
        return usuarioAutenticado;
    }
}
