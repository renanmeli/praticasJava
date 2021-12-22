package pratica_integradora1_tm;

public class Estudante {

    //atributos
    private String nome;
    private double dataNascimento;
    private int numeroMatricula;
    private int serie;

    //construtor
    public Estudante(String nome, double dataNascimento, int numeroMatricula, int serie) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.serie = serie;
    }

    //encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(double dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    //toString
    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", numeroMatricula=" + numeroMatricula +
                ", serie=" + serie +
                '}';
    }
}
