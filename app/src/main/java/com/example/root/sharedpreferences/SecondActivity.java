package com.example.root.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView textView;
    private SharedPreferences mSp;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=(TextView)findViewById(R.id.textView);

        mSp=getSharedPreferences("mySp",MODE_PRIVATE);
        count= mSp.getInt("myscore",0);
        textView.setText(String.valueOf(count));

    }

}
