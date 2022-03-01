package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txthello, txtnama, txtnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txthello = (TextView) findViewById(R.id.txthello);
        txthello.setText("Hello Word");
        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Dian Bramana Putra");
        txtnim = (TextView) findViewById(R.id.txtnim);
        txtnim.setText("F55119018");
    }
}