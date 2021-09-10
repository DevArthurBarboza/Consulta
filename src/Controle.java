import java.util.ArrayList;

public class Controle {
    private ArrayList<Empregado> listaEmp;
    private ArrayList<Departamento> listaDep;

    public Controle (){
        listaEmp = new ArrayList<>();
        listaDep = new ArrayList<>();
    }

    public void cadastrarEmpregado(String nome, double salario){
        listaEmp.add(new Empregado(nome,salario));
    }

    public void cadastrarDepartamento(String nome){
        listaDep.add(new Departamento(nome));
    }

    public void setEmpregadoToDepartamento(String emp, String dep){
        Departamento auxDep;
        Empregado auxEmp;
        for (int i = 0; i < listaDep.size();i++){
            auxDep = listaDep.get(i);
            if (auxDep.getNome().equals(dep)){
                for (int j = 0; j < listaEmp.size();j++){
                    auxEmp = listaEmp.get(j);
                    if (auxEmp.getNome().equals(emp)){
                        auxDep.setEmpregado(auxEmp);
                        break;
                    }
                }
                break;
            }
        }

    }

    public void removeEmpDep (String dep, String emp){
        Empregado auxEmp;
        Departamento auxDep;
        for (int i = 0; i < listaDep.size();i++){
            auxDep = listaDep.get(i);
            if (auxDep.getNome().equals(dep)){
                for (int j = 0; j < listaEmp.size(); j++){
                    auxEmp = listaEmp.get(j);
                    if (auxEmp.getNome().equals(emp)){
                        auxDep.removeEmp(listaEmp.get(j));
                        break;
                    }
                }
            break;
            }
        }
    }

    public String listarEmpregados(){
        Empregado auxEmp;
        String saida = "";
        for (int i=0; i < listaEmp.size();i++){
            auxEmp = listaEmp.get(i);
            saida = saida + "Nome: " + auxEmp.getNome() + "Salário: R$" + auxEmp.getSalario()  + " id:" + auxEmp.getId() + "\n";
        }
        return saida;
    }

    public String listarDepartamento(String departamento){
        Empregado auxEmp;
        String out = departamento;
        for (int i = 0; i < listaEmp.size();i++){
            auxEmp = listaEmp.get(i);
            if (listaDep.get(i).getNome().equals(auxEmp.getNome())){
            out = out + auxEmp.getNome() + "\n";
            }
        }
        return out;
    }


    public String listarDepartamento(){
        String saida = "";
        Empregado auxEmp ;
        Departamento auxDep;
        for (int i = 0; i < listaDep.size();i++) {
            saida = saida + listaDep.get(i).getNome() + "\n";
            auxDep = listaDep.get(i);
                for (int j = 0; j < listaEmp.size(); j++) {
                    auxEmp = listaEmp.get(j);
                    if (auxDep.listarEmpregadoIndividual(auxEmp).equals(auxEmp.getNome())){
                        saida = saida + auxEmp.getNome() + "\n";
                    }
            }
        }
        return saida;
    }

    public String listarDepartamentosNome(){
        String saida = "";
        Departamento auxDep;
        for (int i = 0; i <listaDep.size();i++){
            auxDep = listaDep.get(i);
            saida = saida + auxDep.getNome() + "\n";
        }
        return saida;
    }
}
