package com.example.rwandaair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SeatSelectionActivity extends AppCompatActivity {

    Button complete_check_in;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);

        complete_check_in=findViewById(R.id.complete_check_in);
        complete_check_in();
    }


    private void complete_check_in(){
        complete_check_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),LuggageQuestionActivity.class);
                startActivity(intent);
            }
        });
    }

}
