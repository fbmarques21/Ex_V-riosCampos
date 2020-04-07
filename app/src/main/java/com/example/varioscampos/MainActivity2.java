package com.example.varioscampos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String Nome = intent.getStringExtra(MainActivity.EXTRA_NOME);
        String Telemovel = intent.getStringExtra(MainActivity.EXTRA_TELEMOVEL);
        String Email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        Integer Idade = intent.getIntExtra(MainActivity.EXTRA_IDADE,0);
        Float Peso = intent.getFloatExtra(MainActivity.EXTRA_PESO,0);
        Float Altura = intent.getFloatExtra(MainActivity.EXTRA_ALTURA,0);

        // Capture the layout's TextView and set the string as its text
        TextView textViewNome = findViewById(R.id.textViewNome);
        TextView textViewTelemovel = findViewById(R.id.textViewTelefone);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewIdade = findViewById(R.id.textViewIdade);
        TextView textViewPeso = findViewById(R.id.textViewPeso);
        TextView textViewAltura = findViewById(R.id.textViewAltura);

        textViewNome.setText(Nome);
        textViewTelemovel.setText(Telemovel);
        textViewEmail.setText(Email);
        textViewIdade.setText(String.valueOf(Idade));
        textViewPeso.setText(String.valueOf(Peso));
        textViewAltura.setText(String.valueOf(Altura));
    }
}
