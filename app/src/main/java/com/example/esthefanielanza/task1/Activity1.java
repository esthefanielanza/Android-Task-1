package com.example.esthefanielanza.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("text");
        TextView textView = (TextView) findViewById(R.id.transferMsg);
        textView.setText(text);
    }
}
