package com.example.rwandaair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reference_number_infoActivity extends AppCompatActivity {
    Button donebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_number_info);

        donebtn = (Button) findViewById(R.id.done_button);
        go_back_to_checkin();
    }

    public void go_back_to_checkin() {
        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reference_number_infoActivity.this,
                        CheckinActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }
}
