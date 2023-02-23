package com.example.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newFrases(View view) {

        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String [] frases = {"Sonhos são caminhos construídos pelo coração","Impossível é uma palavra que serve só de enfeite no dicionário.",
        "Você é beleza, luz e força.","Um dia bonito começa com um barril de esperança e um café de otimismo."};

        int n = new Random().nextInt(frases.length);

        textFrases.setText(frases[n]);

    }
}