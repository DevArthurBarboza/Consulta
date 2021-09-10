package br.unifil.lpoo.consulta.controle;

import java.util.ArrayList;
import br.unifil.lpoo.consulta.modelo.*;

public class CadastroDeConsulta {
    ArrayList <Consulta> listaConsulta = new ArrayList<Consulta>();



    public void addConsulta(){
        listaConsulta.add(new Consulta());
    }

    public void addConsultaPrata(String nome, String matricula, int valor,int ano, int dependentes){
        listaConsulta.add(new ConsultaPrata(nome,matricula,valor,ano,dependentes));
    }

    public void addConsultaOuro(String nome, String matricula, int valor,int ano, int dependentes){
        listaConsulta.add(new ConsultaOuro(nome,matricula,valor,ano,dependentes));
    }

    public void addConsultaDiamante(String nome, String matricula, int valor,int ano, int dependentes){
        listaConsulta.add(new ConsultaDiamante(nome,matricula,valor,ano,dependentes));
    }

    public void addConsultaFamilia(String nome, String matricula, int valor,int ano, int dependentes){
        listaConsulta.add(new ConsultaFamilia(nome,matricula,valor,ano,dependentes));
    }


    public String getPacientes(String plano){
        String saida = "";
        Consulta cons;
        for (int i = 0; i < listaConsulta.size();i++){
            cons = listaConsulta.get(i);
            if (cons.getPlano().equals(plano)){
                saida = "Paciente :" + cons.getNomePaciente() + " Matrícula: " + cons.getMatricula() + "\n";
            }
        }
        return saida;
    }

    public int getIntConsultas(String plano){
        int saida = 0;
        Consulta cons;
        for (int i = 0; i < listaConsulta.size();i++){
            cons = listaConsulta.get(i);
            if (cons.getPlano().equals(plano)){
                saida++;
            }
        }
        return saida;
    }

    public int getValorTotal(String plano){
        int saida = 0 ;
        Consulta cons;
        for (int i = 0; i < listaConsulta.size();i++){
            cons = listaConsulta.get(i);
            if (cons.getPlano().equals(plano)){
                saida++;
            }
        }
        return saida;
    }
}

