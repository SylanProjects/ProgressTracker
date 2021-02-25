package com.example.gymtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ConstraintHorizontalLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
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
    }
    @SuppressLint("SetTextI18n")
    public void changeName(View v) {
        //R.id.textView
        TextView textViewToChange = (TextView) findViewById(R.id.textView);
        EditText text = (EditText) findViewById(R.id.editTextTextPersonName2);
        //textViewToChange.setText(
        //        "" + text.getText());
        TextView mycomponent;
        mycomponent = new TextView(getApplicationContext());
        mycomponent.setText(text.getText());

        ConstraintLayout conL = (ConstraintLayout) findViewById(R.id.conLay);

        mycomponent.setLayoutParams(textViewToChange.getLayoutParams());
        mycomponent.setY(mycomponent.getY() - 50);
        conL.addView(mycomponent);
    }
}