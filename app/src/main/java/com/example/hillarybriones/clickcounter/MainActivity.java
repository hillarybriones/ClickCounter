package com.example.hillarybriones.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ClickMe";
    private TextView mEtName;
    private int clickcount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtName = (TextView) findViewById(R.id.etName);
        mEtName.setText(String.valueOf(clickcount));
        Button btnCnt = (Button) findViewById(R.id.button);

        btnCnt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                clickcount++;
                mEtName.setText(String.valueOf(clickcount));
            }
        });




}


    }



