package com.darwin_183303040006.aplikasi_darwin_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TabungActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tabung);

    EditText inputJariJari = findViewById(R.id.input_jari_jari);
    EditText inputTinggi = findViewById(R.id.input_tinggi);
    Button button = findViewById(R.id.button);
    EditText inputHasil = findViewById(R.id.input_hasil);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Integer iJariJari = Integer.parseInt(inputJariJari.getText().toString());
        Integer iTinggi = Integer.parseInt(inputTinggi.getText().toString());
        inputHasil.setText(String.valueOf(3.14 * iJariJari * iJariJari * iTinggi));
      }
    });
  }
}