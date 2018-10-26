package com.hakanyalitekin.kilogezegen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText girilenKilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        girilenKilo = findViewById(R.id.txtGirilenKilo);
    }

    public void gonderKilo(View view) {

        if (TextUtils.isEmpty(girilenKilo.getText()))
        {
            Toast.makeText(getApplicationContext(), "Kilo girilmelidir.", Toast.LENGTH_LONG).show();

        } else {
            Intent intent = new Intent(this, GosterKilo.class);
            intent.putExtra("girilenKilo", girilenKilo.getText().toString());
            startActivity(intent);
        }

    }
}
