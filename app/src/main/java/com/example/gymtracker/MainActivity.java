package com.example.gymtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ConstraintHorizontalLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }
    @SuppressLint("SetTextI18n")
    public void changeName(View v) {
        // Used to retrieve text
        TextView textViewToChange = (TextView) findViewById(R.id.textView);
        EditText text = (EditText) findViewById(R.id.editTextTextPersonName2);

        // Used to create a new component and set its text
        TextView mycomponent;
        mycomponent = new TextView(getApplicationContext());
        mycomponent.setText(text.getText());

        // Used to create the text in a layout
        ConstraintLayout conL = (ConstraintLayout) findViewById(R.id.conLay);
        mycomponent.setLayoutParams(textViewToChange.getLayoutParams());
        mycomponent.setY(mycomponent.getY() - 50);
        conL.addView(mycomponent);
    }
    public void activityAddTracker(View v) {
        // Launch a new activity
        Intent intent = new Intent(this, AddTrackerActivity.class);
        startActivity(intent);

    }

}