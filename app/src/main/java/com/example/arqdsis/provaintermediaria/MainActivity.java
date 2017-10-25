package com.example.arqdsis.provaintermediaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity /*provaintermediaria - Bruna - 201505451*/{

    public static final String CHAVE = "com.example.arqdsis.provaintermediaria.busca";
    EditText buscaTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buscaTelefone = (EditText)findViewById(R.id.busca_telefone);
    }

    public void buscarTelefone(View view) /*provaintermediaria - Bruna - 201505451*/{
        String busca = buscaTelefone.getText().toString();
        Intent intent = new Intent(this, TelefoneResultante.class);
        intent.putExtra(CHAVE, busca);
        startActivity(intent);
    }
}
