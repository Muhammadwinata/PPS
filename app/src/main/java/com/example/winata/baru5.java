package com.example.winata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class baru5 extends AppCompatActivity {
    TextView tvNamaValue, tvinValue, tvProdiValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baru5);

        tvNamaValue =findViewById(R.id.tvNamaValue);
        tvinValue = findViewById(R.id.tvinValue);
        tvProdiValue = findViewById(R.id.tvProdiValue);

        Bundle bundle = getIntent().getExtras();
        tvNamaValue.setText(bundle.getString("keyNama"));
        tvinValue.setText(bundle.getString("keyNim"));
        tvProdiValue.setText(bundle.getString("keyProdi"));

        Intent data = getIntent();
        String nama = data.getStringExtra("keyNama");
        String nim = data.getStringExtra("keyNim");
        String Prodi = data.getStringExtra("keyProdi");

        tvNamaValue.setText(nama);
        tvinValue.setText(nim);
        tvProdiValue.setText(Prodi);

    }
}