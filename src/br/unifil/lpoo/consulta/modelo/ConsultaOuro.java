package br.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta{

    public double getValorConsulta(){
        if (anoInclusao <= 2000) {
            return 0;
        } else {
                return valor * 0.7;
        }
    }
    public ConsultaOuro (String novoNome,String novaMatricula,int novoValor, int ano, int dependente){
        super.setNomePaciente(novoNome);
        super.setMatricula(novaMatricula);
        super.setValor(novoValor);
        super.setAnoInclusao(ano);
        super.setDependentes(dependente);
        this.plano = "Ouro";
    }
}
