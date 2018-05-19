package com.example.android.airconditionerinstaller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    private Object GetEditText;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void goToLogIn(View view){
        Intent log = new Intent(this,MainActivity.class);
        startActivity(log);
    }
    EditText ftname = (EditText) findViewById(R.id.first_name);
    EditText ltname = (EditText) findViewById(R.id.last_name);
    EditText email = (EditText) findViewById(R.id.email_reg);
    EditText ctry = (EditText) findViewById(R.id.country);
    EditText pannum = (EditText) findViewById(R.id.pan_num);
    EditText aadharnum = (EditText) findViewById(R.id.aadhar_num);
    EditText bankname = (EditText) findViewById(R.id.bank_name);
    EditText brnchname = (EditText) findViewById(R.id.branch_name);
    EditText accnum = (EditText) findViewById(R.id.bank_acc);
    EditText ifscnum = (EditText) findViewById(R.id.ifsc_num);
    EditText pas = (EditText) findViewById(R.id.password_reg);
    EditText cpas = (EditText) findViewById(R.id.confirm_password_reg);
    public void signingUp(View view){
             Button sign = (Button) findViewById(R.id.sign);
            sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String isfn = ftname.getText().toString();
                 if(TextUtils.isEmpty(isfn)){
                        msg = "You must enter your first name";
                        TextView  fn = (TextView) findViewById(R.id.confirm_star_fname);
                        fn.setText(msg);
                 }
                 String isln = ltname.getText().toString();
                 if(TextUtils.isEmpty(isln)){
                     msg = "You must enter your last name";
                     TextView ln = (TextView) findViewById(R.id.confirm_star_lname);
                     ln.setText(msg);
                 }
                String em = email.getText().toString();
                if(TextUtils.isEmpty(em)){
                    msg = "You must enter your mail id";
                    TextView mail = (TextView) findViewById(R.id.confirm_star_email);
                    mail.setText(msg);
                }
                String pan = pannum.getText().toString();
                if(TextUtils.isEmpty(pan)){
                    msg = "You must enter your pan number";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_pan);
                    ln.setText(msg);
                }
                String aadhar = aadharnum.getText().toString();
                if(TextUtils.isEmpty(aadhar)){
                    msg = "You must enter your aadhar number";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_aadhar);
                    ln.setText(msg);
                }
                String bname = bankname.getText().toString();
                if(TextUtils.isEmpty(bname)){
                    msg = "You must enter your bank name";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_bank_name);
                    ln.setText(msg);
                }
                String brname = brnchname.getText().toString();
                if(TextUtils.isEmpty(brname)){
                    msg = "You must enter your branch name";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_branch);
                    ln.setText(msg);
                }
                String acc = accnum.getText().toString();
                if(TextUtils.isEmpty(acc)){
                    msg = "You must enter your account number";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_acc);
                    ln.setText(msg);
                }
                String ifsc = ifscnum.getText().toString();
                if(TextUtils.isEmpty(ifsc)){
                    msg = "You must enter your IFSC code";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_lname);
                    ln.setText(msg);
                }
                String pasword = pas.getText().toString();
                if(TextUtils.isEmpty(pasword)){
                    msg = "Enter password";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_password);
                    ln.setText(msg);
                }
                String cpasword = cpas.getText().toString();
                if(TextUtils.isEmpty(cpasword)){
                    msg = "Please confirm your password";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_cpassword);
                    ln.setText(msg);
                }
                if(!(pasword==cpasword)){
                    msg = "Please check the password you have entered";
                    TextView ln = (TextView) findViewById(R.id.confirm_star_cpassword);
                    ln.setText(msg);
                }
            }
        });
    }

}
