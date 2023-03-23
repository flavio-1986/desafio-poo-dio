import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso de JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição da mentoria em Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFlavio = new Dev();
        devFlavio.setNome("Flávio");
        devFlavio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Flávio:" + devFlavio.getConteudosInscritos());
        devFlavio.progredir();
        devFlavio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Flávio:" + devFlavio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Flávio:" + devFlavio.getConteudosConcluidos());
        System.out.println("XP:" + devFlavio.calcularTotalXp());


        System.out.println("---------");

        Dev devTalita = new Dev();
        devTalita.setNome("Talita");
        devTalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Talita:" + devTalita.getConteudosInscritos());
        devTalita.progredir();
        devTalita.progredir();
        devTalita.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Talita:" + devTalita.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Talita:" + devTalita.getConteudosConcluidos());
        System.out.println("XP:" + devTalita.calcularTotalXp());












    }
}
