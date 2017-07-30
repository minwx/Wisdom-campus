package com.example.mwx0309.qilusoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ActionBar actionBar =getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        Button button_log =(Button) findViewById(R.id.log_in_button);
        button_log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_log=new Intent("LoginActivity");
                startActivity(intent_log);
            }
        });

        Button button_reg =(Button) findViewById(R.id.register_button);
        button_reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_reg=new Intent("RegisterActivity");
                startActivity(intent_reg);
//                Toast.makeText(StartActivity.this,"zhuce",Toast.LENGTH_LONG).show();
            }
        });

    }
}
