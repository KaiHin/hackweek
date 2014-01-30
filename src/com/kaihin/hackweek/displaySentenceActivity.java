package com.kaihin.hackweek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by kaihin on 1/29/14.
 */
public class displaySentenceActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(moodActivity.EXTRA_MESSAGE);

        // Create the text view
        TextView setText = new TextView(this);
        setText.setTextSize(40);
        setText.setText(message);

        // Set the text view as the activity layout
        setContentView(setText);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

