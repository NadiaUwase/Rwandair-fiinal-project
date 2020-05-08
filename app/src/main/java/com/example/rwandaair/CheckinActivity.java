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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class CheckinActivity extends AppCompatActivity {

    EditText referenceNoEditTextInputField;
    ImageView checkinGuideIcon;
    Button checkInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        referenceNoEditTextInputField = (EditText) findViewById(R.id.referenceNoEditTextInput);
        checkinGuideIcon = (ImageView) findViewById(R.id.more_info_checkin_icon);
        checkInButton = (Button) findViewById(R.id.startCheckInBtn);
        checkInMoreInfoButtonClick();
        startCheckInClick();
    }

    public void checkInMoreInfoButtonClick() {
        checkinGuideIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckinActivity.this,
                        Reference_number_infoActivity.class);
                startActivity(intent);
            }
        });

    }

    public void startCheckInClick() {
        checkInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckinActivity.this,
                        FlightSelectionActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }
}
