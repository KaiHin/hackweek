package com.kaihin.hackweek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class moodActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.kaihin.hackweek.MESSAGE";

    /* Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood);
    }
    //Called when button is clicked
        public void sendSentence(View view) {
        // Start an activity called displaySentenceActivity
        Intent intent = new Intent(this, displaySentenceActivity.class);
        // Carry bundle of data to new activity through method findViewById
        EditText whereText = (EditText) findViewById(R.id.whereText);
        String message = whereText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        // feelTtext = (EditText) findViewById(R.id.feelText);
        // withText = (EditText) findViewById(R.id.withText);
        // musicstyleText = (EditText) findViewById(R.id.muscistyleText);
        // buttonPlay = (Button) findViewById(R.id.buttonPlay);
        }
}
