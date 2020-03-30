package com.juaracoding.covid19apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Status extends AppCompatActivity {

    Button updateStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        updateStatus = findViewById(R.id.updateStatus);

        updateStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Status.this, ConfirmationStatus.class);
                startActivity(i);
            }
        });
    }
}
