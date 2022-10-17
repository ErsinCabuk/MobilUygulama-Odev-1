package com.example.ersin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerUlkeler;
    private ArrayAdapter<CharSequence> adapterUlkeler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerUlkeler = findViewById(R.id.spinnerUlkeler);
        adapterUlkeler = ArrayAdapter.createFromResource(this, R.array.ulkeler, android.R.layout.simple_spinner_item);
        adapterUlkeler.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUlkeler.setAdapter(adapterUlkeler);


    }
}