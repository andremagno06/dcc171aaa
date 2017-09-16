package com.example.ice.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int PEDE_NOME = 1;
    private Button btnAux1;
    private TextView txtPrincipal;
    private Button btnAux2;
    private Button btnAux3;
    EditText editTextPrincipal;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAux1 = (Button) findViewById(R.id.btnAux1);
        btnAux2 = (Button) findViewById(R.id.btnAux2);
        btnAux3 = (Button) findViewById(R.id.btnAux3);
        txtPrincipal = (TextView) findViewById(R.id.txtPrincipal);
        editTextPrincipal = (EditText) findViewById(R.id.editTextPrincipal);


        btnAux1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enviarDadosParaAuxiliar1 = new Intent(
                        MainActivity.this, ActivityAuxiliar1.class

                );
                enviarDadosParaAuxiliar1.putExtra("mensagem","Olá Mundo!");
                startActivity(enviarDadosParaAuxiliar1);

            }
        });

        btnAux2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedirNome = new Intent(
                        MainActivity.this, ActivityAuxiliar2.class

                );
                startActivityForResult(pedirNome, PEDE_NOME);


            }
        });

        btnAux3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, ActivityAuxiliar3.class

                );
                intent.putExtra("mensagem",editTextPrincipal.getText());
                startActivity(intent);

                startActivityForResult(intent, PEDE_NOME);


            }
        });




    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    if(requestCode ==MainActivity.PEDE_NOME && resultCode == RESULT_OK && data !=null){
        String nome = data.getStringExtra("nome");
        txtPrincipal.setText("Olá"+nome+"!");




    }
    }


}
