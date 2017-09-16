package com.example.ice.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityAuxiliar2 extends AppCompatActivity {


    Button btnAux2Ret;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auxiliar2);

        btnAux2Ret = (Button) findViewById(R.id.btnAux2Ret);

        editText2 = (EditText) findViewById(R.id.editText2);



        btnAux2Ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editText2.getText().toString();
                Intent resultado = new Intent();
                resultado.putExtra("nome",nome);
                setResult(RESULT_OK, resultado);
                finish();
            }
        });


    }
}
