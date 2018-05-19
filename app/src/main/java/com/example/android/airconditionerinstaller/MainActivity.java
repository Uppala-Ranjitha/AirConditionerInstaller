package com.example.android.airconditionerinstaller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText mailid;
    private static EditText password;
    private static Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn();
    }
    public void logIn(){
        mailid = (EditText) findViewById(R.id.email_login);
        password = (EditText) findViewById(R.id.password_login);
        login_btn = (Button) findViewById(R.id.signin_login);
        password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mailid.getText().toString().equals("user.111@gmail.com") &&
                        password.getText().toString().equals("pass")  ) {
                    Toast.makeText(MainActivity.this, "User and Password is correct",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "User and Password is not correct",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void goToSignUp(View view){
        Intent sign = new Intent(this,SignUp.class);
        startActivity(sign);
    }

}
