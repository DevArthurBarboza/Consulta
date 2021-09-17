package br.unifil.lpoo.consulta.visao;

import java.util.Scanner;
import br.unifil.lpoo.consulta.controle.CadastroDeConsulta;

public class TesteConsulta {
    public static void main(String[] args) {
        CadastroDeConsulta ctrl = new CadastroDeConsulta();
        int op = 0;
        Scanner entry = new Scanner (System.in);
        while (op != 9){
            System.out.println("1-Solicitar Consulta");
            System.out.println("2-Consultar Cadastros por Plano");
            System.out.println("3-Consultar total de Consultas por Plano");
            System.out.println("4-Consultar valor total de consultas por plano");
            System.out.println("9-Fim");
            op = entry.nextInt(); entry.nextLine();
            switch (op){
                case 1 :
                    System.out.println("Informe o nome do paciente");
                    String nome = entry.nextLine();
                    System.out.println("Informe a matricula do paciente(5 Dígitos alfanuméricos");
                    String matricula = entry.nextLine();
                    System.out.println("Informe o ano de inclusão");
                    int ano = entry.nextInt(); entry.nextLine();
                    System.out.println("Informe o número de dependentes");
                    int dependentes = entry.nextInt(); entry.nextLine();
                    System.out.println("Informe o plano desejado");
                    System.out.println("1-Prata");
                    System.out.println("2-Ouro");
                    System.out.println("3-Diamante");
                    System.out.println("4-Familia");
                    int plano =  entry.nextInt(); entry.nextLine();
                    System.out.println("Informe o valor da consulta");
                    int valor = entry.nextInt(); entry.nextLine();

                    switch(plano){
                        case 1:
                            ctrl.addConsultaPrata(nome,matricula,valor,ano,dependentes);
                            break;
                        case 2:
                            ctrl.addConsultaOuro(nome,matricula,valor,ano,dependentes);
                            break;
                        case 3:
                            ctrl.addConsultaDiamante(nome,matricula,valor,ano,dependentes);
                            break;
                        case 4:
                            ctrl.addConsultaFamilia(nome,matricula,valor,ano,dependentes);
                            break;
                            default:
                                System.out.println("Valor inválido");
                            break;
                    }
                    break;
                case 2 :
                    System.out.println("Informe o tipo de Plano que você gostaria de consultar \n1-Prata\n 2-Ouro\n3-Diamante\n4-Familia");
                    plano = entry.nextInt(); entry.nextLine();
                    System.out.println(ctrl.getPacientes(plano));
                    break;
                case 3 :
                    System.out.println("Informe o tipo de Plano que você gostaria de consultar \n1-Prata\n 2-Ouro\n3-Diamante\n4-Familia");
                    plano = entry.nextInt(); entry.nextLine();
                    System.out.println(ctrl.getIntConsultas(plano));
                    break;
                case 4 :
                    System.out.println("Informe o plano para a consulta dos valores totais \n1-Prata\n 2-Ouro\n3-Diamante\n4-Familia");
                    plano = entry.nextInt(); entry.nextLine();
                    System.out.println(ctrl.getValorTotal(plano));
                    break;
                case 9 :
                    System.out.println("Encerrando sistema...");
                    break;
            }
        }
    }
}
