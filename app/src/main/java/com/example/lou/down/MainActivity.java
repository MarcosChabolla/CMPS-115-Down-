package com.example.lou.down;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

////Ideal color code: #ff0fffab

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu_layout);
    }

    //Next Button Functionality
    public void nextButtonSlideOne(View v){
        EditText EventName = (EditText)findViewById(R.id.eventName);
        EditText EventDisc = (EditText)findViewById(R.id.eventDiscription);

        EventClass event = new EventClass();

        event.setName(EventName.getText().toString());
        event.setEventDiscription(EventDisc.getText().toString());

        Intent a = new Intent(this, secondActivity.class );
        a.putExtra("eventFromSlideOne", event);
        startActivity(a);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_down, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        ///hello
        ///
        //
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
