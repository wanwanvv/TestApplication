package com.example.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //editText =findViewById(R.id.et);
    }
    public void btn_click(View view){
        //Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_LONG).show();

        startActivity(new Intent(this,ActivityTwo.class));

    }
}
