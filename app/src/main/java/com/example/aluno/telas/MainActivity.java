package com.example.aluno.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sobre;
    private Button lab1;
//    Atente-se ao tipo do elemento da View
    private ImageView lab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobre = (Button) findViewById(R.id.buttonSobre);
        lab1 = (Button) findViewById(R.id.buttonLab1);

        // Faça o cast para o tipo correto
        lab3 = (ImageView) findViewById(R.id.btnLab3);

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();

                // Comando para chamar outra tela
                // o new Intent precisa de dois parâmetros: a tela atual.this e a tela que será chamada.class
                startActivity( new Intent(MainActivity.this, SobreActivity.class) );
            }
        });


        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MainActivity.this, Laboratorio1Activity.class));
            }
        });

        lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Laboratorio3Activity.class));
            }
        });

    }
}
