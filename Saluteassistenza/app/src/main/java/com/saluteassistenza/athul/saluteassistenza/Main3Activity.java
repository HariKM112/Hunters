package com.saluteassistenza.athul.saluteassistenza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }



    public void op(View vv)
    {
        Intent a= new Intent(Main3Activity.this,Main2Activity.class);
        startActivity(a);
    }
}
