package com.juaracoding.covid19apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Condition extends AppCompatActivity {
    Button btnAroundCondition, btnUpdateStatus2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition);

        btnAroundCondition = findViewById(R.id.btnAroundCondition);
        btnUpdateStatus2 = findViewById(R.id.btnUpdateStatus2);

        btnAroundCondition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Condition.this, AroundCondition.class);
                startActivity(i);
            }
        });

        btnUpdateStatus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Condition.this, Status.class);
                startActivity(i);
            }
        });
    }
}
