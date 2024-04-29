package bootcamp;

public class Curso {
    private String nome;
    private String descricao;
    private String instrutor;
    private String horario;

    public Curso(String nome, String descricao, String instrutor) {
        this.nome = nome;
        this.descricao = descricao;
        this.instrutor = instrutor;
    }

    public void definirHorario(String horario) {
        this.horario = horario;
    }
}
