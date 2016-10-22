package br.sp.senai.imformatica.afazer.model;

/**
 * Created by Android1 on 15/10/2016.
 */

public class Item{
    private Long id;
    private String titulo;
    private boolean concluido;

    public Item() {
    }
    public Item(Long id ,String titulo) {
        this.titulo = titulo;
        this.id = id;
    }

    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isConcluido() { return concluido;}

    public void setConcluido(boolean concluido) { this.concluido = concluido; }


    @Override
    public String toString() {
        return "Item{" +
                "concluido=" + concluido +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
