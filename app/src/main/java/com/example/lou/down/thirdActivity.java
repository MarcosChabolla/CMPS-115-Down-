package com.example.lou.down;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by Marcos on 10/20/2015.
 */
public class thirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
    }

    public void sendButtonSlideThree(View v) {
        EditText EventAccept = (EditText)findViewById(R.id.eventAccept);
        EditText EventDeny = (EditText)findViewById(R.id.eventDeny);
        TimePicker EventTime = (TimePicker)findViewById(R.id.timePicker);

        Intent intent = getIntent();
        EventClass event = (EventClass) intent.getExtras().getSerializable("eventFromSlideTwo");


        if (EventAccept.getText().toString() == ""){
            event.setAccept("Down");
        } else {
            event.setAccept(EventAccept.getText().toString());
        }
        if (EventDeny.getText().toString() == ""){
            event.setDeny("Nahh");
        } else {
            event.setDeny(EventAccept.getText().toString());
        }

        event.setHour(EventTime.getCurrentHour());
        event.setMinute(EventTime.getCurrentMinute());

        Intent c = new Intent(this, MainActivity.class );
        c.putExtra("eventFromSlideThree", event);
        startActivity(c);
        CharSequence confirmation = "Event Created";
        Toast toast = Toast.makeText(getApplicationContext(),confirmation, Toast.LENGTH_LONG);
        toast.show();
    }

    public void backButtonSlideThree(View v) {
        Intent b = new Intent(this, secondActivity.class);
        startActivity(b);
    }

}
