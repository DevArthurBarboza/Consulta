package br.unifil.lpoo.consulta.modelo;

public class Consulta {
    private String nomePaciente;
    private String matricula;
    protected int dependentes;
    protected int anoInclusao;
    protected double valor;
    protected String plano;

    public String getNomePaciente(){
        return this.nomePaciente;
    }

    public void setNomePaciente(String novoNome){
        this.nomePaciente = novoNome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String novaMatricula){
        if (novaMatricula.length() == 5 ){
            this.matricula = novaMatricula;
        }
    }

    public int getDependentes(){
        return this.dependentes;
    }

    public void setDependentes(int dependentes){
        this.dependentes = dependentes;
    }

    public void setAnoInclusao(int anoInclusao){
        this.anoInclusao = anoInclusao;
    }

    public int getAnoInclusao(){
        return this.anoInclusao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValorConsulta(){
        return this.valor;
    }

    public String getPlano(){
        return this.plano;
    }
}
