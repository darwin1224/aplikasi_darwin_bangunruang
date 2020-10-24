package com.darwin_183303040006.aplikasi_darwin_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class KubusActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_kubus);

    EditText inputSisi = findViewById(R.id.input_sisi);
    Button button = findViewById(R.id.button);
    EditText inputHasil = findViewById(R.id.input_hasil);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Integer iSisi = Integer.parseInt(inputSisi.getText().toString());
        inputHasil.setText(String.valueOf(iSisi * iSisi * iSisi));
      }
    });
  }
}