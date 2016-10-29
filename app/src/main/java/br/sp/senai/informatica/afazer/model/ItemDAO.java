package br.sp.senai.informatica.afazer.model;

import android.util.Log;

import java.util.List;

/**
 * Created by Android1 on 15/10/2016.
 */

public class ItemDAO {
    private List<Item> lista;
    private static long id = 0;

    public ItemDAO(List<Item> lista){
        this.lista = lista;
    }

    public void salvar(Item item){
        if(item.getId() == null){
            item.setId(id++);
            lista.add(item);
        }else{
            Item obj = localizar(item.getId());
            if(obj != null){
                obj.setConcluido(item.isConcluido());
                obj.setDescricao(item.getDescricao());
            }else{
                Log.e("ItemDAO", "Falha em localizar o item id: " +item.getId());
            }
        }
    }

    public Item localizar(long id){
        Item obj = null;
        for (Item item : lista){
            if(item.getId() == id){
                obj = item;
                break;
            }
        }
        return null;
    }



    public List<Item> listar(){

        return lista;
    }

    public void remover(long id){
        Item obj = localizar(id);
        if(obj != null)lista.remove(obj);
    }
}
