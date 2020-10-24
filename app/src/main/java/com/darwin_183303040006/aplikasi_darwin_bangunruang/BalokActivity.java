package com.darwin_183303040006.aplikasi_darwin_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BalokActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_balok);

    EditText inputPanjang = findViewById(R.id.input_panjang);
    EditText inputLebar = findViewById(R.id.input_lebar);
    EditText inputTinggi = findViewById(R.id.input_tinggi);
    Button button = findViewById(R.id.button);
    EditText inputHasil = findViewById(R.id.input_hasil);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Integer iPanjang = Integer.parseInt(inputPanjang.getText().toString());
        Integer iLebar = Integer.parseInt(inputLebar.getText().toString());
        Integer iTinggi = Integer.parseInt(inputTinggi.getText().toString());
        inputHasil.setText(String.valueOf(iPanjang * iLebar * iTinggi));
      }
    });
  }
}