package com.example.varioscampos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOME = "com.example.VariosCampos.Nome";
    public static final String EXTRA_TELEMOVEL = "com.example.VariosCampos.Telemovel";
    public static final String EXTRA_EMAIL = "com.example.VariosCampos.Email";
    public static final String EXTRA_IDADE = "com.example.VariosCampos.Idade";
    public static final String EXTRA_PESO = "com.example.VariosCampos.Peso";
    public static final String EXTRA_ALTURA = "com.example.VariosCampos.Altura";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        EditText editTextNome = (EditText)findViewById(R.id.editTextNome);
        EditText editTextTelemovel =(EditText)findViewById(R.id.editTextTelemovel);
        EditText editTextEmail =(EditText)findViewById(R.id.editTextEmail);
        EditText editTextIdade =(EditText)findViewById(R.id.editTextIdade);
        EditText editTextPeso=(EditText)findViewById(R.id.editTextPeso);
        EditText editTextAltura = (EditText)findViewById(R.id.editTextAltura);

        String Nome = editTextNome.getText().toString();
        String Telemovel = editTextTelemovel.getText().toString();
        String Email = editTextEmail.getText().toString();
        Integer Idade = Integer.parseInt(editTextIdade.getText().toString());
        Float Peso = Float.parseFloat(editTextPeso.getText().toString());
        Float Altura = Float.parseFloat(editTextAltura.getText().toString());

        intent.putExtra(EXTRA_NOME, Nome);
        intent.putExtra(EXTRA_TELEMOVEL, Telemovel);
        intent.putExtra(EXTRA_EMAIL, Email);
        intent.putExtra(EXTRA_IDADE, Idade);
        intent.putExtra(EXTRA_PESO, Peso);
        intent.putExtra(EXTRA_ALTURA,Altura);

        startActivity(intent);
    }
}
