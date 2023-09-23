package appempresa;

public class Funcionario {
    private int numat; 
    private String nome; 
    private double salario;
    private String sexo;
    private int ndepto;
    private int nsuper;

    public int getNumat() {
        return numat;
    }

    public void setNumat(int numat) {
        this.numat = numat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNdepto() {
        return ndepto;
    }

    public void setNdepto(int ndepto) {
        this.ndepto = ndepto;
    }

    public int getNsuper() {
        return nsuper;
    }

    public void setNsuper(int nsuper) {
        this.nsuper = nsuper;
    }

}

