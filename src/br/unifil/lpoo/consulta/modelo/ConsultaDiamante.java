package br.unifil.lpoo.consulta.modelo;

public class ConsultaDiamante extends Consulta{

    public double getValorConsulta(){
        return (valor * 0.6);
    }
    public ConsultaDiamante (String novoNome,String novaMatricula,int novoValor, int ano, int dependente){
        super.setNomePaciente(novoNome);
        super.setMatricula(novaMatricula);
        super.setValor(novoValor);
        super.setAnoInclusao(ano);
        super.setDependentes(dependente);
        this.plano = "Diamante";
    }
}
