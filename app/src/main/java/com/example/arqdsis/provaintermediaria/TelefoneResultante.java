package com.example.arqdsis.provaintermediaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by arqdsis on 25/10/2017.
 */

class TelefoneResultante extends Activity /*provaintermediaria - Bruna - 201505451*/{
    String busca;
    EditText resultadoTelefone;
    char[] letras = null;
    String resultado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) /*provaintermediaria - Bruna - 201505451*/{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_telefone);

        Intent intent = getIntent();
        busca = intent.getStringExtra(MainActivity.CHAVE);

        resultadoTelefone = (EditText)findViewById(R.id.resultadoTelefone);
        letras = busca.toCharArray();


        for(int i=0;i<letras.length;i++){
            if(letras[i] == 'A' || letras[i] == 'B' || letras[i] == 'C'){
                resultado += '2';
            }else if(letras[i] == 'D' || letras[i] == 'E' || letras[i] == 'F'){
                resultado += '3';
            }else if(letras[i] == 'G' || letras[i] == 'H' || letras[i] == 'I'){
                resultado += '4';
            }else if(letras[i] == 'J' || letras[i] == 'K' || letras[i] == 'L'){
                resultado += '5';
            }else if(letras[i] == 'M' || letras[i] == 'N' || letras[i] == 'O'){
                resultado += '6';
            }else if(letras[i] == 'P' || letras[i] == 'Q' || letras[i] == 'R' || letras[i] == 'S'){
                resultado += '7';
            }else if(letras[i] == 'T' || letras[i] == 'U' || letras[i] == 'V'){
                resultado += '8';
            }else if(letras[i] == 'W' || letras[i] == 'Y' || letras[i] == 'Z'){
                resultado += '9';
            }else{
                resultado += letras[i];
            }
        }

        resultadoTelefone.setText(resultado);
    }
}
