import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner entry = new Scanner(System.in);
        int opcao = 0;
        Controle ctrl = new Controle();
        while (opcao != 9){
            System.out.println("1-Cadastrar Departamento");
            System.out.println("2-Cadastrar Empregado");
            System.out.println("3-Associar Empregado no Departamento");
            System.out.println("4-Remover Empregado do Departamento");
            System.out.println("5-Listar Empregados");
            System.out.println("6-Listar Departamentos e seus Empregados");
            System.out.println("7-Listar um Departamento específico e seus empregados");
            System.out.println("8-Listar Departamentos Existentes");
            System.out.println("9-Encerrar Sistema");
            opcao = entry.nextInt(); entry.nextLine();
            switch(opcao){
                case 1 :
                    System.out.println("Informe o nome do departamento");
                    String nomeDep = entry.nextLine();
                    ctrl.cadastrarDepartamento(nomeDep);
                    break;
                case 2 :
                    System.out.println("Informe o nome do empregado");
                    String nomeEmp = entry.nextLine();
                    System.out.println("Informe o salario do empregado");
                    double salario = entry.nextDouble(); entry.nextLine();
                    ctrl.cadastrarEmpregado(nomeEmp,salario);
                    break;
                case 3 :
                    System.out.println("Informe o nome do departamento");
                    nomeDep = entry.nextLine();
                    System.out.println("Informe o nome do empregado");
                    nomeEmp = entry.nextLine();
                    ctrl.setEmpregadoToDepartamento(nomeEmp,nomeDep);
                    break;
                case 4 :
                    System.out.println("Informe o departamento");
                    String dep = entry.nextLine();
                    System.out.println("Informe o nome do empregado");
                    String emp = entry.nextLine();
                    ctrl.removeEmpDep(dep, emp);
                    break;
                case 5 :
                    System.out.println("Relação de Empregados:");
                    System.out.println(ctrl.listarEmpregados());
                    break;
                case 6 :
                    System.out.println("Relação de Departamentos e empregados:");
                    System.out.println(ctrl.listarDepartamento());
                    break;
                case 7 :
                    System.out.println("Informe o departamento");
                    dep = entry.nextLine();
                    System.out.println(ctrl.listarDepartamento(dep));
                    break;
                case 8 :
                    System.out.println("Relação de departamentos:");
                    System.out.println(ctrl.listarDepartamentosNome());
                    break;
                case 9:
                    System.out.println("Encerrando sistema");
            }

        }
    }
}
