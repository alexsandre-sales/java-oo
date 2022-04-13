import poo.dominio.*;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Java");
    curso1.setDescricao("Curso sobre Java");
    curso1.setCargaHoraria(8);

//    System.out.println(curso1);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Softskill");
    mentoria1.setDescricao("Falar sobre emoçoes");
    mentoria1.setData(LocalDate.now());

//    System.out.println(mentoria1);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("BootJava");
    bootcamp.setDescricao("Java descrição");
    bootcamp.getConteudo().add(curso1);
    bootcamp.getConteudo().add(mentoria1);

    Dev dev = new Dev();
    dev.setNome("Xypto");

    dev.inscreverBootcampo(bootcamp);

    System.out.println("Conteudos " + dev.getConteudoInscritos());
    dev.progredir();
    dev.progredir();

    System.out.println("Conteudos " + dev.getConteudoInscritos());
    System.out.println("Concluidos " + dev.getConteudoConcluidos());
    System.out.println("XP: " + dev.calcularTotalXp());
  }
}
