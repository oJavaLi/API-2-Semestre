package com.fullmadagilists.api2semestre.comum;

import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    
    public static List<String[]> gerarRelatorio(List<Apontamentos> apontamentos) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        List<String[]> relatorio = new ArrayList<>();
        
        relatorio.add(new String[] {
            "CR", 
            "Cliente", 
            "Projeto", 
            "Solicitante", 
            "Categoria", 
            "Data Hora Inicio", 
            "Data Hora Fim", 
            "Verba", 
            "Multiplicador",
            "Horas Calculadas",
            "Porcentagem Adicional",
            "Justificativa"
        });
        
        for(Apontamentos a: apontamentos) {
            if(!a.getAvaliacaoStatus().equals("APROVADO")) {
                continue;
            }
            
            String verba = "";
            double multiplicador = 1;
            double porcentagem = 0;
            double horasCalculadas = 0;
            
            if (a.getCategoria().equals("Sobreaviso")) {
                verba = "3016";
                multiplicador = 1;
                porcentagem = 30;
                Duration duracao = Duration.between(a.getInicio(), a.getFim());
                horasCalculadas = (duracao.getSeconds()/3600.0) * multiplicador;
                
                for(Apontamentos b: apontamentos) {
                    if(!a.getAvaliacaoStatus().equals("APROVADO") || b.getId() == a.getId()) {
                        continue;
                    }
                    if(b.getInicio().isBefore(a.getFim()) && b.getFim().isAfter(a.getInicio())) {
                        Duration duracaoHoraExtra = Duration.between(b.getInicio(), b.getFim());
                        double horasExtras = (duracaoHoraExtra.getSeconds()/3600.0) * multiplicador;
                        horasCalculadas -= horasExtras;
                    }
                }
                
                relatorio.add(new String[] {
                    a.getCr(),
                    a.getCliente(),
                    a.getProjeto(),
                    a.getSolicitante(),
                    a.getCategoria(),
                    a.getData_hora_inicio(),
                    a.getData_hora_fim(),
                    verba,
                    String.format("%.4f", multiplicador),
                    String.format("%.2f", horasCalculadas),
                    String.format("%.2f", porcentagem),
                    a.getJustificativa()
                });
            } else {
                if(
                    a.getInicio().getHour() >= 6
                    && (a.getFim().getHour() < 22 || (a.getFim().getHour() == 22 && a.getFim().getMinute() == 0))
                ){
                    Duration duracao = Duration.between(a.getInicio(), a.getFim());
                    
                    if(duracao.getSeconds() > 2*3600) {
                        verba = "1601";
                        multiplicador = 1;
                        porcentagem = 75;
                        horasCalculadas = 2;
                        
                        relatorio.add(new String[] {
                            a.getCr(),
                            a.getCliente(),
                            a.getProjeto(),
                            a.getSolicitante(),
                            a.getCategoria(),
                            a.getData_hora_inicio(),
                            formatador.format(a.getInicio().plusHours(2)),
                            verba,
                            String.format("%.4f", multiplicador),
                            String.format("%.2f", horasCalculadas),
                            String.format("%.2f", porcentagem),
                            a.getJustificativa()
                        });
                        
                        Duration duracao2 = Duration.between(a.getInicio().plusHours(2), a.getFim());
                        verba = "1602";
                        multiplicador = 1;
                        porcentagem = 100;
                        horasCalculadas = (duracao2.getSeconds()/3600.0) * multiplicador;
                        
                        relatorio.add(new String[] {
                            a.getCr(),
                            a.getCliente(),
                            a.getProjeto(),
                            a.getSolicitante(),
                            a.getCategoria(),
                            formatador.format(a.getInicio().plusHours(2)),
                            a.getData_hora_fim(),
                            verba,
                            String.format("%.4f", multiplicador),
                            String.format("%.2f", horasCalculadas),
                            String.format("%.2f", porcentagem),
                            a.getJustificativa()
                        });
                    } else {
                        verba = "1601";
                        multiplicador = 1;
                        porcentagem = 75;
                        horasCalculadas = (duracao.getSeconds()/3600.0) * multiplicador;
                        relatorio.add(new String[] {
                            a.getCr(),
                            a.getCliente(),
                            a.getProjeto(),
                            a.getSolicitante(),
                            a.getCategoria(),
                            a.getData_hora_inicio(),
                            a.getData_hora_fim(),
                            verba,
                            String.format("%.4f", multiplicador),
                            String.format("%.2f", horasCalculadas),
                            String.format("%.2f", porcentagem),
                            a.getJustificativa()
                        });
                    }
                } else if (
                    (a.getInicio().getHour() == 22 || a.getInicio().getHour() == 23 || (a.getInicio().getHour() >= 0 && a.getInicio().getHour() <= 6))
                    && (a.getFim().getHour() < 6 || (a.getFim().getHour() == 6 && a.getFim().getMinute() == 0))
                ) {
                    Duration duracao = Duration.between(a.getInicio(), a.getFim());
                    
                    if(duracao.getSeconds() > 2*3600) {
                        // 2 Primeiras Horas Extras Noturnas
                        verba = "3000";
                        multiplicador = 1.1429;
                        porcentagem = 75;
                        horasCalculadas = 2*multiplicador;
                        
                        relatorio.add(new String[] {
                            a.getCr(),
                            a.getCliente(),
                            a.getProjeto(),
                            a.getSolicitante(),
                            a.getCategoria(),
                            a.getData_hora_inicio(),
                            formatador.format(a.getInicio().plusHours(2)),
                            verba,
                            String.format("%.4f", multiplicador),
                            String.format("%.2f", horasCalculadas),
                            String.format("%.2f", porcentagem),
                            a.getJustificativa()
                        });
                        
                        // Demais Horas
                        Duration duracao2 = Duration.between(a.getInicio().plusHours(2), a.getFim());
                        verba = "3001";
                        multiplicador = 1.1429;
                        porcentagem = 100;
                        horasCalculadas = (duracao2.getSeconds()/3600.0) * multiplicador;
                        
                        relatorio.add(new String[] {
                            a.getCr(),
                            a.getCliente(),
                            a.getProjeto(),
                            a.getSolicitante(),
                            a.getCategoria(),
                            formatador.format(a.getInicio().plusHours(2)),
                            a.getData_hora_fim(),
                            verba,
                            String.format("%.4f", multiplicador),
                            String.format("%.2f", horasCalculadas),
                            String.format("%.2f", porcentagem),
                            a.getJustificativa()
                        });
                    } else {
                        verba = "3000";
                        multiplicador = 1.1429;
                        porcentagem = 75;
                        horasCalculadas = (duracao.getSeconds()/3600.0) * multiplicador;
                        relatorio.add(new String[] {
                            a.getCr(),
                            a.getCliente(),
                            a.getProjeto(),
                            a.getSolicitante(),
                            a.getCategoria(),
                            a.getData_hora_inicio(),
                            a.getData_hora_fim(),
                            verba,
                            String.format("%.4f", multiplicador),
                            String.format("%.2f", horasCalculadas),
                            String.format("%.2f", porcentagem),
                            a.getJustificativa()
                        });
                    }
                    
                    verba = "1809";
                    multiplicador = 1.1429;
                    porcentagem = 30;
                    horasCalculadas = (duracao.getSeconds()/3600.0) * multiplicador;
                    relatorio.add(new String[] {
                        a.getCr(),
                        a.getCliente(),
                        a.getProjeto(),
                        a.getSolicitante(),
                        a.getCategoria(),
                        a.getData_hora_inicio(),
                        a.getData_hora_fim(),
                        verba,
                        String.format("%.4f", multiplicador),
                        String.format("%.2f", horasCalculadas),
                        String.format("%.2f", porcentagem),
                        a.getJustificativa()
                    });
                }
            }
        }
        
        return relatorio;
    }
}
