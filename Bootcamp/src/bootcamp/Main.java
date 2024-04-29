package bootcamp;

public class Main {
    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Localização X");
        

        Curso cursoJava = new Curso("Java Fundamentals", "Curso introdutório de Java", "Instrutor A");
        Curso cursoWeb = new Curso("Desenvolvimento Web", "Curso de desenvolvimento web", "Instrutor B");
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoWeb);
        

        Mentoria mentorshipJava = new Mentoria("Mentoria Java Avançado", "Mentoria sobre conceitos avançados de Java", "Mentor C");
        Mentoria mentorshipCareer = new Mentoria("Desenvolvimento de Carreira", "Mentoria sobre progressão de carreira na área de TI", "Mentor D");
        bootcamp.adicionarMentoria(mentorshipJava);
        bootcamp.adicionarMentoria(mentorshipCareer);
        

        Devs developer1 = new Devs("João", 2); 
        Devs developer2 = new Devs("Maria", 3); 
        

        developer1.inscreverEmCurso(cursoJava);
        developer1.participarDeMentoria(mentorshipCareer);
        
        developer2.inscreverEmCurso(cursoWeb);
        developer2.participarDeMentoria(mentorshipJava);
        

        System.out.println("Cursos oferecidos no bootcamp:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println(curso.getNome() + ": " + curso.getDescricao());
        }
        
        System.out.println("\nMentorias oferecidas no bootcamp:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println(mentoria.getTitulo() + ": " + mentoria.getDescricao());
        }
        
        System.out.println("\nDesenvolvedores inscritos em cursos:");
        for (Curso curso : developer1.getCursosConcluidos()) {
            System.out.println(developer1.getNome() + " está inscrito no curso: " + curso.getNome());
        }
        for (Curso curso : developer2.getCursosConcluidos()) {
            System.out.println(developer2.getNome() + " está inscrito no curso: " + curso.getNome());
        }
        
        System.out.println("\nDesenvolvedores participando de mentorias:");
        for (Mentoria mentoria : developer1.getMentoriasParticipadas()) {
            System.out.println(developer1.getNome() + " está participando da mentoria: " + mentoria.getTitulo());
        }
        for (Mentoria mentoria : developer2.getMentoriasParticipadas()) {
            System.out.println(developer2.getNome() + " está participando da mentoria: " + mentoria.getTitulo());
        }
    }
}
