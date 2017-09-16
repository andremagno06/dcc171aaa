package com.example.ice.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityAuxiliar3 extends AppCompatActivity {

    Button btnAux3Ret;
    EditText editText3;
    TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auxiliar3);


        btnAux3Ret = (Button) findViewById(R.id.btnAux2Ret);

        editText3 = (EditText) findViewById(R.id.editText3);
        textView3 = (TextView) findViewById(R.id.textView3);

        textView3.setText(getIntent().getStringExtra("mensagem"));


        btnAux3Ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editText3.getText().toString();
                Intent resultado = new Intent();
                resultado.putExtra("nome",nome);
                setResult(RESULT_OK, resultado);
                finish();
            }
        });

    }
}
