package com.example.winata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvnama, tvnim;
    EditText tvprodi;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvnama = findViewById(R.id.tvnama);
        tvnim = findViewById(R.id.tvnim);
        tvprodi = findViewById(R.id.tvprodi);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String nama = tvnama.getText().toString();
                    String nim = tvnim.getText().toString();
                    String prodi =tvprodi.getText().toString();

                    if (prodi.isEmpty()){
                        Toast.makeText(getApplication(), "Program Studi harus diisi", Toast.LENGTH_SHORT).show();
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("keyNama", nama);
                        bundle.putString("keyNim",nim);
                        bundle.putString("keyProdi",prodi);
                        Intent i = new Intent(MainActivity.this,baru5.)
                    }
                }


            }
        });

    }
}