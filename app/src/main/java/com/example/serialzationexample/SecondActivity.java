package com.example.serialzationexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends Activity {
     private TextView textViewMessage,textViewPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textViewMessage = findViewById(R.id.textViewMessage);
        textViewPerson = findViewById(R.id.viewPerson);
        String getMessage = getIntent().getStringExtra("sampleKey");
        textViewMessage.setText(getMessage);

        Person person = (Person) getIntent().getSerializableExtra("person");

        textViewPerson.setText(person.getFirstName()+ "," + person.getLastName() + "," + person.getQualification());
    }
}
