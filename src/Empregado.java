public class Empregado extends Pessoa {
    private double salario;
    private static int proximoId = 1;
    private int id;

    public static void addProximoId(){
        proximoId++;
    }

    public static int getProximoId(){
        return Empregado.proximoId;
    }

    public Empregado (String nome, double salario){
        super(nome);
        this.salario = salario;
        setId();
    }

    public void setId(){
        this.id = proximoId;
        addProximoId();
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double Salario){
        this.salario = salario;
    }

    public int getId(){
        return this.id;
    }


}
