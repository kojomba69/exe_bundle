package com.sunny.www.exe_bundle;
//세번째화면이 안떠..ㅠㅠ

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sub01 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub01);
        Button buttonsecond=findViewById(R.id.buttonsecond);
        buttonsecond.setOnClickListener(this);


        Bundle bundle=getIntent().getExtras();
        TextView textView=(TextView)findViewById(R.id.textViewresult1);
        textView.setText("singleName:   "+bundle.getString("singleName","No Data"));

    }

    @Override
    public void onClick(View v) {
        EditText editTextName1=findViewById(R.id.editText01);

    }
}
