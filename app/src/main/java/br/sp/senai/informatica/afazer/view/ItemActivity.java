package br.sp.senai.informatica.afazer.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import br.sp.senai.imformatica.afazer.R;

/**
 * Created by Android1 on 29/10/2016.
 */

public class ItemActivity extends AppCompatActivity {

    private EditText edDescr;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.item_activity);
        edDescr = (EditText) findViewById(R.id.edDescr);
    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);

        android.app.ActionBar bar = getActionBar();
        if(bar != null){
            bar.setDisplayHomeAsUpEnabled(true);
            bar.setHomeButtonEnabled(true);
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                setResult(RESULT_CANCELED);
                finish();
                break;
            case R.id.ac_salvar:

        }

        return true;
    }
}


