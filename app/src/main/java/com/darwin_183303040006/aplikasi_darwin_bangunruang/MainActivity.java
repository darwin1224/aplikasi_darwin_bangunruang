package com.darwin_183303040006.aplikasi_darwin_bangunruang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ListView listView = findViewById(R.id.listview);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.listview_entry, android.R.layout.simple_list_item_1);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch ((int) adapter.getItemId(position)) {
          case 0:
            startActivity(new Intent(view.getContext(), BalokActivity.class));
            break;
          case 1:
            startActivity(new Intent(view.getContext(), KubusActivity.class));
            break;
          case 2:
            startActivity(new Intent(view.getContext(), TabungActivity.class));
            break;
        }
      }
    });
  }
}