package com.example.rwandaair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PassengerDetailsActivity extends AppCompatActivity {

    Button proceedToBoardingPassBtn;
    ImageView backToFlightDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_details);
        proceedToBoardingPassBtn = (Button) findViewById(R.id.proceed_to_boarding_pass);
        backToFlightDetails = (ImageView) findViewById(R.id.back_to_flight_selection);
        navigateToBoardingPassPage();
        navigateBackToFlightSelectionPage();
    }

    public void navigateToBoardingPassPage() {
        proceedToBoardingPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PassengerDetailsActivity.this,
                        BoardingPassActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

    public void navigateBackToFlightSelectionPage() {
        backToFlightDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PassengerDetailsActivity.this,
                        FlightSelectionActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }
}
