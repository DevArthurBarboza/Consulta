import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList <Empregado> listaEmp;


    public Departamento(String nome){
        this.nome = nome;
        listaEmp = new ArrayList<>();
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEmpregado(Empregado emp){
        listaEmp.add(emp);
    }

    public void removeEmp(Empregado emp){
        listaEmp.remove(emp);
    }

    public int getQuantidadeEmpregados(){
        return listaEmp.size();
    }

    public String listarEmpregados(){
        String saida = "";
        for (int i = 0; i < listaEmp.size();i++){
            saida = saida + listaEmp.get(i).getNome() + "\n";
        }
        return saida;
    }

    public String listarEmpregadoIndividual(Empregado emp){
        Empregado auxEmp;
        String saida = "";
        for (int j = 0; j < listaEmp.size();j++){
            auxEmp = listaEmp.get(j);
            if(auxEmp.getNome().equals(emp.getNome())){
                saida = auxEmp.getNome();
                break;
            }
        }
        return saida;
    }

}
