package com.example.lou.down;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

/**
 * Created by kchinnap on 11/7/2015.
 */

public class LoginClass extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void login_event(View v) {
        EditText username = (EditText) findViewById(R.id.eventUsername);
        EditText password = (EditText) findViewById(R.id.eventPassword);
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Intent a = new Intent(this, MainActivity.class );
            startActivity(a);
            //correcct password
        } else {
            //wrong password
        }
    }
}

