package com.example.menucont;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.ContextMenu;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMenuContex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///declaraciones para menu contextual
        tvMenuContex = (TextView) findViewById(R.id.precolonial);
       registerForContextMenu(tvMenuContex);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    //crea el menu de opciones
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override//menu de opciones
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(),"Opcion # 1",Toast.LENGTH_LONG).show();
                break;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(),"Opcion # 2",Toast.LENGTH_SHORT).show();

                break;
            case R.id.opcion3:
                Toast.makeText(getApplicationContext(),"Opcion # 3",Toast.LENGTH_SHORT).show();

                break;
        }
        //noinspection SimplifiableIfStatement
       /* if (id == R.id.opcion1) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override// menu contextual
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main, menu);


    }
    //manejar los eventos del menu contextual

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(),"Opcion # 1",Toast.LENGTH_LONG).show();
                break;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(),"Opcion # 2",Toast.LENGTH_SHORT).show();

                break;
            case R.id.opcion3:
                Toast.makeText(getApplicationContext(),"Opcion # 3",Toast.LENGTH_SHORT).show();

                break;
        }

        return super.onContextItemSelected(item);
    }
}