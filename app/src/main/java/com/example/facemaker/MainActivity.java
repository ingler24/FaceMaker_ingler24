package com.example.facemaker;
/**
 * @author Jonah Ingler
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //radio button instance variables
    RadioGroup radioGroup;
    RadioButton radioButton;

    //onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner
        Spinner spinner  = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hairStyles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //radio group
        radioGroup = findViewById(R.id.radioGroup);
    }
    /**
     External Citation
     Date: 1 March 2021
     Problem: struggled to implement a spinner
     Resource: https://youtu.be/on_OrrX7Nw4
     Solution: I followed along and input similar code when usable.
     */

    //checks to see if the radio button is checked
    public void checkButton(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }

    /**
     External Citation
     Date: 2 March 2021
     Problem: struggled to implement a radio button
     Resource: https://youtu.be/fwSJ1OkK304
     Solution: I followed along and input similar code when usable.
     */

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}