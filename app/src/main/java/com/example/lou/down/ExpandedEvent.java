package com.example.lou.down;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseObject;

public class ExpandedEvent extends Activity {

    private TextView eventText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_expanded_event);

        Intent intent = getIntent();
        EventClass event = (EventClass) intent.getExtras().getSerializable("eventPassed");

        String ampm = "";

        if (event.getHour() < 12){
            ampm = "A.M.";
        } else {
            ampm = "P.M.";
            event.setHour(event.getHour() - 12);
        }

        eventText.setText(event.getName() + "\t" + event.getLocation() + "\n" +
                event.getMonth() + "\\" + event.getDay() + "\\" + event.getYear() + "\n" +
                event.getHour() + ":" + event.getMinute() + ampm + "\n" +
                event.getDiscription());
    }


}
