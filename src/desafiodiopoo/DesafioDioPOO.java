/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiodiopoo;

import desafio.dominio.Bootcamp;
import desafio.dominio.Conteudo;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;
import java.time.LocalDate;


public class DesafioDioPOO {
   
    public static void main(String[] args) {
      
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso MySQL");
        curso2.setDescricao("Descrição curso MySQL");
        curso2.setCargaHoraria(10);
        
       // Conteudo conteudo = new Curso();  // exemplo polimorfismo 
       // Conteudo conteudo1 = new Mentoria(); // polimorfismo
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscriverBootcamp(bootcamp);        
        System.out.println("============================================================");
        System.out.println("Conteudos Inscritos Bruna "+devBruna.getConteudoInscritos());
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("==");
        System.out.println("Conteudos Inscritos Bruna "+devBruna.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Bruna " + devBruna.getConteudoConcluido());
        System.out.println("XP " + devBruna.calcularTotalXp());
        
        System.out.println("============================================================");
        
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscriverBootcamp(bootcamp);
        
        System.out.println("Conteudos Inscritos Pedro "+devPedro.getConteudoInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("==");
        System.out.println("Conteudos Inscritos Pedro "+devPedro.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Pedro " + devPedro.getConteudoConcluido());
        System.out.println("XP " +devPedro.calcularTotalXp());
        
        System.out.println("============================================================");
    }
    
}
