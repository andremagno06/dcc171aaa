package com.example.ice.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityAuxiliar1 extends AppCompatActivity {



    private TextView txtAux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        txtAux = (TextView) findViewById(R.id.txtAux);

        txtAux.setText(getIntent().getStringExtra("mensagem"));


        }















}
