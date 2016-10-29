package br.sp.senai.informatica.afazer.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.sp.senai.imformatica.afazer.R;
import br.sp.senai.informatica.afazer.model.Item;

/**
 * Created by Android1 on 22/10/2016.
 */
public class DetalheItem extends BaseAdapter implements  View.OnClickListener {

    List<Item> lista = new ArrayList<>();

    public DetalheItem(){
        lista = Arrays.asList(
                new Item[]{
                        new Item(0L,"Construir o AFazerDAO"),
                        new Item(1L,"Construir")
                });
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int id) {

        Item obj = new Item();
        for (Item item : lista){
            if(item.getId() == id){
                obj = item;
                break;
            }
        }

        return obj;
    }

    @Override
    public long getItemId(int linha) {
        return lista.get(linha).getId();
    }

    @Override
    public View getView(int linha, View view, ViewGroup parent) {
        ConstraintLayout layout;
        if(view == null){
            //construir o layout
            Context ctx = parent.getContext();
            layout = new ConstraintLayout(ctx);
            LayoutInflater servico = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            servico.inflate(R.layout.detalhe_item, layout,true);
        }else{
            //reutilizar o layout
            layout =(ConstraintLayout)view;
        }
        //Obter o item a partir da linha do ListView
        int id = (int)getItemId(linha);
        Item obj = (Item)getItem(id);
        Log.e("DetalheItem", obj.toString());

        CheckBox checkBox = (CheckBox) layout.findViewById(R.id.ckConcluido);
        checkBox.setChecked(obj.isConcluido());
        checkBox.setOnClickListener(this);
        checkBox.setTag(obj.getId());

        TextView textView = (TextView) layout.findViewById(R.id.tvTitulo);
        textView.setText(obj.getDescricao());
        ImageButton imageButton = (ImageButton)layout.findViewById(R.id.btDel);
        imageButton.setOnClickListener(this);
        imageButton.setTag(obj.getId());
        return layout;
    }

    //Implementação da interface
    @Override
    public void onClick(View v) {

    }
}
