package br.sp.senai.imformatica.afazer.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.sp.senai.imformatica.afazer.R;

public class AFazerActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afazer);
        edTitulo = (EditText)findViewById(R.id.editText);
        Button btSalvar = (Button)findViewById(R.id.btnSalvar);
        btSalvar.setOnClickListener(this);
    }

    //Implementa o método de View.OnClickListener
    @Override
    public void onClick(View view) {
        String titulo = edTitulo.getText().toString();
        Toast.makeText(getApplicationContext(), "O Titulo digitado foi" + titulo, Toast.LENGTH_LONG).show();
        edTitulo.setText("");
    }
}
