package br.sp.senai.informatica.afazer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android1 on 22/10/2016.
 */

public class AFazer {
    private Long id;
    private String titulo;
    private List<Item> itens = new ArrayList<>();

    public Long getId() {return id; }

    public void setId(Long id) {this.id = id; }

    public List<Item> getItens() { return itens; }

    public void setItens(List<Item> itens) {this.itens = itens; }

    public String getTitulo() { return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public boolean isConcluido(){
        boolean concluido = true;
        for(Item item : itens){
            if(!item.isConcluido()){
                concluido =  false;
                break;
            }
        }
        return concluido && itens.size()>0;
    }

    public void setConluido(boolean valor){}

}
