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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
