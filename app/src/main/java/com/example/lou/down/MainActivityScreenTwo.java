package com.example.lou.down;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivityScreenTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_main_activity_screen_two);

        TabHost tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();

        TabHost.TabSpec tabSpec = tabhost.newTabSpec("Sent");
        tabSpec.setContent(R.id.tabSent);
        tabSpec.setIndicator("SENT");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("Recieved");
        tabSpec.setContent(R.id.tabRecieved);
        tabSpec.setIndicator("RECIEVED");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("Local");
        tabSpec.setContent(R.id.tabLocal);
        tabSpec.setIndicator("Local");
        tabhost.addTab(tabSpec);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_screen_two, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
