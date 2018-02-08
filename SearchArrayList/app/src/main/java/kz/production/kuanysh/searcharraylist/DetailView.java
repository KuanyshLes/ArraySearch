package kz.production.kuanysh.searcharraylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class DetailView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        Intent intent =getIntent();
        String a=intent.getStringExtra("Extra");
        EditText editText=(EditText) findViewById(R.id.inputSearchEditText);
        editText.setText(a+"");

    }
}
