package br.sp.senai.informatica.afazer.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;

import br.sp.senai.imformatica.afazer.R;

public class AFazerActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edTitulo;
    private FloatingActionButton btAdd;
    public static final int ITEM_NOVO = 0;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afazer_activity);
        edTitulo = (EditText)findViewById(R.id.editText);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new DetalheItem());

        btAdd = (FloatingActionButton)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(this);

    }

    //Implementa o método de View.OnClickListener
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), ItemActivity.class);
        startActivityForResult(intent,ITEM_NOVO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode ==  RESULT_OK){
            adapter.notifyDataSetChanged();
        }
    }
}
