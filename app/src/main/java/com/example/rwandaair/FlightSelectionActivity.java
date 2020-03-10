package com.example.rwandaair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FlightSelectionActivity extends AppCompatActivity {

    Button proceedToPassengerConfirmationBtn;
    ImageView backToCheckIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_selection);

        proceedToPassengerConfirmationBtn = (Button) findViewById(R.id.proceed_to_passenger_details);
        backToCheckIn = (ImageView) findViewById(R.id.back_to_checkin_start);
        navigateToPassengerDetails();
        navigateBackToCheckIn();
    }
    public void navigateToPassengerDetails() {
        proceedToPassengerConfirmationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlightSelectionActivity.this,
                        PassengerDetailsActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

    public void navigateBackToCheckIn() {
        backToCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlightSelectionActivity.this,
                        CheckinActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }
}

