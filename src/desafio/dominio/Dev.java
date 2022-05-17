/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>(); // LinkedHashSet = coloca os cursos na ordem
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
        
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }
        
    public void inscriverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos()); // pega todos os conteudos do bootcamp
        bootcamp.getDevsIncritos().add(this); // add os devs inscritos no bootcamp
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else{
            System.err.println("Você não esta matriculado em nenhum conteúdo!!");
        }
    }
    
    public double calcularTotalXp(){
       return this.conteudoConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();// pega cada xp de conteudo concluido e soma
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.conteudoInscritos);
        hash = 61 * hash + Objects.hashCode(this.conteudoConcluido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudoInscritos, other.conteudoInscritos)) {
            return false;
        }
        return Objects.equals(this.conteudoConcluido, other.conteudoConcluido);
    }
    
    
}
