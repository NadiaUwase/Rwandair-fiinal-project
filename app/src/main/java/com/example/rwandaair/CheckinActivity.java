package com.example.rwandaair;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class CheckinActivity extends AppCompatActivity {

    TextInputLayout referenceNoTextInputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        referenceNoTextInputField = (TextInputLayout) findViewById(R.id.referenceNoTextInput);
        checkInMoreInfoButtonClick();
    }

    public void checkInMoreInfoButtonClick() {
        referenceNoTextInputField.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Show check in guide", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
