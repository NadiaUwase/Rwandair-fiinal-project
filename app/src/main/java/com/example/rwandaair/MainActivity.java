package com.example.rwandaair;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button checkInPageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkInPageBtn = (Button) findViewById(R.id.checkInPageBtn);
        navigateToCheckinActivity();
    }

    public void navigateToCheckinActivity() {
        checkInPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        CheckinActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }
}
