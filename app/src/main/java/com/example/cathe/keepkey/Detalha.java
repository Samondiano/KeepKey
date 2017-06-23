package com.example.cathe.keepkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detalha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalha);

        Intent i = getIntent();
        TextView detalhamento = (TextView) findViewById(R.id.textDetalha);
        detalhamento.setText(i.getStringExtra("info"));
    }
}
