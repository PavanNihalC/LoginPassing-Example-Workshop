package com.lagdroidstudios.android.loginpassingdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PavanNihal on 26/08/16.
 */
public class LoggedInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged_in);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String password = intent.getStringExtra("password");
        TextView output = (TextView) findViewById(R.id.textView);
        TextView output2 = (TextView) findViewById(R.id.textView2);
        output.setText("The username is " + name);
        output2.setText("The password is " + password);
    }
}
