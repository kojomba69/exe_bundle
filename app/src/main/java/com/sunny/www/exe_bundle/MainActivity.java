package com.sunny.www.exe_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonstart=findViewById(R.id.buttonstart);
        buttonstart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editTextName = findViewById(R.id.editText01);
        String editTextNameString = editTextName.getText().toString();

        Bundle bundle=new Bundle();
        bundle.putString("singleName",editTextNameString);
        Intent intent=new Intent(this,sub01.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
