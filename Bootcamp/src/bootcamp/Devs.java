package bootcamp;

import java.util.ArrayList;

public class Devs {
    private String nome;
    private int nivelExperiencia;
    private ArrayList<String> linguagensDominadas;
    private ArrayList<Curso> cursosConcluidos;
    private ArrayList<Mentoria> mentoriasParticipadas;

    public Devs(String nome, int nivelExperiencia) {
        this.nome = nome;
        this.nivelExperiencia = nivelExperiencia;
        this.linguagensDominadas = new ArrayList<>();
        this.cursosConcluidos = new ArrayList<>();
        this.mentoriasParticipadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public ArrayList<String> getLinguagensDominadas() {
        return linguagensDominadas;
    }

    public void setLinguagensDominadas(ArrayList<String> linguagensDominadas) {
        this.linguagensDominadas = linguagensDominadas;
    }

    public ArrayList<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(ArrayList<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    public ArrayList<Mentoria> getMentoriasParticipadas() {
        return mentoriasParticipadas;
    }

    public void setMentoriasParticipadas(ArrayList<Mentoria> mentoriasParticipadas) {
        this.mentoriasParticipadas = mentoriasParticipadas;
    }

    public void inscreverEmCurso(Curso curso) {
        cursosConcluidos.add(curso);
    }

    public void participarDeMentoria(Mentoria mentoria) {
        mentoriasParticipadas.add(mentoria);
    }
}
