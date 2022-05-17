/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dominio;

public class Curso extends Conteudo {

    //Atributos
    private int cargaHoraria;

    //Método Contrutor
    public Curso() {

    }
    
    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    //Modificadores de acesso
  
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo= " + getTitulo() + ", descricao= " 
                + getDescricao() + ", cargaHoraria= " + cargaHoraria + '}';
    }

}
