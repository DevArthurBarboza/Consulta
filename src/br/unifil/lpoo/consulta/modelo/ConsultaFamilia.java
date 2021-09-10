package br.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta{

    public double getValorConsulta(){
        if (dependentes > 2 ){
            return (valor * 0.5);
        } else {
            return valor;
        }
    }
    public ConsultaFamilia (String novoNome,String novaMatricula,int novoValor,int ano, int dependente){
        super.setNomePaciente(novoNome);
        super.setMatricula(novaMatricula);
        super.setValor(novoValor);
        super.setAnoInclusao(ano);
        super.setDependentes(dependente);
        this.plano= "Familia";
    }
}
