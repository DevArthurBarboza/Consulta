package br.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta{

    public double getValorConsulta(){
        return (valor * 0.8);
    }

    public ConsultaPrata (String novoNome,String novaMatricula,int novoValor,int ano,int dependente){
        super.setNomePaciente(novoNome);
        super.setMatricula(novaMatricula);
        super.setValor(novoValor);
        super.setAnoInclusao(ano);
        super.setDependentes(dependente);
        this.plano = "Prata";
    }

}
