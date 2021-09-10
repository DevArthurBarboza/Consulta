public class Pessoa {
    private String nome;
    private String endereco;
    private int idade;

    //Métodos set
    public Pessoa (String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //Métodos Get
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public int getIdade(){
        return this.idade;
    }
}
