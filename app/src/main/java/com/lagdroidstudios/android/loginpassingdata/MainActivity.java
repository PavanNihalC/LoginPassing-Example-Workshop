package com.lagdroidstudios.android.loginpassingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.button);
        name = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                String pass = password.getText().toString();
                Intent intent = new Intent(MainActivity.this,LoggedInActivity.class);
                intent.putExtra("name",username);
                intent.putExtra("password",pass);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
