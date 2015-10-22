package com.example.lou.down;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu_layout);
    }

    //Next Button Functionality
    public void nextButtonSlideOne(View v){
        if(v.getId() == R.id.mainNext){
            Intent i = new Intent(MainActivity.this, secondActivity.class );
            startActivity(i);
        }
    }

    public void nextButtonSlideTwo(View v){
        if(v.getId() == R.id.slideTwoNext){
            Intent i = new Intent(this, thirdActivity.class );
            startActivity(i);
        }
    }


    //Back button functionality
    public void backButtonSlideTwo(View v){
        if(v.getId() == R.id.slideTwoNext){
            Intent i = new Intent(MainActivity.this, MainActivity.class );
            startActivity(i);
        }
    }

    public void backButtonSlideThree(View v){
        if(v.getId() == R.id.slideTwoNext){
            Intent i = new Intent(this, secondActivity.class );
            startActivity(i);
        }
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
