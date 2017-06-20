package com.example.esthefanielanza.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent;
            Bundle bundle = new Bundle();

            if(view.getId() == R.id.activityButton1) {
                intent = new Intent(MainActivity.this, Activity1.class);
                bundle.putString("text","Information transferred to Activity 1 ~");
            } else {
                intent = new Intent(MainActivity.this, Activity2.class);
                bundle.putString("text", "Information transferred to Activity 2 ~");
            }

            intent.putExtras(bundle);
            MainActivity.this.startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activityButton1 = (Button) findViewById(R.id.activityButton1);
        Button activityButton2 = (Button) findViewById(R.id.activityButton2);

        activityButton1.setOnClickListener(click);
        activityButton2.setOnClickListener(click);


    }
}