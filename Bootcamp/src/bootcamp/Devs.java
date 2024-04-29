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

    public void inscreverEmCurso(Curso curso) {
        cursosConcluidos.add(curso);
    }

    public void participarDeMentoria(Mentoria mentoria) {
        mentoriasParticipadas.add(mentoria);
    }
}
