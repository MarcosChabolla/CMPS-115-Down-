package com.example.lou.down;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.ListView;
import android.content.Intent;

public class MainActivityScreenTwo extends Activity {

    private CustomAdapter ca;
    private InviteAdapter ia;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_main_activity_screen_two);

        ca = new CustomAdapter(this);
        ia = new InviteAdapter(this);

        listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(ia);
        ia.loadObjects();
    }

    public void showInvites(View v) {
        if(listView.getAdapter() != ia) {
            listView.setAdapter(ia);
            ia.loadObjects();
        }
    }

    public void showSent(View v) {
        if(listView.getAdapter() != ca) {
            listView.setAdapter(ca);
            ca.loadObjects();
        }
    }

}
