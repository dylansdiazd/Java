package bootcamp;

public class Mentoria {
    private String titulo;
    private String descricao;
    private String mentor;
    private String horario;

    public Mentoria(String titulo, String descricao, String mentor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.mentor = mentor;
    }

    public void definirHorario(String horario) {
        this.horario = horario;
    }
}
