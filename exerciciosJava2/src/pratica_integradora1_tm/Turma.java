package pratica_integradora1_tm;

import java.util.Arrays;

public class Turma {

    //atributos
    private int serie;
    private String codigo;
    private Disciplina[] disciplinas;
    private Estudante[] estudantes;

    //construtor
    public Turma(int serie, String disciplina) {
        this.serie = serie;
        this.codigo = codigo;
    }

    //encapsulamento
    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }


    //ToString
    @Override
    public String toString() {
        return "Turma{" +
                "serie=" + serie +
                ", codigo='" + codigo + '\'' +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                ", estudantes=" + Arrays.toString(estudantes) +
                '}';
    }
}
