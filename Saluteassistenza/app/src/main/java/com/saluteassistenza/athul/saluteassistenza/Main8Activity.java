package com.saluteassistenza.athul.saluteassistenza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Handler;

public class Main8Activity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main8);



        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent a = new Intent (Main8Activity.this,Main9Activity.class);
                Main8Activity.this.startActivity(a);
                Main8Activity.this.finish();
            }
        }, 1700);
    }

}
