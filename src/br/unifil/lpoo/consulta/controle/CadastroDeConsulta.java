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


    public String getPacientes(int plano){
        String saida = "";
        Consulta cons;

        for (int i = 0; i < listaConsulta.size();i++) {
            cons = listaConsulta.get(i);
            switch (plano) {
                case 1:
                    if (cons instanceof ConsultaPrata) {
                        saida = "Paciente :" + cons.getNomePaciente() + " Matrícula: " + cons.getMatricula() + "\n";}
                    break;
                case 2:
                    if (cons instanceof ConsultaOuro) {
                        saida = "Paciente :" + cons.getNomePaciente() + " Matrícula: " + cons.getMatricula() + "\n";}
                        break;
                case 3:
                    if (cons instanceof ConsultaDiamante) {
                        saida = "Paciente :" + cons.getNomePaciente() + " Matrícula: " + cons.getMatricula() + "\n";}
                    break;
                case 4:
                    if (cons instanceof ConsultaFamilia) {
                        saida = "Paciente :" + cons.getNomePaciente() + " Matrícula: " + cons.getMatricula() + "\n";}
                    break;
            }
        }
        return saida;
    }

    public int getIntConsultas(int plano){
        int saida = 0;
        Consulta cons;
        for (int i = 0; i < listaConsulta.size();i++){
            cons = listaConsulta.get(i);
            switch (plano) {
                case 1:
                    if (cons instanceof ConsultaPrata) {
                        saida++;
                    }
                    break;
                case 2:
                    if (cons instanceof ConsultaOuro) {
                        saida++;
                    }
                    break;
                case 3:
                    if (cons instanceof ConsultaDiamante) {
                        saida++;
                    }
                    break;
                case 4:
                    if (cons instanceof ConsultaFamilia) {
                        saida++;
                    }
                    break;
            }
        }
        return saida;
    }

    public double getValorTotal(int plano){
        double saida = 0;
        Consulta cons;
        for (int i = 0; i < listaConsulta.size();i++){
            cons = listaConsulta.get(i);
            switch (plano) {
                case 1:
                    if (cons instanceof ConsultaPrata) {
                        saida = cons.getValorConsulta();
                    }
                    break;
                case 2:
                    if (cons instanceof ConsultaOuro) {
                        saida = cons.getValorConsulta();
                    }
                    break;
                case 3:
                    if (cons instanceof ConsultaDiamante) {
                        saida = cons.getValorConsulta();
                    }
                    break;
                case 4:
                    if (cons instanceof ConsultaFamilia) {
                        saida = cons.getValorConsulta();
                    }
                    break;
            }
        }
        return saida;
    }



}

