package com.example.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        editText = findViewById(R.id.et);

    }
    public void btn_edit_click(View v){
        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_LONG).show();

    }
}
