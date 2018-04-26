package com.example.root.sharedpreferences;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mCountTv;
    private int count;
    private SharedPreferences getmSp;
    private SharedPreferences.Editor mSpEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountTv=(TextView)findViewById(R.id.count_tv);


        getmSp=getSharedPreferences("mySp",MODE_PRIVATE);
        mSpEdit=getmSp.edit();

        count= getmSp.getInt("myscore",0);
        mCountTv.setText(String.valueOf(count));

    }

    public void count(View view) {
        count ++;
        mCountTv.setText(String.valueOf(count));
        mSpEdit.putInt("myscore",count);
        mSpEdit.commit();
    }

    public void goNext(View view) {
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
}
