package com.saluteassistenza.athul.saluteassistenza;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    {
        mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        CalendarView c = (CalendarView) findViewById(R.id.calendarView);
                        c.setVisibility(View.VISIBLE);
                        Button b = (Button) findViewById(R.id.button5);
                        Button b1 = (Button) findViewById(R.id.button4);
                        Button b2 = (Button) findViewById(R.id.button3);


                        ImageView im = (ImageView) findViewById(R.id.imageView);
                        im.setVisibility(View.GONE);
                        TextView av3 = (TextView) findViewById(R.id.textView2);
                        av3.setVisibility(View.GONE);
                        TextView tv = (TextView) findViewById(R.id.textView14);
                        tv.setVisibility(View.GONE);
                        TextView tv1 = (TextView) findViewById(R.id.textView15);
                        tv1.setVisibility(View.GONE);
                        TextView tv2 = (TextView) findViewById(R.id.textView16);
                        tv2.setVisibility(View.GONE);
                        TextView tv3 = (TextView) findViewById(R.id.textView17);
                        tv3.setVisibility(View.GONE);
                        TextView tv4 = (TextView) findViewById(R.id.textView18);
                        tv4.setVisibility(View.GONE);
                        TextView tv5 = (TextView) findViewById(R.id.textView19);
                        tv5.setVisibility(View.GONE);


                        TextView v23 = (TextView) findViewById(R.id.textView8);
                        v23.setVisibility(View.VISIBLE);
                        TextView v = (TextView) findViewById(R.id.textView13);
                        v.setVisibility(View.GONE);
                        TextView v20 = (TextView) findViewById(R.id.textView12);
                        v20.setVisibility(View.VISIBLE);


                        TextView v17 = (TextView) findViewById(R.id.textView10);
                        v17.setVisibility(View.VISIBLE);
                        TextView v18 = (TextView) findViewById(R.id.textView11);
                        v18.setVisibility(View.VISIBLE);
                        TextView v19 = (TextView) findViewById(R.id.textView9);
                        v19.setVisibility(View.VISIBLE);
                        EditText t = (EditText) findViewById(R.id.editText5);
                        t.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        b1.setVisibility(View.GONE);
                        b2.setVisibility(View.GONE);
                        return true;
                    case R.id.navigation_dashboard:
                        CalendarView c1 = (CalendarView) findViewById(R.id.calendarView);
                        c1.setVisibility(View.GONE);
                        TextView v1 = (TextView) findViewById(R.id.textView13);
                        v1.setVisibility(View.VISIBLE);


                        ImageView im1 = (ImageView) findViewById(R.id.imageView);
                        im1.setVisibility(View.GONE);
                        TextView tv6 = (TextView) findViewById(R.id.textView14);
                        tv6.setVisibility(View.GONE);
                        TextView tv7 = (TextView) findViewById(R.id.textView15);
                        tv7.setVisibility(View.GONE);
                        TextView tv8 = (TextView) findViewById(R.id.textView16);
                        tv8.setVisibility(View.GONE);
                        TextView tv9 = (TextView) findViewById(R.id.textView17);
                        tv9.setVisibility(View.GONE);
                        TextView tv10 = (TextView) findViewById(R.id.textView18);
                        tv10.setVisibility(View.GONE);
                        TextView tv11 = (TextView) findViewById(R.id.textView19);
                        tv11.setVisibility(View.GONE);

                        TextView v21 = (TextView) findViewById(R.id.textView8);
                        v21.setVisibility(View.GONE);
                        TextView v5 = (TextView) findViewById(R.id.textView12);
                        v5.setVisibility(View.GONE);
                        TextView v6 = (TextView) findViewById(R.id.textView10);
                        v6.setVisibility(View.GONE);
                        TextView v7 = (TextView) findViewById(R.id.textView11);
                        v7.setVisibility(View.GONE);
                        TextView v8 = (TextView) findViewById(R.id.textView9);
                        v8.setVisibility(View.GONE);
                        TextView sv3 = (TextView) findViewById(R.id.textView2);
                        sv3.setVisibility(View.GONE);
                        Button b3 = (Button) findViewById(R.id.button5);
                        Button b4 = (Button) findViewById(R.id.button4);
                        Button b5 = (Button) findViewById(R.id.button3);
                        EditText t1 = (EditText) findViewById(R.id.editText5);
                        t1.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b5.setVisibility(View.VISIBLE);
                        return true;
                    case R.id.navigation_notifications:
                        CalendarView c2 = (CalendarView) findViewById(R.id.calendarView);
                        c2.setVisibility(View.GONE);
                        TextView v13 = (TextView) findViewById(R.id.textView12);
                        v13.setVisibility(View.GONE);
                        TextView v22 = (TextView) findViewById(R.id.textView8);
                        v22.setVisibility(View.GONE);

                        ImageView im2 = (ImageView) findViewById(R.id.imageView);
                        im2.setVisibility(View.GONE);
                        TextView tv12 = (TextView) findViewById(R.id.textView14);
                        tv12.setVisibility(View.GONE);
                        TextView tv13 = (TextView) findViewById(R.id.textView15);
                        tv13.setVisibility(View.GONE);
                        TextView tv14 = (TextView) findViewById(R.id.textView16);
                        tv14.setVisibility(View.GONE);
                        TextView tv15 = (TextView) findViewById(R.id.textView17);
                        tv15.setVisibility(View.GONE);
                        TextView tv16 = (TextView) findViewById(R.id.textView18);
                        tv16.setVisibility(View.GONE);
                        TextView tv17 = (TextView) findViewById(R.id.textView19);
                        tv17.setVisibility(View.GONE);

                        TextView v14 = (TextView) findViewById(R.id.textView10);
                        v14.setVisibility(View.GONE);
                        TextView v15 = (TextView) findViewById(R.id.textView11);
                        v15.setVisibility(View.GONE);
                        TextView v16 = (TextView) findViewById(R.id.textView9);
                        v16.setVisibility(View.GONE);
                        TextView v2 = (TextView) findViewById(R.id.textView13);
                        v2.setVisibility(View.GONE);
                        EditText t2 = (EditText) findViewById(R.id.editText5);
                        t2.setVisibility(View.GONE);
                        TextView cv3 = (TextView) findViewById(R.id.textView2);
                        cv3.setVisibility(View.GONE);
                        Button b6 = (Button) findViewById(R.id.button5);
                        Button b7 = (Button) findViewById(R.id.button4);
                        Button b8 = (Button) findViewById(R.id.button3);
                        b6.setVisibility(View.GONE);
                        b7.setVisibility(View.GONE);
                        b8.setVisibility(View.GONE);
                        return true;

                    case R.id.b:
                        CalendarView c3 = (CalendarView) findViewById(R.id.calendarView);
                        c3.setVisibility(View.GONE);
                        TextView v9 = (TextView) findViewById(R.id.textView12);
                        v9.setVisibility(View.GONE);
                        TextView v24 = (TextView) findViewById(R.id.textView8);
                        v24.setVisibility(View.GONE);

                        ImageView im3 = (ImageView) findViewById(R.id.imageView);
                        im3.setVisibility(View.VISIBLE);
                        TextView tv18 = (TextView) findViewById(R.id.textView14);
                        tv18.setVisibility(View.VISIBLE);
                        TextView tv19 = (TextView) findViewById(R.id.textView15);
                        tv19.setVisibility(View.VISIBLE);
                        TextView tv20 = (TextView) findViewById(R.id.textView16);
                        tv20.setVisibility(View.VISIBLE);
                        TextView tv21 = (TextView) findViewById(R.id.textView17);
                        tv21.setVisibility(View.VISIBLE);
                        TextView tv22 = (TextView) findViewById(R.id.textView18);
                        tv22.setVisibility(View.VISIBLE);
                        TextView tv23 = (TextView) findViewById(R.id.textView19);
                        tv23.setVisibility(View.VISIBLE);

                        TextView v10 = (TextView) findViewById(R.id.textView10);
                        v10.setVisibility(View.GONE);
                        TextView v11 = (TextView) findViewById(R.id.textView11);
                        v11.setVisibility(View.GONE);
                        TextView v12 = (TextView) findViewById(R.id.textView9);
                        v12.setVisibility(View.GONE);
                        TextView v3 = (TextView) findViewById(R.id.textView13);
                        v3.setVisibility(View.GONE);
                        TextView vv3 = (TextView) findViewById(R.id.textView2);
                        vv3.setVisibility(View.VISIBLE);
                        EditText t3 = (EditText) findViewById(R.id.editText5);
                        t3.setVisibility(View.GONE);
                        Button b9 = (Button) findViewById(R.id.button5);
                        Button b10 = (Button) findViewById(R.id.button4);
                        Button b11 = (Button) findViewById(R.id.button3);
                        b9.setVisibility(View.GONE);
                        b10.setVisibility(View.GONE);
                        b11.setVisibility(View.GONE);
                        return true;

                }
                return false;
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    public void op2(View vi7)
    {
       Intent a=new Intent(Main2Activity.this,Main3Activity.class);
       startActivity(a);
    }

    public void op3(View vi8)
    {
        Intent a1=new Intent(Main2Activity.this,Main5Activity.class);
        startActivity(a1);
    }

    public void op4(View vi9)
    {
        Intent a2=new Intent(Main2Activity.this,Serial_monitor.class);
        startActivity(a2);
    }
    public void opo(View vi9)
    {
        Intent a2=new Intent(Main2Activity.this,Main5Activity.class);
        startActivity(a2);
    }

}
