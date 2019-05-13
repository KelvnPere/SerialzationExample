package com.example.serialzationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonActivity = findViewById(R.id.button_activity);
        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is creating an Explicit Intent
               Intent i = new Intent(MainActivity.this, SecondActivity.class);
               i.putExtra("sampleKey", "This is the message that i am passing from the First Activity to the Second Activity");

               Person person = new Person();
               person.setFirstName("Kelvin");
               person.setLastName("Pere");
               person.setQualification("B.sc");

               i.putExtra("person",person);
                startActivity(i);

//              // Created an Implicit Intent that matches with Second Activity using Intent-filter in Manifest file.
//              Intent intent = new Intent();
//              intent.setAction("com.example.google");
//              intent.addCategory(Intent.CATEGORY_DEFAULT);
            }
        });
    }
}
