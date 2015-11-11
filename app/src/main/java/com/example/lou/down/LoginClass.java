package com.example.lou.down;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by kchinnap on 11/7/2015.
 */

public class LoginClass extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_Login);
        setContentView(R.layout.login_layout);
    }

    public void login_event(View v) {
        EditText username = (EditText) findViewById(R.id.eventUsername);
        EditText password = (EditText) findViewById(R.id.eventPassword1);
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Intent a = new Intent(this, MainActivity.class );
            startActivity(a);
            //correct password
        } else {
            CharSequence error = "Invalid Password or Username";
            Toast toast = Toast.makeText(getApplicationContext(),error, Toast.LENGTH_SHORT);
            toast.show();
            password.setText("");
            //wrong password
        }
    }

    public void do_signup(View v) {
        startActivity(new Intent(this, SignUpActivity.class));
    }
}

