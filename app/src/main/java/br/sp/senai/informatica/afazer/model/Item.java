package br.sp.senai.informatica.afazer.model;

/**
 * Created by Android1 on 15/10/2016.
 */

public class Item{
    private Long id;
    private String descricao;
    private boolean concluido;

    public Item() {
    }
    public Item(Long id ,String descricao) {
        this.descricao = descricao;
        this.id = id;
    }

    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() { return concluido;}

    public void setConcluido(boolean concluido) { this.concluido = concluido; }


    @Override
    public String toString() {
        return "Item{" +
                "concluido=" + concluido +
                ", id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
