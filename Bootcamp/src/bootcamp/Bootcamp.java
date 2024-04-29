package bootcamp;

import java.util.ArrayList;

public class Bootcamp {
    private String nome;
    private String localizacao;
    private ArrayList<Curso> cursos;
    private ArrayList<Mentoria> mentorias;

    public Bootcamp(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(ArrayList<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void removerMentoria(Mentoria mentoria) {
        mentorias.remove(mentoria);
    }
}
