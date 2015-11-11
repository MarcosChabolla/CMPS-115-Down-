package com.example.lou.down;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.parse.Parse;

import com.parse.ParseObject;

////Ideal color code: #ff0fffab

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.mainmenu_layout);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "2dm2ZO6deyFBrptTQSguyhVudhU8pekQ1UuWRE7G", "oFp2oCbrhg1cucYGA3rTfeI7dY5y54Elwi7quEIl");
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

    public void myEventsButton(View v){
        Intent a = new Intent(this, MainActivityScreenTwo.class );
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
